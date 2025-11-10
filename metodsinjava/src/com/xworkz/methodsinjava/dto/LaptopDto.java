package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class LaptopDto {

    // ------------------------------------------------
    // ✅ Primitive Data Types
    // ------------------------------------------------
    private int laptopId;
    private double laptopPrice;
    private boolean touchScreen;
    private char performanceGrade;
    private long serialNumber;

    // ------------------------------------------------
    // ✅ Non-Primitive (Wrapper) Data Types
    // ------------------------------------------------
    private String brandName;
    private String modelName;
    private Integer ramSize;
    private Double processorSpeed;
    private Float screenSize;
    private Boolean hasBacklitKeyboard;
    private Long warrantyNumber;

    // ------------------------------------------------
    // ✅ Setters
    // ------------------------------------------------
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public void setPerformanceGrade(char performanceGrade) {
        this.performanceGrade = performanceGrade;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public void setProcessorSpeed(Double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public void setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
    }

    public void setHasBacklitKeyboard(Boolean hasBacklitKeyboard) {
        this.hasBacklitKeyboard = hasBacklitKeyboard;
    }

    public void setWarrantyNumber(Long warrantyNumber) {
        this.warrantyNumber = warrantyNumber;
    }

    // ------------------------------------------------
    // ✅ Getters
    // ------------------------------------------------
    public int getLaptopId() {
        return laptopId;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public char getPerformanceGrade() {
        return performanceGrade;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public Double getProcessorSpeed() {
        return processorSpeed;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public Boolean getHasBacklitKeyboard() {
        return hasBacklitKeyboard;
    }

    public Long getWarrantyNumber() {
        return warrantyNumber;
    }

    // ------------------------------------------------
    // ✅ hashCode()
    // ------------------------------------------------
    @Override
    public int hashCode() {
        return Objects.hash(
                laptopId,
                laptopPrice,
                touchScreen,
                performanceGrade,
                serialNumber,
                brandName,
                modelName,
                ramSize,
                processorSpeed,
                screenSize,
                hasBacklitKeyboard,
                warrantyNumber
        );
    }

    // ------------------------------------------------
    // ✅ equals()
    // ------------------------------------------------
    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        LaptopDto other = (LaptopDto) object;

        return laptopId == other.laptopId &&
                Double.compare(other.laptopPrice, laptopPrice) == 0 &&
                touchScreen == other.touchScreen &&
                performanceGrade == other.performanceGrade &&
                serialNumber == other.serialNumber &&
                Objects.equals(brandName, other.brandName) &&
                Objects.equals(modelName, other.modelName) &&
                Objects.equals(ramSize, other.ramSize) &&
                Objects.equals(processorSpeed, other.processorSpeed) &&
                Objects.equals(screenSize, other.screenSize) &&
                Objects.equals(hasBacklitKeyboard, other.hasBacklitKeyboard) &&
                Objects.equals(warrantyNumber, other.warrantyNumber);
    }

    // ------------------------------------------------
    // ✅ toString()
    // ------------------------------------------------
    @Override
    public String toString() {
        return "LaptopDto {" +
                "\n  laptopId = " + laptopId +
                ",\n  brandName = '" + brandName + '\'' +
                ",\n  modelName = '" + modelName + '\'' +
                ",\n  laptopPrice = " + laptopPrice +
                ",\n  touchScreen = " + touchScreen +
                ",\n  performanceGrade = " + performanceGrade +
                ",\n  serialNumber = " + serialNumber +
                ",\n  ramSize = " + ramSize +
                ",\n  processorSpeed = " + processorSpeed +
                ",\n  screenSize = " + screenSize +
                ",\n  hasBacklitKeyboard = " + hasBacklitKeyboard +
                ",\n  warrantyNumber = " + warrantyNumber +
                "\n}";
    }
}

