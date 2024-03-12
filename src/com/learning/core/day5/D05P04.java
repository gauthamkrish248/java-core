package com.learning.core.day05;

import java.util.HashSet;
import java.util.Scanner;

public class D05P04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<ProductItem> products = new HashSet<>();
        
        System.out.println("Enter the number of products:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for product " + i + ":");
            System.out.print("Product ID: ");
            String productId = scanner.nextLine();
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();

            ProductItem product = new ProductItem(productId, productName);
            products.add(product);
        }

        System.out.print("Enter the product ID to search for: ");
        String searchProductId = scanner.nextLine();

        ProductItem searchProduct = new ProductItem(searchProductId, "");

        if (products.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }

        scanner.close();
    }
}
