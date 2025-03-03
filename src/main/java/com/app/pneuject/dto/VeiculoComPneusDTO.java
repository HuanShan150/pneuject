package com.app.pneuject.dto;

import java.util.List;
import com.app.pneuject.model.Pneu;

public class VeiculoComPneusDTO {
    private Long id;
    private String placa;
    private String marca;
    private Integer quilometragem;
    private String status;
    private Integer numEixos;
    private List<Pneu> pneus;

    public VeiculoComPneusDTO(Long id, String placa, String marca, Integer quilometragem, String status, Integer numEixos, List<Pneu> pneus) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.quilometragem = quilometragem;
        this.status = status;
        this.numEixos = numEixos;
        this.pneus = pneus;
    }

    public Long getId() { return id; }
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public Integer getQuilometragem() { return quilometragem; }
    public String getStatus() { return status; }
    public Integer getNumEixos() { return numEixos; }
    public List<Pneu> getPneus() { return pneus; }
}
