package edu.practise.presentation;

import edu.practise.domain.data.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\Desktop\\java\\practice-sample-main\\src\\main\\java\\edu\\practise\\domain\\data\\Menu.json";
        GsonConverter gsonConverter = new GsonConverter("C:\\Users\\user\\Desktop\\java\\practice-sample-main\\src\\main\\java\\edu\\practise\\domain\\data\\Menu.json");
        MenusDataSource dataSource = new MenusDataSource(gsonConverter, filePath);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть свій статус (1 - Адміністратор, 2 - Клієнт):");
        int status = scanner.nextInt();

        if (status == 1) {
            AdminMenu adminMenu = new AdminMenu(dataSource);
            adminMenu.displayMenu();
        } else if (status == 2) {
            CustomerMenu customerMenu = new CustomerMenu(dataSource);
            customerMenu.displayMenu();
        } else {
            System.out.println("Невірний статус. Будь ласка, виберіть 1 або 2.");
        }
    }
}
