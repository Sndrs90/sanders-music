package com.example.sandersmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Find the View with payment text
        TextView paymentText = (TextView) findViewById(R.id.payment_text);

        //Set payment text with information I found
        String text = paymentText.getText().toString();
        text += "\nI will use it to integrate Google Play Billing. \n";
        text += "Steps to do this located here: \n";
        text += "https://developer.android.com/google/play/billing/integrate#java";
        paymentText.setText(text);
    }
}