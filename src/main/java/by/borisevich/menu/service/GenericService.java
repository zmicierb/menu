package by.borisevich.menu.service;

import by.borisevich.menu.dao.util.ListParams;
import by.borisevich.menu.domain.Persistable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by BorisevichDA on 2016-04-21.
 */
public interface GenericService<T extends Persistable<ID>, ID extends Serializable> {
    T get(ID id);

    void refresh(T... entities);

    List<T> findAll();

    List<T> findAll(ListParams params);

    void delete(ID... ids);

    void delete(T... entities);

    T createOrUpdate(T entities);

    T create(T entities);

}
