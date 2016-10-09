package by.borisevich.menu.service.impl;

import by.borisevich.menu.controller.dto.MenuDto;
import by.borisevich.menu.dao.ProductDao;
import by.borisevich.menu.domain.Item;
import by.borisevich.menu.domain.LnkProductTypeProducer;
import by.borisevich.menu.domain.Product;
import by.borisevich.menu.domain.ProductType;
import by.borisevich.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 7/13/16.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private ProductDao productDao;

    public List<MenuDto> getMenu() {

        List<MenuDto> menu = new ArrayList<MenuDto>();

        List<Product> products = productDao.findAll();

        for (Product product : products) {
            MenuDto menuProduct = new MenuDto();
            menuProduct.setId(product.getId());
            menuProduct.setName(product.getName());
            List<MenuDto> subMenu = new ArrayList<MenuDto>();
            menuProduct.setSubMenu(subMenu);
            for (ProductType productType : product.getProductType()) {
                MenuDto menuProductType = new MenuDto();
                menuProductType.setId(productType.getId().getId());
                menuProductType.setName(productType.getName());
                List<MenuDto> subMenuProducer = new ArrayList<MenuDto>();
                menuProductType.setSubMenu(subMenuProducer);
                for (LnkProductTypeProducer producer : productType.getLnkProductTypeProducers()) {
                    MenuDto menuProducer = new MenuDto();
                    menuProducer.setId(producer.getProducer().getId());
                    menuProducer.setName(producer.getProducer().getName());
                    List<MenuDto> subMenuItem = new ArrayList<MenuDto>();
                    menuProducer.setSubMenu(subMenuItem);
                    for (Item item : producer.getItems()) {
                        MenuDto menuItem = new MenuDto();
                        menuItem.setId(item.getId());
                        menuItem.setName(item.getName());
                        subMenuItem.add(menuItem);
                    }
                    subMenuProducer.add(menuProducer);
                }
                subMenu.add(menuProductType);
            }
            menu.add(menuProduct);
        }

        return menu;
    }
}
