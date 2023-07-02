package edu.practise.domain;

import edu.practise.domain.data.Menu;

import java.util.List;

public interface RestaurantRepository {
    void addMenu(Menu menu);
    void editMenu(Menu menu);
    void deleteMenu(Menu menu);
    List<Menu> searchMenu(String criteria);
    void saveChanges();
}
