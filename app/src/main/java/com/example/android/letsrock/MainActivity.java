package com.example.android.letsrock;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        TextView classic = (TextView) findViewById(R.id.classic);
        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent classicIntent = new Intent(MainActivity.this, classic.class);
                startActivity(classicIntent);
            }
        });

        TextView nineties = (TextView) findViewById(R.id.nineties);
        nineties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ninetiesIntent = new Intent(MainActivity.this, nineties.class);
                startActivity(ninetiesIntent);
            }
        });

        TextView todays = (TextView) findViewById(R.id.todays);
        todays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent todaysIntent = new Intent(MainActivity.this, todays.class);
                startActivity(todaysIntent);
            }
        });
    }
}
