package com.example.android.musicplayerapp;

public class Songs {
    //Name of songs
    private String mSongs;

    //Name of Album
    private String mAlbum;

    //Play Image (Drawable Resource ID)
    private int mImageResourceId;

    public Songs(String SongName, String AlbumName, int ImageID) {
        mSongs = SongName;
        mAlbum = AlbumName;
        mImageResourceId = ImageID;
    }

    public String getmSongs() {
        return mSongs;
    }

    public String getmAlbum() {
        return mAlbum;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
