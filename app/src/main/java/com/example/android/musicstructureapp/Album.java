package com.example.android.musicstructureapp;

public class Album {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mNameAlbum;

    private int mImageAlbum = NO_IMAGE_PROVIDED;

    public Album(String nameAlbum, int imageResourceId) {
        mNameAlbum = nameAlbum;
        mImageAlbum = imageResourceId;
    }

    public Album(String nameAlbum) {
        mNameAlbum = nameAlbum;
    }

    public String getNameAlbum() {
        return mNameAlbum;
    }

    public Integer getImageResourceId() {
        return mImageAlbum;
    }

    public boolean hasImage() {

        return mImageAlbum != NO_IMAGE_PROVIDED;
    }
}
