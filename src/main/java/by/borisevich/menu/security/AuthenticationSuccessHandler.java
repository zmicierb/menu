package by.borisevich.menu.security;

import by.borisevich.menu.controller.SessionAttribute;
import by.borisevich.menu.domain.admin.Session;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dima on 7/13/16.
 */

@Component
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

//    @Autowired
//    private SessionManagerService sessionManagerService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        DBAuthenticationToken authenticationToken = (DBAuthenticationToken) authentication;
        Session sessionData = authenticationToken.getSessionContext();

        WebUtils.setSessionAttribute(request, SessionAttribute.SESSION_DATA, sessionData);
        WebUtils.setSessionAttribute(request, SessionAttribute.PROFILE, sessionData.getLogin());
//        WebUtils.setSessionAttribute(request, SessionAttribute.USER_MENU, sessionData.getMenu());

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
