package edu.practise.domain.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class GsonConverter implements JsonConverter {

    private final Gson gson;

    public GsonConverter(Gson gson) {
        this.gson = gson;
    }

    @Override
    public String toJson(List<Book> books) {
        return gson.toJson(books);
    }

    @Override
    public List<Book> fromJson(String books) {
        TypeToken<List<Book>> booksType = new TypeToken<>(){};
        return gson.fromJson(books, booksType);
    }
}
