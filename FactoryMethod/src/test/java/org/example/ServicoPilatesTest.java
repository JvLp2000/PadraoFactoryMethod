package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ServicoPilatesTest {

    @Test
    void deveExecutarPilates() {
        IServico servico = ServicoFactory.obterServico("Pilates");
        assertEquals("Aula de Pilates iniciada.", servico.executar());
    }

    @Test
    void deveCancelarPilates() {
        IServico servico = ServicoFactory.obterServico("Pilates");
        assertEquals("Aula de Pilates cancelada.", servico.cancelar());
    }
}