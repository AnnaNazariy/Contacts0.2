package edu.practise.domain.data;

import java.util.List;

public interface JsonConverter {

    String toJson(List<Book> books);

    List<Book> fromJson(String books);
}
