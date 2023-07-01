package edu.practise.domain.data;

import java.util.Scanner;

public class Admin {
    private Menu menu;
    private JsonConverter jsonConverter;

    public Admin() {
        menu = new Menu();
        jsonConverter = new JsonConverter();
    }

    public void handleAdminActions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть дію:");
        System.out.println("1. Додати страву до меню");
        System.out.println("2. Видалити страву з меню");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера введення

        switch (choice) {
            case 1:
                addMenuItem();
                break;
            case 2:
                deleteMenuItem();
                break;
            default:
                System.out.println("Неправильний вибір!");
        }

        saveMenu();
    }

    private void addMenuItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть назву страви:");
        String name = scanner.nextLine();
        System.out.println("Введіть ціну страви:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Очищення буфера введення

        Menu.MenuItem menuItem = new Menu.MenuItem(name, price);
        menu.addMenuItem(menuItem);
    }

    private void deleteMenuItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер страви, яку потрібно видалити:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера введення

        menu.deleteMenuItem(index);
    }

    private void saveMenu() {
        String jsonMenu = jsonConverter.toJson(menu);
        // Збереження jsonMenu до файлу або бази даних
    }
}
