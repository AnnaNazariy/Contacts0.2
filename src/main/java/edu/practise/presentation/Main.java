package edu.practise.presentation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.practise.domain.AppLibraryRepository;
import edu.practise.domain.LibraryRepository;
import edu.practise.domain.data.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        JsonConverter gsonConverter = new GsonConverter(gson);
        BooksDataSource booksDataSource = new BooksDataSource(gsonConverter);
        List<Book> books = booksDataSource.readBooks();
        LibraryRepository libraryRepository = new AppLibraryRepository(booksDataSource, books);



    }
}
