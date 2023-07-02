package edu.practise.domain.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class GsonConverter implements JsonConverter {

    private final Gson gson;

    public GsonConverter(Gson gson) {
        this.gson = gson;
    }

    @Override
    public String toJson(List<Menu> menus) {
        return gson.toJson(menus);
    }

    @Override
    public List<Menu> fromJson(String json) {
        TypeToken<List<Menu>> menuListType = new TypeToken<>() {};
        return gson.fromJson(json, menuListType.getType());
    }

    @Override
    public void saveJsonToFile(String jsonMenu, String filePath) {

    }
}
