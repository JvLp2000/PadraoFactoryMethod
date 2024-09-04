package org.example;

public class ServicoYoga implements IServico {

    @Override
    public String executar() {
        return "Aula de Yoga iniciada.";
    }

    @Override
    public String cancelar() {
        return "Aula de Yoga cancelada.";
    }
}

