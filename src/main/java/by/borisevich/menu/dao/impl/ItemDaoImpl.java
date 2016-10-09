package by.borisevich.menu.dao.impl;

import by.borisevich.menu.dao.ItemDao;
import by.borisevich.menu.domain.Item;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */
@Repository
public class ItemDaoImpl extends GenericDaoImpl<Item, Long> implements ItemDao {

    public ItemDaoImpl() {
        super(Item.class);
    }

    ;

}
