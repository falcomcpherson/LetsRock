package com.example.android.letsrock;

public class nowPlaying {
    private String mPlayingSongName;
    private String mPlayingArtist;

    public nowPlaying(String playingSong, String playingArtist){
        mPlayingSongName = playingSong;
        mPlayingArtist = playingArtist;
    }
    public String getSongName() {
        return mPlayingSongName;
    }
    public String getArtist() {
        return mPlayingArtist;
    }
}