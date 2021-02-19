package com.example.sandersmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Find the View with play button
        Button playButton = (Button) findViewById(R.id.play_button);

        // Set a click listener on that View
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album2 image is clicked on.
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "It will be possible soon", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        // Find the View with download button
        Button downloadButton = (Button) findViewById(R.id.download_button);

        // Set a click listener on that View
        downloadButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album2 image is clicked on.
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "It will be possible soon", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}