package by.borisevich.menu.security;

import by.borisevich.menu.service.SessionManagerService;
import by.borisevich.menu.dao.util.StoredProcedureReturnException;
import by.borisevich.menu.domain.admin.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 7/13/16.
 */

@Component
public class DBAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private SessionManagerService sessionManagerService;

    private static final Logger log = LoggerFactory.getLogger(DBAuthenticationProvider.class);

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        Session session = null;

        try {
            session = sessionManagerService.authentication(authentication);
        } catch (StoredProcedureReturnException | IllegalArgumentException e) {
            log.debug(e.getMessage());
            throw new AuthenticationServiceException(e.getMessage(), e);
        }

        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
//            grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER")); TODO добавить список ролей пользователя
        User user = new User(authentication.getName(), authentication.getCredentials().toString(), grantedAuths);
        Authentication auth = new DBAuthenticationToken(user, authentication.getCredentials().toString(), grantedAuths, session);
        return auth;
    }

    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}

