package edu.practise.domain.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GsonConverter implements JsonConverter {

    private Gson gson;
    private String filePath;

    public GsonConverter(String filePath) {
        gson = new Gson();
        this.filePath = filePath;
    }

    @Override
    public String toJson(Object object) {
        return gson.toJson(object);
    }

    @Override
    public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }

    @Override
    public List<Menu> fromJson() {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, new TypeToken<List<Menu>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeMenus(List<Menu> menus) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(menus, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
