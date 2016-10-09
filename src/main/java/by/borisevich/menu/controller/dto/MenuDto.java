package by.borisevich.menu.controller.dto;

import java.util.List;

/**
 * Created by dima on 7/10/16.
 */
public class MenuDto {

    private long id;

    private String name;

    private String href;

    private List<MenuDto> subMenu;

    public MenuDto() {
    }

    public MenuDto(long id, String name, List<MenuDto> subMenu) {
        this.id = id;
        this.name = name;
        this.subMenu = subMenu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuDto> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<MenuDto> subMenu) {
        this.subMenu = subMenu;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
