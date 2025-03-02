package com.app.pneuject.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class Veiculo {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String placa;
    private String marca;
    private Integer quilometragem;
    private String status;
    private Integer numEixos;
    
    public Veiculo() {}
    
    public Veiculo(String placa, String marca, Integer quilometragem, String status, Integer numEixos) {
        this.placa = placa;
        this.marca = marca;
        this.quilometragem = quilometragem;
        this.status = status;
        this.numEixos = numEixos;
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public Integer getNumEixos() {
        return this.numEixos;
    }

    public void setNumEixos(Integer NumEixos) {
        this.numEixos = NumEixos;
    }
    
}
