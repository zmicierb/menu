package by.borisevich.menu.controller;

import by.borisevich.menu.controller.dto.MenuDto;
import by.borisevich.menu.controller.dto.Response;
import by.borisevich.menu.domain.Item;
import by.borisevich.menu.domain.Producer;
import by.borisevich.menu.domain.Product;
import by.borisevich.menu.domain.ProductType;
import by.borisevich.menu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by dima on 7/13/16.
 */
@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;

    @Autowired
    private ProducerService producerService;

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/api/menu", method = RequestMethod.GET)
    public ResponseEntity<Response<List<MenuDto>>> getMenu() {

        return ResponseEntity.ok(Response.success(menuService.getMenu()));
    }

    @RequestMapping(value = "/api/menu/product", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Product>>> getProduct() {

        return ResponseEntity.ok(Response.success(productService.findAll()));
    }

    @RequestMapping(value = "/api/menu/productType", method = RequestMethod.GET)
    public ResponseEntity<Response<List<ProductType>>> getProductType() {

        return ResponseEntity.ok(Response.success(productTypeService.findAll()));
    }

    @RequestMapping(value = "/api/menu/producer", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Producer>>> getProducer() {

        return ResponseEntity.ok(Response.success(producerService.findAll()));
    }

    @RequestMapping(value = "/api/menu/item", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Item>>> getItem() {

        return ResponseEntity.ok(Response.success(itemService.findAll()));
    }
}
