package com.example;

import java.util.ArrayList;
import java.util.List;

public class TipodeEquipamento extends Conteudo {

    private List<Conteudo> conteudos;

    public TipodeEquipamento(String equipamento) {
        super(equipamento);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Tipo de Equipamento: " + this.getEquipamento() + "\n";
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}
