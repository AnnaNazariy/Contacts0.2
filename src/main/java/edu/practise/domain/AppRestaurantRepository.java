package edu.practise.domain;

import edu.practise.domain.data.Menu;
import edu.practise.domain.data.MenusDataSource;

import java.util.ArrayList;
import java.util.List;

public class AppRestaurantRepository implements RestaurantRepository {

    private final MenusDataSource menusDataSource;
    private final List<Menu> menus;

    public AppRestaurantRepository(MenusDataSource menusDataSource, List<Menu> menus) {
        this.menusDataSource = menusDataSource;
        this.menus = menus;
    }

    @Override
    public void addMenu(Menu menu) {
        // Додати меню
    }

    @Override
    public void editMenu(Menu menu) {
        // Редагувати меню
    }

    @Override
    public void deleteMenu(Menu menu) {
        // Видалити меню
    }

    @Override
    public List<Menu> searchMenu(String criteria) {
        return new ArrayList<>();
    }

    @Override
    public List<Menu.MenuItem> getMenuItems() {
        List<Menu.MenuItem> menuItems = new ArrayList<>();
        for (Menu menu : menus) {
            menuItems.addAll(menu.getMenuItems());
        }
        return menuItems;
    }

    @Override
    public void saveChanges() {
        menusDataSource.writeMenus(menus);
    }
}
