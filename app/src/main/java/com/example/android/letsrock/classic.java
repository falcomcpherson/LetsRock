package com.example.android.letsrock;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class classic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        this.setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final ArrayList<Song> songs = new ArrayList<Song>();
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent = new Intent (classic.this,nowPlayingInterface.class);
                String getPlayingSong = songs.get(position).getSongName();
                String getPlayingArtist = songs.get(position).getArtist();
                Bundle extras = new Bundle();
                extras.putString ("playingArtist", getPlayingArtist);
                extras.putString("playingSong", getPlayingSong );
                nowPlayingIntent.putExtras(extras);
                startActivity(nowPlayingIntent);
            }
        });
    }
}