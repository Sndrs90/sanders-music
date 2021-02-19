package com.example.sandersmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlbumActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album2);

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

        // Find the View with buy button
        Button buyButton = (Button) findViewById(R.id.buy_button);

        // Set a click listener on that View
        buyButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album2 image is clicked on.
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(AlbumActivity2.this, PaymentActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}