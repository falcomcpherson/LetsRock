package com.example.android.letsrock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class nineties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Black Hole Sun","Soundgarden"));
        songs.add(new Song("Creep","Radiohead"));
        songs.add(new Song("Smells Like Teen Spirit","Nirvana"));
        songs.add(new Song("Killing in the Name","Rage against The Machine"));
        songs.add(new Song("Santa Monica","Everclear"));
        songs.add(new Song("Loser","Beck"));
        songs.add(new Song("Hurt","Nine Inch Nails"));
        songs.add(new Song("Undone, The Sweater Song","Weezer"));
        songs.add(new Song("Glycerine","Bush"));
        songs.add(new Song("Mr. Jones","Counting Crows"));

        SongAdapter adapter = new SongAdapter (this, songs);
        ListView listView = (ListView) findViewById(R.id.songList);
        listView.setAdapter ( adapter );
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent = new Intent (nineties.this,nowPlayingInterface.class);
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