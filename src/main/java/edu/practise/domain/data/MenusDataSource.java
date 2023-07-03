package edu.practise.domain.data;

import java.util.List;

public class MenusDataSource {
    private final JsonConverter jsonConverter;

    public MenusDataSource(GsonConverter gsonConverter, String filePath) {
        this.jsonConverter = new GsonConverter("C:\\Users\\user\\Desktop\\java\\practice-sample-main\\src\\main\\java\\edu\\practise\\domain\\data\\Menu.json");
    }

    public MenusDataSource(GsonConverter gsonConverter, String filePath, JsonConverter jsonConverter) {
        this.jsonConverter = jsonConverter;
    }

    public List<Menu> readMenus() {
        return jsonConverter.fromJson();
    }

    public void writeMenus(List<Menu> menus) {
        String jsonMenus = jsonConverter.toJson(menus);
    }

    public void addMenu(Menu newMenu) {
    }

    public void removeMenu(Menu menuToRemove) {
    }

    public List<Menu> getMenus() {
        return null;
    }
}
