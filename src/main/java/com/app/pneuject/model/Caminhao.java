package com.app.pneuject.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CAMINHAO")
public class Caminhao extends Veiculo {
    
    public Caminhao() {}

    public Caminhao(String placa, String marca, Integer quilometragem, String status, Integer numEixos) {
        super(placa, marca, quilometragem, status, numEixos);
    }

    
}