package com.example.android.letsrock;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class nowPlayingInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_now_playing );
        this.setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        updatePlayingInfo ();
    }

    public void updatePlayingInfo() {
        Intent nowPlayingIntent = getIntent();
        Bundle extras = nowPlayingIntent.getExtras();
        String playingArtist = extras.getString ("playingArtist");
        String playingSong = extras.getString ( "playingSong");
        TextView nowPlayingSongView = (TextView) findViewById ( R.id.nowPlayingSong );
        nowPlayingSongView.setText (playingSong);
        TextView nowPlayingArtistView = (TextView) findViewById ( R.id.nowPlayingArtist );
        nowPlayingArtistView.setText ( playingArtist );
    }

}
