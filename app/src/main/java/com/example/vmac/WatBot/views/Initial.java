package com.example.vmac.WatBot.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vmac.WatBot.R;

public class Initial extends AppCompatActivity {
    ImageButton carrotButton;
    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        username = findViewById(R.id.usernameText);

        carrotButton = findViewById(R.id.carrotButton);
        carrotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Initial.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void goToHistory(View view) {
        Intent intent = new Intent(Initial.this, HistoryActivity.class);
        startActivity(intent);
    }

    public void goToWishList(View view) {
        Intent intent = new Intent(Initial.this, WishlistActivity.class);
        startActivity(intent);
    }

    public void goToProfile(View view) {
        Intent intent = new Intent(Initial.this, ProfileActivity.class);
        startActivity(intent);
    }
}
