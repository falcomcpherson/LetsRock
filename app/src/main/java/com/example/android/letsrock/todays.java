package com.example.android.letsrock;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class todays extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        this.setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Devil","Shinedown"));
        songs.add(new Song("Human","Rag'n'Bone"));
        songs.add(new Song("The Man","The Killers"));
        songs.add(new Song("High","Sir Sly"));
        songs.add(new Song("Heavydirtysoul","Twenty One Pilots"));
        songs.add(new Song("Still Counting","Volbeat"));
        songs.add(new Song("Walk on Water","30 Seconds to Mars"));
        songs.add(new Song("Dangerous","Big Data"));
        songs.add(new Song("My Name is Human","Higly Suspect"));
        songs.add(new Song("Lights Out","Royal Blood"));

        SongAdapter adapter = new SongAdapter (this, songs);
        ListView listView = (ListView) findViewById(R.id.songList);
        listView.setAdapter ( adapter );
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent = new Intent (todays.this,nowPlayingInterface.class);
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