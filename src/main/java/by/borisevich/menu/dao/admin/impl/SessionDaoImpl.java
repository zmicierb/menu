package by.borisevich.menu.dao.admin.impl;

import by.borisevich.menu.dao.admin.SessionDao;
import by.borisevich.menu.dao.impl.GenericDaoImpl;
import by.borisevich.menu.domain.admin.Session;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */

@Repository
public class SessionDaoImpl extends GenericDaoImpl<Session, String> implements SessionDao {

    public SessionDaoImpl() {
        super(Session.class);
    }
}
