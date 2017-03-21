package com.example.johnnylee.booklistingapp;

/**
 * Created by johnnylee on 3/21/17.
 */

public class Book {


    private String mTitle;
    private String mAuthors;
    private String mInfoLink;
    private String mThumbnailLink;

    public String getTitle() {
        return mTitle;
    }

    public String getAuthors() {
        return mAuthors;
    }

    public String getInfoLink() {
        return mInfoLink;
    }

    public String getThumbnailLink() {return mThumbnailLink;}


    public Book(String title, String authors, String infoLink) {
        this.mTitle = title;
        this.mAuthors = authors;
        this.mInfoLink = infoLink;
    }

    public Book(String title, String authors, String infoLink, String thumbnailLink) {
        this.mTitle = title;
        this.mAuthors = authors;
        this.mInfoLink = infoLink;
        this.mThumbnailLink = thumbnailLink;
    }
}
