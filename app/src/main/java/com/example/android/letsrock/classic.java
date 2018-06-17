package com.example.android.letsrock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class classic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Bohemian Rhapsody","Queen"));
        songs.add(new Song("Don't Stop Believing","Journey"));
        songs.add(new Song("Hotel California","Eagles"));
        songs.add(new Song("Africa","Toto"));
        songs.add(new Song("It's My Life","Bon Jovi"));
        songs.add(new Song("Welcome to the Jungle","Guns N' Roses"));
        songs.add(new Song("Rock & Roll All Night","Kiss"));
        songs.add(new Song("Highway to Hell","ACDC"));
        songs.add(new Song("Crazy Train","Ozzy Osbourne"));
        songs.add(new Song("Roll With the Changes","REO Speedwagon"));

        SongAdapter adapter = new SongAdapter (this, songs);

        ListView listView = (ListView) findViewById(R.id.songList);

        listView.setAdapter ( adapter );

    }


}