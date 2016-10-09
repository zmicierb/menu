package by.borisevich.menu.dao;

import by.borisevich.menu.dao.util.ListParams;

import java.io.Serializable;
import java.util.List;

/**
 * Created by BorisevichDA on 2016-04-19.
 */
public interface GenericDao<T, ID extends Serializable> {

    ID create(Object entity);

    void update(Object entity);

    void delete(Object entity);

    void createOrUpdate(Object entity);

    Object merge(Object entity);

    T get(ID id);

    void refresh(Object entity);

    List<T> findAll();

    List<T> findAll(ListParams params);

    Long count();
}
