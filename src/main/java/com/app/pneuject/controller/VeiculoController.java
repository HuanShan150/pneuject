package com.app.pneuject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pneuject.model.Veiculo;
import com.app.pneuject.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> listarTodos() {
        return service.listarTodos();
    }
}
