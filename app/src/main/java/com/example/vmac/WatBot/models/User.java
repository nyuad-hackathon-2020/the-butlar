package com.example.vmac.WatBot.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    String email;
    String password;
    String name;
    Gender gender;
    String telephone;
    Country country;
    List<Item> wishlist = new ArrayList<>();
    List<Item> history = new ArrayList<>();
    public static User currentUser;

    public User(String username, String email, String password, String name, Gender gender, String telephone, Country country, List<Item> wishlist, List<Item> history) {
        User.currentUser.username = username;
        User.currentUser.email = email;
        User.currentUser.password = password;
        User.currentUser.name = name;
        User.currentUser.gender = gender;
        User.currentUser.telephone = telephone;
        User.currentUser.country = country;
        User.currentUser.wishlist = wishlist;
        User.currentUser.history = history;
    }

    public User() {
    }

    public String getUsername() {
        return User.currentUser.username;
    }

    public void setUsername(String username) {
        User.currentUser.username = username;
    }

    public String getEmail() {
        return User.currentUser.email;
    }

    public void setEmail(String email) {
        User.currentUser.email = email;
    }

    public String getPassword() {
        return User.currentUser.password;
    }

    public void setPassword(String password) {
        User.currentUser.password = password;
    }

    public String getName() {
        return User.currentUser.name;
    }

    public void setName(String name) {
        User.currentUser.name = name;
    }

    public Gender getGender() {
        return User.currentUser.gender;
    }

    public void setGender(Gender gender) {
        User.currentUser.gender = gender;
    }

    public String getTelephone() {
        return User.currentUser.telephone;
    }

    public void setTelephone(String telephone) {
        User.currentUser.telephone = telephone;
    }

    public Country getCountry() {
        return User.currentUser.country;
    }

    public void setCountry(Country country) {
        User.currentUser.country = country;
    }

    public List<Item> getWishlist() {
        return User.currentUser.wishlist;
    }

    public void setWishlist(List<Item> wishlist) {
        User.currentUser.wishlist = wishlist;
    }

    public List<Item> getHistory() {
        return User.currentUser.history;
    }

    public void setHistory(List<Item> history) {
        User.currentUser.history = history;
    }
}
