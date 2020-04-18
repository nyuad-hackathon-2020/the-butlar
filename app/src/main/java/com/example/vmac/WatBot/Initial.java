package com.example.vmac.WatBot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Initial extends AppCompatActivity {

    TextView TypesofQs;
    ImageButton AccB, infoB, historyB, wishlistB, carrotB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        infoB= (ImageButton) findViewById(R.id.imageButton);
        AccB= (ImageButton) findViewById(R.id.imageButton2);
        carrotB= (ImageButton) findViewById(R.id.imageButton3);
        historyB= (ImageButton) findViewById(R.id.imageButton4);
        wishlistB= (ImageButton) findViewById(R.id.imageButton5);


        carrotB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Initial.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
