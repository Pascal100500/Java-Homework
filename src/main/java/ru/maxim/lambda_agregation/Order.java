package ru.maxim.lambda_agregation;

import java.util.List;

public class Order {
    private String customer;
    private String city;
    private double amount;
    private boolean delivered;
    private List<String> items;

    public Order(String customer, String city, double amount, boolean delivered, List<String> items) {
        this.customer = customer;
        this.city = city;
        this.amount = amount;
        this.delivered = delivered;
        this.items = items;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isDelivered() {
        return delivered;
    }
}
