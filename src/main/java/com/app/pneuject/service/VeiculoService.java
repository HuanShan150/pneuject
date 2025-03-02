package com.app.pneuject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pneuject.model.Veiculo;
import com.app.pneuject.repository.VeiculoRepository;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository repository;
    
    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }
}
