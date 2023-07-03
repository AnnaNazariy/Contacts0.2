package edu.practise.domain.data;

import java.util.List;

public interface JsonConverter {

    String toJson(Object object);

    <T> T fromJson(String json, Class<T> classOfT);

    List<Menu> fromJson();
}
