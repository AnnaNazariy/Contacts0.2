package edu.practise.domain.data;

import java.time.LocalDate;
import java.util.List;

public record Author(String name, String surName, LocalDate birthDate) {
}
