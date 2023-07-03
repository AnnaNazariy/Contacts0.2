package edu.practise.domain.data;

import java.util.List;
import java.util.Scanner;

public class CustomerMenu {
    private MenusDataSource dataSource;

    public CustomerMenu(MenusDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void displayMenu() {
        System.out.println("Ви увійшли в режим перегляду цін як клієнт.");
        // Додатковий код для виведення інформації про меню клієнта
        List<Menu> menus = dataSource.readMenus();
        System.out.println("Меню ресторану:");
        for (Menu menu : menus) {
            System.out.println(menu.getName() + " - " + menu.getPrice());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву страви:");
        String dishName = scanner.nextLine();

        for (Menu menu : menus) {
            if (menu.getName().equals(dishName)) {
                System.out.println("Ціна страви " + dishName + " - " + menu.getPrice());
                return;
            }
        }
        System.out.println("Страва з назвою " + dishName + " не знайдена.");
    }
}
