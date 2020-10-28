package com.example.genremoviesincinema.ui.gallery;

import java.io.Serializable;

public class MovieData implements Serializable {
    private  String name;
    private int year;
    private  String image;
    private String  description;
    private String text;
    private  float rating;

    public MovieData(String name, int year, String image, String description, String text, float rating) {
        this.name = name;
        this.year = year;
        this.image = image;
        this.text = text;
        this.rating = rating;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getText() {
        return text;
    }

    public void setRating(float ratings) {
        this.rating = rating;
    }
    public float getRating() {
        return rating;
    }

    public void setText (String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
