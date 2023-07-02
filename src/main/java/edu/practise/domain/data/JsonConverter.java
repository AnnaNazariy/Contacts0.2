package edu.practise.domain.data;

import java.util.List;

public interface JsonConverter {
    String toJson(List<Menu> menus);
    List<Menu> fromJson(String json);

    void saveJsonToFile(String jsonMenu, String filePath);
}
