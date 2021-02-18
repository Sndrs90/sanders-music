package com.example.sandersmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View with first playlist image
        ImageView playlist1 = (ImageView) findViewById(R.id.playlist1);

        // Set a click listener on that View
        playlist1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist1 image is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist1Intent = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlist1Intent);
            }
        });

        // Find the View with first album image
        ImageView album1 = (ImageView) findViewById(R.id.album1);

        // Set a click listener on that View
        album1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album1 image is clicked on.
            @Override
            public void onClick(View view) {
                Intent album1Intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(album1Intent);
            }
        });

        // Find the View with second playlist image
        ImageView playlist2 = (ImageView) findViewById(R.id.playlist2);

        // Set a click listener on that View
        playlist2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist2 image is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist2Intent = new Intent(MainActivity.this, Playlist2.class);
                startActivity(playlist2Intent);
            }
        });

        // Find the View with second album image
        ImageView album2 = (ImageView) findViewById(R.id.album2);

        // Set a click listener on that View
        album2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album2 image is clicked on.
            @Override
            public void onClick(View view) {
                Intent album2Intent = new Intent(MainActivity.this, AlbumActivity2.class);
                startActivity(album2Intent);
            }
        });


    }
}