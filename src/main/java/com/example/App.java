package com.example;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String[] books = { "The Lord of the Rings", "The Hobbit", "Unfinished Tales" };
        Author author = new Author("J.R.R. Tolkien", books);

        // Display out the author's name and books
        System.out.println("Books written by: " + author.getName() + ": " + Arrays.toString(author.getBooks()));
    }

}