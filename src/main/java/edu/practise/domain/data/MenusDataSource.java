package edu.practise.domain.data;

import java.util.List;

public class MenusDataSource {

    private final JsonConverter jsonConverter;

    public MenusDataSource(JsonConverter jsonConverter) {
        this.jsonConverter = jsonConverter;
    }

    public List<Menu> readMenus() {
        String json = "";
        return jsonConverter.fromJson(json);
    }

    public void writeMenus(List<Menu> menus) {
        String jsonMenus = jsonConverter.toJson(menus);

    }
}
