package com.example.vmac.WatBot.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.vmac.WatBot.R;
import com.example.vmac.WatBot.models.HistoryAdapter;
import com.example.vmac.WatBot.models.User;

public class HistoryActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        recyclerView = findViewById(R.id.historyRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new HistoryAdapter(this, User.currentUser.getHistory()));
    }

    public void backToInitial(View view) {
        Intent intent = new Intent(this, Initial.class);
        startActivity(intent);
    }

    public void goToWishList(View view) {
        Intent intent = new Intent(this, WishlistActivity.class);
        startActivity(intent);
    }
}
