package com.app.pneuject.model;

import jakarta.persistence.*;

@Entity
public class VeiculoPneu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Veiculo veiculo;
    
    @ManyToOne
    private Pneu pneu;
    
    private String posicao;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pneu getPneu() {
        return this.pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}