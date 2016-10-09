package by.borisevich.menu.dao.impl;

import by.borisevich.menu.dao.ProductTypeDao;
import by.borisevich.menu.domain.ProductType;
import by.borisevich.menu.domain.ProductTypePK;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 7/13/16.
 */
@Repository
public class ProductTypeDaoImpl extends GenericDaoImpl<ProductType, ProductTypePK> implements ProductTypeDao {

    public ProductTypeDaoImpl() {
        super(ProductType.class);
    }

    ;

}
