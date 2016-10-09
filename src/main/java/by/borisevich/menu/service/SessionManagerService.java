package by.borisevich.menu.service;

import by.borisevich.menu.domain.admin.Session;
import org.springframework.security.core.Authentication;

/**
 * Created by dima on 7/13/16.
 */

public interface SessionManagerService {

    /**
     * Аутентификация пользователя в БД
     *
     * @param authentication
     */
    Session authentication(Authentication authentication);

    /**
     * Завершение сеанса работы текущего пользователя с БД
     */
//    void logout();

    /**
     * Завершение сеанса работы пользователя с БД
     *
     * @param session
     */
    void kill(Session session);

}
