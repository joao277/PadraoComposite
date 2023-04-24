package com.example;

public abstract class Conteudo {

    private String equipamento;

    public Conteudo(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public abstract String getConteudo();
}