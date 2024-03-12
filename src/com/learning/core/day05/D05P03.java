package com.learning.core.day05;

import java.util.HashSet;
import java.util.Scanner;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D05P03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Product> products = new HashSet<>();
        System.out.println("Enter the number of products:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for product " + i + ":");
            System.out.print("Product ID: ");
            String productId = scanner.nextLine();
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();

            Product product = new Product(productId, productName);
            products.add(product);
        }

        scanner.close();

        System.out.println("Product details:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
