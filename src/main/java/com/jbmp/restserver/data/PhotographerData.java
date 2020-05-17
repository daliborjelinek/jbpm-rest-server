package com.jbmp.restserver.data;

public class PhotographerData {

    private String day;
    private Integer price;
    private String photographer;
    private Integer rating;

    public PhotographerData() {
    }

    public PhotographerData(String day, Integer price, String photographer, Integer rating) {
        this.day = day;
        this.price = price;
        this.photographer = photographer;
        this.rating = rating;
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
}
