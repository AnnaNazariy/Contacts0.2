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
        List<Menu> menus = dataSource.readMenus();
        System.out.println("Меню ресторану:");
        for (int i = 0; i < menus.size(); i++) {
            Menu menu = menus.get(i);
            System.out.println((i + 1) + ". " + menu.getName());
        }

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Введіть номер страви або 'exit' для виходу: ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Ви вийшли з меню.");
                break;
            }

            try {
                int dishNumber = Integer.parseInt(choice);
                if (dishNumber >= 1 && dishNumber <= menus.size()) {
                    Menu selected = menus.get(dishNumber - 1);
                    System.out.println("Обрана страва: " + selected.getName());
                    System.out.println("Ціна страви: " + selected.getPrice() + "₴");
                } else {
                    System.out.println("Невірний номер страви. Спробуйте ще раз.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Невірний ввід. Спробуйте ще раз.");
            }
        } while (true);
    }
}
