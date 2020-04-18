package com.example.vmac.WatBot.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Item> storage = new ArrayList<>();
    String name;
    Country country;
    String location;

    public Store(List<Item> storage, String name, Country country, String location) {
        this.storage = storage;
        this.name = name;
        this.country = country;
        this.location = location;
    }

    public Store() {
    }

    public List<Item> getStorage() {
        return storage;
    }

    public void setStorage(List<Item> storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
