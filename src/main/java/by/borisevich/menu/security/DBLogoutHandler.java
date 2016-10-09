package by.borisevich.menu.security;

import by.borisevich.menu.controller.SessionAttribute;
import by.borisevich.menu.service.SessionManagerService;
import by.borisevich.menu.domain.admin.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dima on 7/13/16.
 */

@Component
public class DBLogoutHandler implements LogoutHandler {

    @Autowired
    private SessionManagerService sessionManagerService;

    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
//        Session session = (Session) WebUtils.getSessionAttribute(request, SessionAttribute.SESSION_DATA);
//        WebUtils.setSessionAttribute(request, SessionAttribute.DEBUG_LEVEL, request.getIntHeader("debug"));

//        sessionManagerService.logout();

        Session session = (Session) WebUtils.getSessionAttribute(request, SessionAttribute.SESSION_DATA);

        sessionManagerService.kill(session);

        WebUtils.setSessionAttribute(request, SessionAttribute.SESSION_DATA, null);
        WebUtils.setSessionAttribute(request, SessionAttribute.PROFILE, null);
//        WebUtils.setSessionAttribute(request, SessionAttribute.DEBUG_LEVEL, null);
    }
}
