package com.app.pneuject.model;

import jakarta.persistence.*;

@Entity
public class Pneu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroFogo;
    private String marca;
    private Double pressaoAtual;
    private String status;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroFogo() {
        return this.numeroFogo;
    }

    public void setNumeroFogo(String numeroFogo) {
        this.numeroFogo = numeroFogo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPressaoAtual() {
        return this.pressaoAtual;
    }

    public void setPressaoAtual(Double pressaoAtual) {
        this.pressaoAtual = pressaoAtual;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}