package com.plurasight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // store catalog/inventory
        ArrayList<Product> storeProducts = new ArrayList<>();

        storeProducts.add(new Product("Neural Sync Headband", 299.99));
        storeProducts.add(new Product("Holographic Smart Glasses", 888.99));
        storeProducts.add(new Product("AI Personal Drone Assistant", 1888.99));
        storeProducts.add(new Product("Smart Contact Lenses", 444.99));
        storeProducts.add(new Product("Wearable Translator Earbuds", 150.99));
        storeProducts.add(new Product("Pocket Quantum Computer", 999.99));
        storeProducts.add(new Product("Biometric Smart Ring", 333.99));
        storeProducts.add(new Product("Invisibility Cloak", 9999.99));
        storeProducts.add(new Product("Self-Charging Phone Case", 88.99));
        storeProducts.add(new Product("Mood-Adapting Smart Hoodie", 111.99));

        // print store products
        System.out.println("Available store products:");
        for (Product product : storeProducts) {
            System.out.println(product);
        }
        // formatting output to make the console easier to read.
        System.out.println("\n================================\n");

        // shopping cart online
        Cart cart = new Cart();

        cart.addProduct(storeProducts.get(0));
        cart.addProduct(storeProducts.get(1));
        cart.addProduct(storeProducts.get(2));

        // print cart
        System.out.println("Cart items:");
        for (Product product : cart.getItems()) {
            System.out.println(product);
        }
        // separation aesthetic
        System.out.println("------------------");
        System.out.printf("Total: $%.2f%n", cart.getTotalPrice());

        System.out.println("\nItem count: " + cart.getItemCount());
    }
}