package com.example.vmac.WatBot.models;

import android.content.Context;
import android.graphics.BitmapFactory;


import com.example.vmac.WatBot.R;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
    public List<Store> stores = new ArrayList<>();
    private static Dummy INSTANCE = null;

    public Dummy getINSTANCE(Context context) {
        if (Dummy.INSTANCE == null) {
            Dummy.INSTANCE = new Dummy(context);
        }

        return INSTANCE;
    }

    private Dummy(Context context) {
        List<Item> items = new ArrayList<>();
        Item item = new Item("26pc Toilet Paper", "Angel Soft", 3, 22.48, BitmapFactory.decodeResource(context.getResources(), R.drawable.angelsoft));
        items.add(item);
        item = new Item("Low Fat 500ml Cow Milk", "Marai", 10, 2.90, BitmapFactory.decodeResource(context.getResources(), R.drawable.marai));
        items.add(item);
        Store store = new Store(items, "LuLu Hypermarket", Country.UAE, "https://goo.gl/maps/2ojNn6p41bhQPMEX6");
        stores.add(store);

        items = new ArrayList<>();
        item = new Item("24pc Toilet Paper", "Quilted", 30, 22.45, BitmapFactory.decodeResource(context.getResources(), R.drawable.quilted));
        items.add(item);
        item = new Item("Low Fat 500ml Cow Milk", "Marai", 36, 2.50, BitmapFactory.decodeResource(context.getResources(), R.drawable.marai));
        items.add(item);
        store = new Store(items, "Carrefour", Country.UAE, "https://goo.gl/maps/xJbF4NQUtdyjd8vR9");
        stores.add(store);

        items = new ArrayList<>();
        item = new Item("6 Rolls 2ply Toilet Paper", "Fine", 5, 20.30, BitmapFactory.decodeResource(context.getResources(), R.drawable.fine));
        items.add(item);
        item = new Item("Full Cream 500ml Cow Milk", "Rawabi", 25, 2.90, BitmapFactory.decodeResource(context.getResources(), R.drawable.rawabi));
        items.add(item);
        store = new Store(items, "Spinneys", Country.UAE, "https://goo.gl/maps/ftXkksukuTdbL29N7");
        stores.add(store);
    }
}
