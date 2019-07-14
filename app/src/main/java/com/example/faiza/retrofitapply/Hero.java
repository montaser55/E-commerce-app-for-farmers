package com.example.faiza.retrofitapply;

public class Hero {

    private String title;
    private String location;
    private String available_date;
    private String expiry_date;
    private String unit_cost;
    private String amount;

    public Hero(String title, String location, String available_date, String expiry_date, String unit_cost, String amount) {
        this.title = title;
        this.location = location;
        this.available_date = available_date;
        this.expiry_date = expiry_date;
        this.unit_cost = unit_cost;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getAvailable_date() {
        return available_date;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public String getUnit_cost() {
        return unit_cost;
    }

    public String getAmount() {
        return amount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailable_date(String available_date) {
        this.available_date = available_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public void setUnit_cost(String unit_cost) {
        this.unit_cost = unit_cost;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
