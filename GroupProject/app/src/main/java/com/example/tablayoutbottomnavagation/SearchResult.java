package com.example.tablayoutbottomnavagation;

public class SearchResult {
    private String title;
    private String author;
    private int coverResId;

    public SearchResult(String title, String author, int coverResId) {
        this.title = title;
        this.author = author;
        this.coverResId = coverResId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCoverResId() {
        return coverResId;
    }
}