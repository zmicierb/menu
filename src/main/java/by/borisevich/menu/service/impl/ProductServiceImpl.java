package by.borisevich.menu.service.impl;

import by.borisevich.menu.dao.ProductDao;
import by.borisevich.menu.domain.Product;
import by.borisevich.menu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 7/31/16.
 */
@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Long> implements ProductService {

    @Autowired
    public ProductServiceImpl(ProductDao dao) {
        super(dao);
    }

}
