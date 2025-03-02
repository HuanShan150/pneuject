package com.app.pneuject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pneuject.model.Pneu;
import com.app.pneuject.repository.PneuRepository;

@Service
public class PneuService {
    @Autowired
    private PneuRepository repository;
    
    public List<Pneu> listarTodos() {
        return repository.findAll();
    }
}
