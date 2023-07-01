package edu.practise.domain.data;

import java.util.List;

public interface JsonConverter {

    String toJson(List<Menu> books);

    List<Menu> fromJson(String books);
}
