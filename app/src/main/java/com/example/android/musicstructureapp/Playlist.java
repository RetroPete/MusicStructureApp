package com.example.android.musicstructureapp;

public class Playlist {

    /**
     * Constant value that represents no image was provided for this composer
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * composition name
     */

    private String mTitle;
    /**
     * name of ot the composer
     */

    private String mNameArtist;

    private String mNameAlbum;

    /**
     * Id for proper picture
     */
    private int mImageAlbum = NO_IMAGE_PROVIDED;

    public Playlist(String title, String nameArtist, String nameAlbum,  int imageResourceId) {
        mTitle = title;
        mNameArtist = nameArtist;
        mNameAlbum = nameAlbum;
        mImageAlbum = imageResourceId;
    }

    public Playlist(String title, String nameArtist) {

        mTitle = title;
        mNameArtist = nameArtist;
    }

    /**
     * get 1st name of composer
     */
    public String getNameArtist() {
        return mNameArtist;
    }

    public String getNameAlbum() {
        return mNameAlbum;
    }

    /**
     * get surname of composition
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * get 1image ID of composer
     */
    public Integer getImageResourceId() {
        return mImageAlbum;
    }


    /**
     * returns whether ot not there is an image for composer
     */
    public boolean hasImage() {

        return mImageAlbum != NO_IMAGE_PROVIDED;
    }
}
