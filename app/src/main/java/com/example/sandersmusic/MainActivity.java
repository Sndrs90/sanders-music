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
    }
}