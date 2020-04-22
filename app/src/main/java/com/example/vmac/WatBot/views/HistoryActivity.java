package com.example.vmac.WatBot.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vmac.WatBot.R;
import com.example.vmac.WatBot.models.HistoryAdapter;
import com.example.vmac.WatBot.models.Item;
import com.example.vmac.WatBot.models.User;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        recyclerView = findViewById(R.id.historyRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Item> items = new ArrayList<>();
        items.add(new Item("milk", "marai", 30, 12.48, null));
        recyclerView.setAdapter(new HistoryAdapter(this, items));
    }

    public void backToInitial(View view) {
        Intent intent = new Intent(this, Initial.class);
        startActivity(intent);
    }

    public void goToWishList(View view) {
        Intent intent = new Intent(this, WishlistActivity.class);
        startActivity(intent);
    }

    public void goToProfile(View view) {
    }
}
