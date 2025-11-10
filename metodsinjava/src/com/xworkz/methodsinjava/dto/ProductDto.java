package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class ProductDto {

    private int productId;
    private long barcodeNumber;
    private boolean available;
    private char grade;
    private double price;

    private String productName;
    private String brandName;
    private Integer quantityInStock;
    private Long supplierContact;
    private Double discountRate;
    private Float weight;
    private Boolean imported;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setBarcodeNumber(long barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setSupplierContact(Long supplierContact) {
        this.supplierContact = supplierContact;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    public int getProductId() {
        return productId;
    }

    public long getBarcodeNumber() {
        return barcodeNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public char getGrade() {
        return grade;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public Long getSupplierContact() {
        return supplierContact;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public Float getWeight() {
        return weight;
    }

    public Boolean getImported() {
        return imported;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                productId,
                barcodeNumber,
                available,
                grade,
                price,
                productName,
                brandName,
                quantityInStock,
                supplierContact,
                discountRate,
                weight,
                imported
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        ProductDto other = (ProductDto) object;
        if (productId != other.productId)
            return false;
        if (barcodeNumber != other.barcodeNumber)
            return false;
        if (available != other.available)
            return false;
        if (grade != other.grade)
            return false;
        if (Double.compare(other.price, price) != 0)
            return false;
        if (!Objects.equals(productName, other.productName))
            return false;
        if (!Objects.equals(brandName, other.brandName))
            return false;
        if (!Objects.equals(quantityInStock, other.quantityInStock))
            return false;
        if (!Objects.equals(supplierContact, other.supplierContact))
            return false;
        if (!Objects.equals(discountRate, other.discountRate))
            return false;
        if (!Objects.equals(weight, other.weight))
            return false;
        if (!Objects.equals(imported, other.imported))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ProductDto {"
                + "\n  productId = " + productId
                + ",\n  productName = '" + productName + '\''
                + ",\n  brandName = '" + brandName + '\''
                + ",\n  barcodeNumber = " + barcodeNumber
                + ",\n  available = " + available
                + ",\n  grade = " + grade
                + ",\n  price = " + price
                + ",\n  quantityInStock = " + quantityInStock
                + ",\n  supplierContact = " + supplierContact
                + ",\n  discountRate = " + discountRate
                + ",\n  weight = " + weight
                + ",\n  imported = " + imported
                + "\n}";
    }
}

