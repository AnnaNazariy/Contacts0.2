package edu.practise.domain;

import edu.practise.domain.data.Menu;

import java.util.List;

public interface RestaurantRepository {

    void addBook(Menu book);

    void editBook(Menu book);

    void deleteBook(Menu book);

    List<Menu> searchBook(String criteria);

    void saveChanges();
}
