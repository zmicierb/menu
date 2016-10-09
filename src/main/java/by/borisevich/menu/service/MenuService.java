package by.borisevich.menu.service;

import by.borisevich.menu.controller.dto.MenuDto;

import java.util.List;

/**
 * Created by dima on 7/13/16.
 */
public interface MenuService {

    List<MenuDto> getMenu();
}
