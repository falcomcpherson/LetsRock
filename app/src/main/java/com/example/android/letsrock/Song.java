package com.example.android.letsrock;

public class Song {
    private String mSongName;
    private String mArtist;

    public Song(String songName, String artist){
        mSongName = songName;
        mArtist = artist;
    }
    public String getSongName() {
        return mSongName;
    }
    public String getArtist() {
        return mArtist;
    }
}
