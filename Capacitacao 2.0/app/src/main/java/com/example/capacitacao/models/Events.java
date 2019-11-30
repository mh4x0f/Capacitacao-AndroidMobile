package com.example.capacitacao.models;

public class Events {
    private String data;
    private String name;
    private String localization;


    public Events(String name, String data, String localization){
        this.name = name;
        this.data = data;
        this.localization = localization;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }
}
