package edu.practise.presentation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.practise.domain.AppRestaurantRepository;
import edu.practise.domain.RestaurantRepository;
import edu.practise.domain.data.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        JsonConverter gsonConverter = new GsonConverter(gson);
        BooksDataSource booksDataSource = new BooksDataSource(gsonConverter);
        List<Menu> books = booksDataSource.readBooks();
        RestaurantRepository libraryRepository = new AppRestaurantRepository(booksDataSource, books);



    }
}
