package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class MobileDto {

    // ------------------------------------------------
    // ✅ Primitive Data Types
    // ------------------------------------------------
    private int mobileId;               // unique ID for the mobile
    private double mobilePrice;         // price of the mobile
    private boolean fiveGSupported;     // whether it supports 5G
    private char performanceGrade;      // performance grade (A/B/C)
    private long imeiNumber;            // IMEI number of the mobile

    // ------------------------------------------------
    // ✅ Non-Primitive (Wrapper) Data Types
    // ------------------------------------------------
    private String brandName;           // brand name of the mobile
    private String modelName;           // model name
    private Integer ramSize;            // RAM in GB
    private Double processorSpeed;      // processor speed in GHz
    private Float screenSize;           // screen size in inches
    private Boolean hasFingerprintLock; // fingerprint lock availability
    private Long warrantyNumber;        // warranty registration number

    // ------------------------------------------------
    // ✅ Setters
    // ------------------------------------------------
    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public void setMobilePrice(double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public void setFiveGSupported(boolean fiveGSupported) {
        this.fiveGSupported = fiveGSupported;
    }

    public void setPerformanceGrade(char performanceGrade) {
        this.performanceGrade = performanceGrade;
    }

    public void setImeiNumber(long imeiNumber) {
        this.imeiNumber = imeiNumber;
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

    public void setHasFingerprintLock(Boolean hasFingerprintLock) {
        this.hasFingerprintLock = hasFingerprintLock;
    }

    public void setWarrantyNumber(Long warrantyNumber) {
        this.warrantyNumber = warrantyNumber;
    }

    // ------------------------------------------------
    // ✅ Getters
    // ------------------------------------------------
    public int getMobileId() {
        return mobileId;
    }

    public double getMobilePrice() {
        return mobilePrice;
    }

    public boolean isFiveGSupported() {
        return fiveGSupported;
    }

    public char getPerformanceGrade() {
        return performanceGrade;
    }

    public long getImeiNumber() {
        return imeiNumber;
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

    public Boolean getHasFingerprintLock() {
        return hasFingerprintLock;
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
                mobileId,
                mobilePrice,
                fiveGSupported,
                performanceGrade,
                imeiNumber,
                brandName,
                modelName,
                ramSize,
                processorSpeed,
                screenSize,
                hasFingerprintLock,
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

        MobileDto other = (MobileDto) object;

        return mobileId == other.mobileId &&
                Double.compare(other.mobilePrice, mobilePrice) == 0 &&
                fiveGSupported == other.fiveGSupported &&
                performanceGrade == other.performanceGrade &&
                imeiNumber == other.imeiNumber &&
                Objects.equals(brandName, other.brandName) &&
                Objects.equals(modelName, other.modelName) &&
                Objects.equals(ramSize, other.ramSize) &&
                Objects.equals(processorSpeed, other.processorSpeed) &&
                Objects.equals(screenSize, other.screenSize) &&
                Objects.equals(hasFingerprintLock, other.hasFingerprintLock) &&
                Objects.equals(warrantyNumber, other.warrantyNumber);
    }

    // ------------------------------------------------
    // ✅ toString()
    // ------------------------------------------------
    @Override
    public String toString() {
        return "MobileDto {" +
                "\n  mobileId = " + mobileId +
                ",\n  brandName = '" + brandName + '\'' +
                ",\n  modelName = '" + modelName + '\'' +
                ",\n  mobilePrice = " + mobilePrice +
                ",\n  fiveGSupported = " + fiveGSupported +
                ",\n  performanceGrade = " + performanceGrade +
                ",\n  imeiNumber = " + imeiNumber +
                ",\n  ramSize = " + ramSize +
                ",\n  processorSpeed = " + processorSpeed +
                ",\n  screenSize = " + screenSize +
                ",\n  hasFingerprintLock = " + hasFingerprintLock +
                ",\n  warrantyNumber = " + warrantyNumber +
                "\n}";
    }
}

