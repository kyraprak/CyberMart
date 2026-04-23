package com.plurasight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    // private list that stores Product objects
    private List<Product> items = new ArrayList<>();
    // functionality to add a product to the cart
    public void addProduct(Product product) {
        // checks if the product is null
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        // adds the product to the list
        items.add(product);
    }
    // removes a product from the cart
    public void removeProduct(Product product) {
        items.remove(product);
    }
    // returns all products in the cart
    public List<Product> getItems() {
        // return a read-only version of the list
        return Collections.unmodifiableList(items);
    }
    // returns the number of items in the cart
    public int getItemCount() {
        // return the size of the list
        return items.size();
    }
    // checks whether the cart is empty
    public boolean isEmpty() {
        // return true if the cart is empty
        return items.isEmpty();
    }
    // removes all products from the cart
    public void clear() {
        // clear the list
        items.clear();
    }
    // calculates the total price
    public double getTotalPrice() {
        // variable that stores the total
        double total = 0;
        // loop and add prices
        for (Product product : items) {
            total += product.getPrice();
        }
        // return the total
        return total;
    }
    // prints all products in the cart
    public void printItems() {
        // loop and print
        for (Product product : items) {
            System.out.println(product);
        }
    }
}