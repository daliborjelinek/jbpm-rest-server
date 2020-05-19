package com.jbmp.restserver.data;

public class PhotographerOrderData {

    private String day;
    private Integer price;
    private String photographer;
    private Integer rating;
    private String phone;
    private String email;

    public PhotographerOrderData() {
    }

    public PhotographerOrderData(String day, Integer price, String photographer, Integer rating, String phone, String email) {
        this.day = day;
        this.price = price;
        this.photographer = photographer;
        this.rating = rating;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhotographerData{" +
                "day='" + day + '\'' +
                ", price=" + price +
                ", photographer='" + photographer + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
