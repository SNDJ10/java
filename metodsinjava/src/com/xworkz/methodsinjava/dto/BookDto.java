package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class BookDto {

    private int bookId;
    private long isbnNumber;
    private boolean available;
    private char categoryCode;
    private double price;

    private String bookName;
    private String authorName;
    private Integer numberOfPages;
    private Long publicationYear;
    private Double rating;
    private Float discountPercentage;
    private Boolean hardcover;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setCategoryCode(char categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPublicationYear(Long publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setDiscountPercentage(Float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setHardcover(Boolean hardcover) {
        this.hardcover = hardcover;
    }

    public int getBookId() {
        return bookId;
    }

    public long getIsbnNumber() {
        return isbnNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public char getCategoryCode() {
        return categoryCode;
    }

    public double getPrice() {
        return price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public Long getPublicationYear() {
        return publicationYear;
    }

    public Double getRating() {
        return rating;
    }

    public Float getDiscountPercentage() {
        return discountPercentage;
    }

    public Boolean getHardcover() {
        return hardcover;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bookId,
                isbnNumber,
                available,
                categoryCode,
                price,
                bookName,
                authorName,
                numberOfPages,
                publicationYear,
                rating,
                discountPercentage,
                hardcover
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
        BookDto other = (BookDto) object;
        if (bookId != other.bookId)
            return false;
        if (isbnNumber != other.isbnNumber)
            return false;
        if (available != other.available)
            return false;
        if (categoryCode != other.categoryCode)
            return false;
        if (Double.compare(other.price, price) != 0)
            return false;
        if (!Objects.equals(bookName, other.bookName))
            return false;
        if (!Objects.equals(authorName, other.authorName))
            return false;
        if (!Objects.equals(numberOfPages, other.numberOfPages))
            return false;
        if (!Objects.equals(publicationYear, other.publicationYear))
            return false;
        if (!Objects.equals(rating, other.rating))
            return false;
        if (!Objects.equals(discountPercentage, other.discountPercentage))
            return false;
        if (!Objects.equals(hardcover, other.hardcover))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BookDto {"
                + "\n  bookId = " + bookId
                + ",\n  bookName = '" + bookName + '\''
                + ",\n  authorName = '" + authorName + '\''
                + ",\n  isbnNumber = " + isbnNumber
                + ",\n  available = " + available
                + ",\n  categoryCode = " + categoryCode
                + ",\n  price = " + price
                + ",\n  numberOfPages = " + numberOfPages
                + ",\n  publicationYear = " + publicationYear
                + ",\n  rating = " + rating
                + ",\n  discountPercentage = " + discountPercentage
                + ",\n  hardcover = " + hardcover
                + "\n}";
    }
}

