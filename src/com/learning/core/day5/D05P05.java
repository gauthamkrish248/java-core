package com.learning.core.day05;

import java.util.HashSet;
import java.util.Scanner;

public class D05P05 {
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

        System.out.print("Enter the product ID to remove: ");
        String productIdToRemove = scanner.nextLine();

        Product productToRemove = null;
        for (Product product : products) {
            if (product.getProductId().equals(productIdToRemove)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println();
            System.out.println("Product removed successfully.");
        } else {
        	System.out.println();
            System.out.println("Product with ID " + productIdToRemove + " not found.");
        }

        System.out.println();
        System.out.println("Products after removing:");
        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}
