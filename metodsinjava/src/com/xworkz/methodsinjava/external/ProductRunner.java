package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.ProductDto;

public class ProductRunner {

    public static void main(String[] args) {

        ProductDto firstProduct = new ProductDto();

        firstProduct.setProductId(1101);
        firstProduct.setProductName("Wireless Mouse");
        firstProduct.setBrandName("Logitech");
        firstProduct.setBarcodeNumber(8901234567890L);
        firstProduct.setAvailable(true);
        firstProduct.setGrade('A');
        firstProduct.setPrice(2499.99);
        firstProduct.setQuantityInStock(250);
        firstProduct.setSupplierContact(9988776655L);
        firstProduct.setDiscountRate(10.5);
        firstProduct.setWeight(0.15f);
        firstProduct.setImported(true);

        ProductDto secondProduct = new ProductDto();

        secondProduct.setProductId(1101);
        secondProduct.setProductName("Wireless Mouse");
        secondProduct.setBrandName("Logitech");
        secondProduct.setBarcodeNumber(8901234567890L);
        secondProduct.setAvailable(true);
        secondProduct.setGrade('A');
        secondProduct.setPrice(2499.99);
        secondProduct.setQuantityInStock(250);
        secondProduct.setSupplierContact(9988776655L);
        secondProduct.setDiscountRate(10.5);
        secondProduct.setWeight(0.15f);
        secondProduct.setImported(true);

        System.out.println("---- FIRST PRODUCT DETAILS ----");
        System.out.println(firstProduct);

        System.out.println("\n---- SECOND PRODUCT DETAILS ----");
        System.out.println(secondProduct);

        System.out.println("\nHashCode of first product = " + firstProduct.hashCode());
        System.out.println("HashCode of second product = " + secondProduct.hashCode());

        System.out.println("\nAre both products equal? " + firstProduct.equals(secondProduct));
    }
}

