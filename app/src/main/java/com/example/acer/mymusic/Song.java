package com.example.acer.mymusic;

import android.graphics.Bitmap;

/**
 * Created by Acer on 10/15/2015.
 */
public class Song {
    private long id;
    private String title;
    private String artist;
    Bitmap coverArt;
    public Song(long songID, String songTitle, String songArtist,Bitmap bm) {
        id=songID;
        title=songTitle;
        artist=songArtist;
        coverArt=bm;
    }
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

    public Bitmap getCoverArt() {
        return coverArt;
    }
}
