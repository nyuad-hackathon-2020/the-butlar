package com.example.vmac.WatBot.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vmac.WatBot.R;
import com.example.vmac.WatBot.models.Item;
import com.example.vmac.WatBot.models.Dummy;
import com.example.vmac.WatBot.models.User;

public class ItemActivity extends AppCompatActivity {
    Item topItem = Dummy.getINSTANCE(this).stores.get(0).getStorage().get(0);
    Item secondItem = Dummy.getINSTANCE(this).stores.get(1).getStorage().get(0);
    Item thirdItem = Dummy.getINSTANCE(this).stores.get(2).getStorage().get(0);
    ImageView topImage, secondImage, thirdImage;
    TextView topName, secondName, thirdName;
    TextView topBrand, secondBrand, thirdBrand;
    TextView topPrice, secondPrice, thirdPrice;
    TextView topStore, secondStore, thirdStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        topImage = findViewById(R.id.topItemImage);
        topImage.setImageBitmap(topItem.getPicture());
        topName = findViewById(R.id.topProductNameText);
        topName.setText(topItem.getName());
        topBrand = findViewById(R.id.topBrandNameText);
        topBrand.setText(topItem.getBrand());
        topPrice = findViewById(R.id.topPriceNameText);
        topPrice.setText(String.valueOf(topItem.getPrice()));
        topStore = findViewById(R.id.topStoreNameText);
        topStore.setText(Dummy.getINSTANCE(this).stores.get(0).getName());

        secondImage = findViewById(R.id.secondItemImage);
        secondImage.setImageBitmap(secondItem.getPicture());
        secondName = findViewById(R.id.secondProductNameText);
        secondName.setText(secondItem.getName());
        secondBrand = findViewById(R.id.secondBrandNameText);
        secondBrand.setText(secondItem.getBrand());
        secondPrice = findViewById(R.id.secondPriceNameText);
        secondPrice.setText(String.valueOf(secondItem.getPrice()));
        secondStore = findViewById(R.id.secondStoreNameText);
        secondStore.setText(Dummy.getINSTANCE(this).stores.get(1).getName());

        thirdImage = findViewById(R.id.thirdItemImage);
        thirdImage.setImageBitmap(thirdItem.getPicture());
        thirdName = findViewById(R.id.thirdProductNameText);
        thirdName.setText(thirdItem.getName());
        thirdBrand = findViewById(R.id.thirdBrandNameText);
        thirdBrand.setText(thirdItem.getBrand());
        thirdPrice = findViewById(R.id.thirdPriceNameText);
        thirdPrice.setText(String.valueOf(thirdItem.getPrice()));
        thirdStore = findViewById(R.id.thirdStoreNameText);
        thirdStore.setText(Dummy.getINSTANCE(this).stores.get(2).getName());
    }

    public void goToWishList(View view) {
        Intent intent = new Intent(this, WishlistActivity.class);
        startActivity(intent);
    }

    public void goToProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void backToInitial(View view) {
        Intent intent = new Intent(this, Initial.class);
        startActivity(intent);
    }

    public void addToWishlist(View view) {
        //User.currentUser.getWishlist().add(topItem);
    }

    public void goToMap(View view) {
        //open link in store.location
    }

    public void proceedItem(View view) {
        //User.currentUser.getHistory().add(topItem);

        //go to link
    }

    public void viewSecondItem(View view) {
        Item temp = topItem;
        topItem = secondItem;
        secondItem = temp;
    }

    public void viewThirdItem(View view) {
        Item temp = topItem;
        topItem = thirdItem;
        thirdItem = temp;
    }

    public void goToHistory(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
}
