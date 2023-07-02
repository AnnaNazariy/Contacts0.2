package edu.practise.presentation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.practise.domain.AppRestaurantRepository;
import edu.practise.domain.RestaurantRepository;
import edu.practise.domain.data.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        JsonConverter gsonConverter = new GsonConverter(gson);
        MenusDataSource menusDataSource = new MenusDataSource(gsonConverter);
        List<Menu> menus = menusDataSource.readMenus();
        RestaurantRepository restaurantRepository = new AppRestaurantRepository(menusDataSource, menus);


        List<Menu.MenuItem> menuItems = restaurantRepository.getMenuItems();
        for (Menu.MenuItem menuItem : menuItems) {
            System.out.println("Назва: " + menuItem.getName());
            System.out.println("Ціна: " + menuItem.getPrice());
            System.out.println();
        }
    }
}
