package edu.practise.domain;

import edu.practise.domain.data.Book;

import java.util.List;

public interface LibraryRepository {

    void addBook(Book book);

    void editBook(Book book);

    void deleteBook(Book book);

    List<Book> searchBook(String criteria);

    void saveChanges();
}
