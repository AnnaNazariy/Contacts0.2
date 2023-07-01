package edu.practise.domain.data;

import java.util.ArrayList;
import java.util.List;

public class BooksDataSource {

    private final JsonConverter jsonConverter;

    public BooksDataSource(JsonConverter jsonConverter) {
        this.jsonConverter = jsonConverter;
    }

    public List<Book> readBooks() {
        //read json from file
        //convert json string to list of Book;
        return jsonConverter.fromJson("");
    }

    public void writeBooks(List<Book> books) {
        //convert list of Book to json
        String jsonBooks = jsonConverter.toJson(books);
        //write json from file

    }
}
