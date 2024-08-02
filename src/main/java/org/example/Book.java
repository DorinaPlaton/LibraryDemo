package org.example;

public class Book extends LibraryItem {
    private String isbn;

    public Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }

    @Override
    public String getDescription() {
        return "Description of a book here";
    }
}
