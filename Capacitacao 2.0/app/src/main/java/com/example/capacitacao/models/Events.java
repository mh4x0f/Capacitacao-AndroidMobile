package com.example.capacitacao.models;

import android.graphics.Color;

import androidx.annotation.ColorInt;

public class Events {
    private String data;
    private String name;
    private String localization;
    private String color_backgorund;




    public Events(String name, String data, String localization, String color){
        this.name = name;
        this.data = data;
        this.localization = localization;
        this.color_backgorund = color;
    }

    public String getColor_backgorund() {
        return color_backgorund;
    }

    public void setColor_backgorund(String color_backgorund) {
        this.color_backgorund = color_backgorund;
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
