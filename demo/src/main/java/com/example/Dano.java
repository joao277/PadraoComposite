package com.example;

public class Dano {

    private Conteudo equipamentoDano;

    public void setDano(Conteudo equipamentoDano) {
        this.equipamentoDano = equipamentoDano;
    }

    public String getDano() {
        if (this.equipamentoDano == null) {
            throw new NullPointerException("Equipamento não causa Dano");
        }
        return this.equipamentoDano.getConteudo();
    }

}
