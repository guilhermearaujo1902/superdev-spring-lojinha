package com.superdev.lojinha.model;

public class Produto {

    private int id;
    private String nome;
    private Double preco;
    private boolean status;

    public Produto() {
    }

    public Produto(boolean status, Double preco, String nome, int id) {
        this.status = status;
        this.preco = preco;
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
