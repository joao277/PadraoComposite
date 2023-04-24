package com.example;

public class Detalhes extends Conteudo {
    
    private int durabilidade;

    public Detalhes(String equipamento, int durabilidade) {
        super(equipamento);
        this.durabilidade = durabilidade;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public String getConteudo() {
        return "Detalhes: " + this.getEquipamento() + " - durabilidade: " + this.durabilidade + "\n";
    }
}
