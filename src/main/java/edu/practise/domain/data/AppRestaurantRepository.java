package edu.practise.domain.data;

public class AppRestaurantRepository {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\Desktop\\java\\practice-sample-main\\src\\main\\java\\edu\\practise\\domain\\data\\Menu.json";
        MenusDataSource dataSource = new MenusDataSource(new GsonConverter("C:\\Users\\user\\Desktop\\java\\practice-sample-main\\src\\main\\java\\edu\\practise\\domain\\data\\Menu.json"), filePath);

        AdminMenu adminMenu = new AdminMenu(dataSource);
        adminMenu.displayMenu();
    }
}
