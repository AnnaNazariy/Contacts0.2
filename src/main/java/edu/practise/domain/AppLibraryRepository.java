package edu.practise.domain;

import edu.practise.domain.data.Book;
import edu.practise.domain.data.BooksDataSource;

import java.util.ArrayList;
import java.util.List;

public class AppLibraryRepository implements LibraryRepository {

    private final BooksDataSource booksDataSource;

    private final List<Book> books;

    public AppLibraryRepository(BooksDataSource booksDataSource, List<Book> books) {
        this.booksDataSource = booksDataSource;
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        //add book
    }

    @Override
    public void editBook(Book book) {
        //edit book
    }

    @Override
    public void deleteBook(Book book) {
        //delete book
    }

    @Override
    public List<Book> searchBook(String criteria) {
        return new ArrayList<>();
    }

    @Override
    public void saveChanges() {
        booksDataSource.writeBooks(books);
    }
}
