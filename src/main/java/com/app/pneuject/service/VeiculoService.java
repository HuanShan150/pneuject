package com.app.pneuject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pneuject.model.Veiculo;
import com.app.pneuject.model.VeiculoPneu;
import com.app.pneuject.repository.VeiculoPneuRepository;
import com.app.pneuject.repository.VeiculoRepository;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository repository;

      @Autowired
    private VeiculoPneuRepository veiculoPneuRepository;
    
    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<VeiculoPneu> buscarPneusPorVeiculo(Long veiculoId) {
        return veiculoPneuRepository.findByVeiculoId(veiculoId);
    }
}
