package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class CompanyDto {

    private int companyId;
    private long registrationNumber;
    private boolean publiclyListed;
    private char rating;
    private double revenue;

    private String companyName;
    private String industry;
    private Integer numberOfEmployees;
    private Long marketCap;
    private Double profitMargin;
    private Float eps;
    private Boolean isStartup;

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setPubliclyListed(boolean publiclyListed) {
        this.publiclyListed = publiclyListed;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    public void setProfitMargin(Double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public void setEps(Float eps) {
        this.eps = eps;
    }

    public void setIsStartup(Boolean isStartup) {
        this.isStartup = isStartup;
    }

    public int getCompanyId() {
        return companyId;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isPubliclyListed() {
        return publiclyListed;
    }

    public char getRating() {
        return rating;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public Double getProfitMargin() {
        return profitMargin;
    }

    public Float getEps() {
        return eps;
    }

    public Boolean getIsStartup() {
        return isStartup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                companyId,
                registrationNumber,
                publiclyListed,
                rating,
                revenue,
                companyName,
                industry,
                numberOfEmployees,
                marketCap,
                profitMargin,
                eps,
                isStartup
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
        CompanyDto other = (CompanyDto) object;
        if (companyId != other.companyId)
            return false;
        if (registrationNumber != other.registrationNumber)
            return false;
        if (publiclyListed != other.publiclyListed)
            return false;
        if (rating != other.rating)
            return false;
        if (Double.compare(other.revenue, revenue) != 0)
            return false;
        if (!Objects.equals(companyName, other.companyName))
            return false;
        if (!Objects.equals(industry, other.industry))
            return false;
        if (!Objects.equals(numberOfEmployees, other.numberOfEmployees))
            return false;
        if (!Objects.equals(marketCap, other.marketCap))
            return false;
        if (!Objects.equals(profitMargin, other.profitMargin))
            return false;
        if (!Objects.equals(eps, other.eps))
            return false;
        if (!Objects.equals(isStartup, other.isStartup))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CompanyDto {"
                + "\n  companyId = " + companyId
                + ",\n  companyName = '" + companyName + '\''
                + ",\n  industry = '" + industry + '\''
                + ",\n  registrationNumber = " + registrationNumber
                + ",\n  publiclyListed = " + publiclyListed
                + ",\n  rating = " + rating
                + ",\n  revenue = " + revenue
                + ",\n  numberOfEmployees = " + numberOfEmployees
                + ",\n  marketCap = " + marketCap
                + ",\n  profitMargin = " + profitMargin
                + ",\n  eps = " + eps
                + ",\n  isStartup = " + isStartup
                + "\n}";
    }
}

