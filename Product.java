package com.plurasight;

public class Product {

    private final String name;
    private final double price;
    // prevents having an empty cart
    public Product(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }

        this.name = name.trim();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f", name, price);
    }
}