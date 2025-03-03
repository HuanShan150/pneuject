package com.app.pneuject.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CARRO")
public class Carro extends Veiculo {
    
    public Carro() {}

    public Carro(String placa, String marca, Integer quilometragem, String status, Integer numEixos) {
        super(placa, marca, quilometragem, status, numEixos);
        numEixos = 2;
    }

    
}
