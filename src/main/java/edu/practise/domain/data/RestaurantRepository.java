package edu.practise.domain.data;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {
    private List<Menu> menus;

    public RestaurantRepository() {
        menus = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void removeMenu(Menu menu) {
        menus.remove(menu);
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void displayMenus() {
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }

}
