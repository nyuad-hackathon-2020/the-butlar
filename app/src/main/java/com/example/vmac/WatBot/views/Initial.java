package com.example.vmac.WatBot.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.vmac.WatBot.R;

public class Initial extends AppCompatActivity {
    ImageButton carrotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

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
    }
}
