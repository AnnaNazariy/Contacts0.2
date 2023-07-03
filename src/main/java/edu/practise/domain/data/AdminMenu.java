package edu.practise.domain.data;

import java.util.List;
import java.util.Scanner;

public class AdminMenu {
    private MenusDataSource dataSource;

    public AdminMenu(MenusDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void displayMenu() {
        System.out.println("Ви увійшли в режим редагування меню як адміністратор.");

        List<Menu> menus = dataSource.readMenus();
        System.out.println("Меню ресторану:");
        for (Menu menu : menus) {
            System.out.println(menu.getName() + " - " + menu.getPrice());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть дію (1 - Додати страву, 2 - Видалити страву):");
        int action = scanner.nextInt();

        if (action == 1) {
            addMenu();
        } else if (action == 2) {
            removeMenu();
        } else {
            System.out.println("Невірна дія. Будь ласка, виберіть 1 або 2.");
        }
    }

    private void addMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву страви:");
        String dishName = scanner.nextLine();

        System.out.println("Введіть ціну страви:");
        double dishPrice = scanner.nextDouble();

        Menu newMenu = new Menu(dishName, dishPrice);
        dataSource.addMenu(newMenu);
        dataSource.writeMenus(dataSource.getMenus());

        System.out.println("Страва успішно додана до меню.");
        displayMenu();
    }

    private void removeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву страви, яку потрібно видалити:");
        String dishName = scanner.nextLine();

        List<Menu> menus = dataSource.getMenus();
        Menu menuToRemove = null;

        for (Menu menu : menus) {
            if (menu.getName().equals(dishName)) {
                menuToRemove = menu;
                break;
            }
        }

        if (menuToRemove != null) {
            dataSource.removeMenu(menuToRemove);
            dataSource.writeMenus(dataSource.getMenus());

            System.out.println("Страва успішно видалена з меню.");
            displayMenu();
        } else {
            System.out.println("Страва з назвою " + dishName + " не знайдена.");
        }
    }


}
