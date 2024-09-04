package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServicoYogaTest {

    @Test
    void deveExecutarYoga() {
        IServico servico = ServicoFactory.obterServico("Yoga");
        assertEquals("Aula de Yoga iniciada.", servico.executar());
    }

    @Test
    void deveCancelarYoga() {
        IServico servico = ServicoFactory.obterServico("Yoga");
        assertEquals("Aula de Yoga cancelada.", servico.cancelar());
    }
}