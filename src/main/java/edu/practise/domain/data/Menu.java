package edu.practise.domain.data;

import java.time.LocalDate;

public record Menu(String title, String isbn, LocalDate publicationDate, String publisher) {
}
