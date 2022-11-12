package com.Nhom13.models;

import java.io.Serializable;

public class Product implements Serializable {
    int photo;
    String name;
    double price;

    public Product(int photo, String name, double price) {
        this.photo = photo;
        this.name = name;
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
