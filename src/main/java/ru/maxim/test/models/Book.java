package ru.maxim.test.models;

import java.util.UUID;

public class Book {

    private final UUID id;
    private String title;
    private String author;


    public Book(UUID id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public UUID getId() {
        return id;
    }
}
