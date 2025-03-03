package com.app.pneuject.controller;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.app.pneuject.model.Veiculo;
import com.app.pneuject.service.VeiculoService;

@ExtendWith(MockitoExtension.class)
class VeiculoControllerTest {
    
    @Mock
    private VeiculoService veiculoService;

    @InjectMocks
    private VeiculoController veiculoController;

    @Test
    void listarTodos_DeveRetornarListaDeVeiculos() {
        List<Veiculo> veiculos = Arrays.asList(mock(Veiculo.class), mock(Veiculo.class));
        when(veiculoService.listarTodos()).thenReturn(veiculos);

        List<Veiculo> resultado = veiculoController.listarTodos();

        assertThat(resultado).isEqualTo(veiculos);
        verify(veiculoService, times(1)).listarTodos();
    }

    @Test
    void buscarVeiculo_DeveRetornarVeiculoPorId() {
        Veiculo veiculo = mock(Veiculo.class);
        when(veiculoService.buscarPorId(1L)).thenReturn(veiculo);

        Veiculo resultado = veiculoController.buscarVeiculo(1L);

        assertThat(resultado).isEqualTo(veiculo);
        verify(veiculoService, times(1)).buscarPorId(1L);
    }
}
