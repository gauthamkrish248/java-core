package com.learning.core.day05;

public class ProductItem {
	private String productId;
    private String productName;

    public ProductItem(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProductItem product = (ProductItem) obj;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}
