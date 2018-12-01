package com.ufrbbuild.mh4x0f.myapplication.model;

/**
 * Created by mh4x0f on 28/11/18.
 */

public class Books {

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getAutor() {
        return autor;
    }

    private String nome;
    private String data;
    private String autor;


    public Books(String nome, String data, String autor) {
        this.nome = nome;
        this.data = data;
        this.autor = autor;
    }
}
