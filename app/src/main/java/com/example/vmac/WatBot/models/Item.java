package com.example.vmac.WatBot.models;

import android.graphics.Bitmap;

public class Item {
    String name;
    String brand;
    int quantity;
    double price;
    Bitmap picture;

    public Item(String name, String brand, int quantity, double price, Bitmap picture) {
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.picture = picture;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }
}
