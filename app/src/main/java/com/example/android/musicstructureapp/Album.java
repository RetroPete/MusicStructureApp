package com.example.android.musicstructureapp;

public class Album {

    /**
     * Constant value that represents no image was provided for category
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * name of the category
     */
    private String mNameAlbum;

    /**
     * Id for proper picture
     */
    private int mImageAlbum = NO_IMAGE_PROVIDED;

    /**
     * Create new Composer Object
     *
     * @param nameAlbum    is name of music category
     * @param imageResourceId is ID for proper image
     */
    public Album(String nameAlbum, int imageResourceId) {
        mNameAlbum = nameAlbum;
        mImageAlbum = imageResourceId;
    }

    public Album(String nameAlbum) {
        mNameAlbum = nameAlbum;
    }

    /**
     * get 1st name of composer
     */
    public String getNameAlbum() {
        return mNameAlbum;
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
