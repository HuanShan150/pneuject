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

import com.app.pneuject.model.Pneu;
import com.app.pneuject.service.PneuService;

@ExtendWith(MockitoExtension.class)
class PneuControllerTest {
    
    @Mock
    private PneuService pneuService;

    @InjectMocks
    private PneuController pneuController;

    @Test
    void listarTodos_DeveRetornarListaDePneus() {
        List<Pneu> pneus = Arrays.asList(new Pneu(), new Pneu());
        when(pneuService.listarTodos()).thenReturn(pneus);

        List<Pneu> resultado = pneuController.listarTodos();

        assertThat(resultado).isEqualTo(pneus);
        verify(pneuService, times(1)).listarTodos();
    }
}
