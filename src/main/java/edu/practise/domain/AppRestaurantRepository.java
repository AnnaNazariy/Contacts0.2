package edu.practise.domain;

import edu.practise.domain.data.Menu;
import edu.practise.domain.data.BooksDataSource;

import java.util.ArrayList;
import java.util.List;

public class AppRestaurantRepository implements RestaurantRepository {

    private final BooksDataSource booksDataSource;

    private final List<Menu> books;

    public AppRestaurantRepository(BooksDataSource booksDataSource, List<Menu> books) {
        this.booksDataSource = booksDataSource;
        this.books = books;
    }

    @Override
    public void addBook(Menu book) {
        //add book
    }

    @Override
    public void editBook(Menu book) {
        //edit book
    }

    @Override
    public void deleteBook(Menu book) {
        //delete book
    }

    @Override
    public List<Menu> searchBook(String criteria) {
        return new ArrayList<>();
    }

    @Override
    public void saveChanges() {
        booksDataSource.writeBooks(books);
    }
}
