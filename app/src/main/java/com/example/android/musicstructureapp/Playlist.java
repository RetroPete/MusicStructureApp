package com.example.android.musicstructureapp;

public class Playlist {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mTitle;

    private String mNameArtist;

    private String mNameAlbum;

    private int mImageAlbum = NO_IMAGE_PROVIDED;

    public Playlist(String title, String nameArtist, String nameAlbum, int imageResourceId) {
        mTitle = title;
        mNameArtist = nameArtist;
        mNameAlbum = nameAlbum;
        mImageAlbum = imageResourceId;
    }

    public Playlist(String title, String nameArtist) {

        mTitle = title;
        mNameArtist = nameArtist;
    }

    public String getNameArtist() {
        return mNameArtist;
    }

    public String getNameAlbum() {
        return mNameAlbum;
    }

    public String getTitle() {
        return mTitle;
    }

    public Integer getImageResourceId() {
        return mImageAlbum;
    }

    public boolean hasImage() {

        return mImageAlbum != NO_IMAGE_PROVIDED;
    }
}
