package com.example.tablayoutbottomnavagation;

import java.util.List;

public class Category {
    private String title;
    private List<Book> books;

    public Category(String title, List<Book> books) {
        this.title = title;
        this.books = books;
    }

    public String getTitle() {
        return title;
    }

    public List<Book> getBooks() {
        return books;
    }
}