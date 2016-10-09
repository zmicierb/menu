package by.borisevich.menu.dao.admin.impl;

import by.borisevich.menu.dao.admin.LoginDao;
import by.borisevich.menu.domain.admin.Login;
import by.borisevich.menu.dao.impl.GenericDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */

@Repository
public class LoginDaoImpl extends GenericDaoImpl<Login, String> implements LoginDao {

    public LoginDaoImpl() {
        super(Login.class);
    }
}
