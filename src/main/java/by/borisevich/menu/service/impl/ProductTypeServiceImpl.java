package by.borisevich.menu.service.impl;

import by.borisevich.menu.dao.ProductTypeDao;
import by.borisevich.menu.domain.ProductType;
import by.borisevich.menu.domain.ProductTypePK;
import by.borisevich.menu.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 7/31/16.
 */
@Service
public class ProductTypeServiceImpl extends GenericServiceImpl<ProductType, ProductTypePK> implements ProductTypeService {

    @Autowired
    public ProductTypeServiceImpl(ProductTypeDao dao) {
        super(dao);
    }

}
