package com.example.tugasempat;

import android.graphics.drawable.Drawable;

public class FilmModel {
    String namanya;
    int gambarnya;
    String overview;

    public FilmModel(String namanya, int gambarnya, String overview){
        this.namanya = namanya;
        this.gambarnya = gambarnya;
        this.overview = overview;
    }

    public String getNamanya() {
        return namanya;
    }

    public int getGambarnya() {
        return gambarnya;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
