package com.app.pneuject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pneuject.model.Pneu;
import com.app.pneuject.service.PneuService;

@RestController
@RequestMapping("/pneus")
public class PneuController {
    @Autowired
    private PneuService service;

    @GetMapping
    public List<Pneu> listarTodos() {
        return service.listarTodos();
    }
}
