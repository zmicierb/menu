package by.borisevich.menu.service.impl;

import by.borisevich.menu.dao.ItemDao;
import by.borisevich.menu.domain.Item;
import by.borisevich.menu.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 7/31/16.
 */
@Service
public class ItemServiceImpl extends GenericServiceImpl<Item, Long> implements ItemService {

    @Autowired
    public ItemServiceImpl(ItemDao dao) {
        super(dao);
    }

}
