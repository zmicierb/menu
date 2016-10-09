package by.borisevich.menu.dao.admin.impl;

import by.borisevich.menu.domain.admin.Department;
import by.borisevich.menu.dao.admin.DepartmentDao;
import by.borisevich.menu.dao.impl.GenericDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */

@Repository
public class DepartmentDaoImpl extends GenericDaoImpl<Department, Long> implements DepartmentDao {

    public DepartmentDaoImpl() {
        super(Department.class);
    }
}
