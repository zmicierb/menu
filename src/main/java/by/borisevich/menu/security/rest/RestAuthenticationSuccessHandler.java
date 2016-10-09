package by.borisevich.menu.security.rest;

import by.borisevich.menu.controller.SessionAttribute;
import by.borisevich.menu.controller.dto.Response;
import by.borisevich.menu.domain.admin.Session;
import by.borisevich.menu.security.DBAuthenticationToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dima on 7/13/16.
 */

public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    public RestAuthenticationSuccessHandler() {
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {

        DBAuthenticationToken authenticationToken = (DBAuthenticationToken) authentication;
        Session sessionData = authenticationToken.getSessionContext();

        WebUtils.setSessionAttribute(request, SessionAttribute.SESSION_DATA, sessionData);
        WebUtils.setSessionAttribute(request, SessionAttribute.PROFILE, sessionData.getLogin());

        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().print(mapper.writeValueAsString(Response.success(sessionData.getLogin())));
        response.getWriter().flush();

    }

}
