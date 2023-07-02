package edu.practise.domain.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.practise.domain.data.JsonConverter;
import edu.practise.domain.data.Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private Menu menu;
    private JsonConverter jsonConverter;

    public Admin() {
        menu = new Menu();
        jsonConverter = new JsonConverterImpl(new Gson());
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
        String jsonMenu = jsonConverter.toJson((List<Menu>) menu);
        String filePath = "C:\\Users\\user\\Desktop\\java\\practice-sample-main\\src\\main\\java\\edu\\practise\\domain\\data\\Menu.json";
        jsonConverter.saveJsonToFile(jsonMenu, filePath);
    }

    private static class JsonConverterImpl implements JsonConverter {

        private final Gson gson;

        public JsonConverterImpl(Gson gson) {
            this.gson = gson;
        }

        @Override
        public String toJson(List<Menu> menus) {
            return gson.toJson(menus);
        }

        @Override
        public List<Menu> fromJson(String json) {
            TypeToken<List<Menu>> menuListType = new TypeToken<>(){};
            return gson.fromJson(json, menuListType.getType());
        }

        public void saveJsonToFile(String json, String filePath) {
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
