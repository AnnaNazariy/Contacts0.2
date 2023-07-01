package edu.practise.domain.data;

import java.util.Scanner;

public class Client {
    private Menu menu;

    public Client() {
        menu = new Menu();
    }

    public void enterMenuItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть назву страви:");
        String name = scanner.nextLine();
        System.out.println("Введіть ціну страви:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Очищення буфера введення

        Menu.MenuItem menuItem = new Menu.MenuItem(name, price);
        menu.addMenuItem(menuItem);
    }
}
