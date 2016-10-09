package by.borisevich.menu.dao.impl;

import by.borisevich.menu.dao.ProductDao;
import by.borisevich.menu.domain.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */
@Repository
public class ProductDaoImpl extends GenericDaoImpl<Product, Long> implements ProductDao {

    public ProductDaoImpl() {
        super(Product.class);
    }

    ;

}
