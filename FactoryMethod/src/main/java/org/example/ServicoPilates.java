package org.example;

public class ServicoPilates implements IServico {

    @Override
    public String executar() {
        return "Aula de Pilates iniciada.";
    }

    @Override
    public String cancelar() {
        return "Aula de Pilates cancelada.";
    }
}
