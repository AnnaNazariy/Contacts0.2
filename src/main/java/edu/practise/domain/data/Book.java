package edu.practise.domain.data;

import java.time.LocalDate;

public record Book(String title, Author author, String isbn, LocalDate publicationDate, String publisher) {
}
