package com.example.android.letsrock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class nineties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
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

    }


}