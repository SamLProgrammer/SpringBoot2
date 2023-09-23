package com.example.form.models;

public class House {
    private String address;
    private String price;
    private String width;
    private String depth;

    public String getAddress() {
        return address;
    }

    public String getDepth() {
        return depth;
    }

    public String getPrice() {
        return price;
    }

    public String getWidth() {
        return width;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
