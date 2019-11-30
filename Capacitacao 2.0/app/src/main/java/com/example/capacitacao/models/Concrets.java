package com.example.capacitacao.models;

public class Concrets {
    private String image_url;
    private String name;
    private String author;


    public Concrets(String image_url, String name, String author) {
        this.image_url = image_url;
        this.name = name;
        this.author = author;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
