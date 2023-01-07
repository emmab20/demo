package com.example;

public class Author {
    private String name;
    private String[] books;

    // Constructor
    public Author(String name, String[] books) {
        this.name = name;
        this.books = books;
    }

    // Field names
    public String getName() {
        return name;
    }

    public String[] getBooks() {
        return books;
    }
}
