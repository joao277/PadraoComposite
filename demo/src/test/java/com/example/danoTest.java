package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class danoTest {
    
    @Test
    public void deveRetornarDano() {
        TipodeEquipamento tipodeEquipamento1 = new TipodeEquipamento("Espada");

        TipodeEquipamento tipodeEquipamento2 = new TipodeEquipamento("Espada Curta");
        Detalhes detalhe1 = new Detalhes("Causa dano de Corte", 10);
        tipodeEquipamento2.addConteudo(detalhe1);

        TipodeEquipamento tipodeEquipamento3 = new TipodeEquipamento("Rapieira");
        Detalhes detalhe11 = new Detalhes("Causa dano de Perfuração", 6);
        Detalhes detalhe12 = new Detalhes("Causa dano de Perfuração", 9);
        tipodeEquipamento3.addConteudo(detalhe11);
        tipodeEquipamento3.addConteudo(detalhe12);

        TipodeEquipamento equipamentoDano = new TipodeEquipamento("Tipo de Equipamento:");
        equipamentoDano.addConteudo(tipodeEquipamento1);
        equipamentoDano.addConteudo(tipodeEquipamento2);
        equipamentoDano.addConteudo(tipodeEquipamento3);

        Dano dano = new Dano();
        dano.setDano(equipamentoDano);

        assertEquals("Tipo de Equipamento: Tipo de Equipamento:\n" +
                "Tipo de Equipamento: Espada\n" +
                "Tipo de Equipamento: Espada Curta\n" +
                "Detalhes: Causa dano de Corte - durabilidade: 10\n" +
                "Tipo de Equipamento: Rapieira\n" +
                "Detalhes: Causa dano de Perfuração - durabilidade: 6\n" +
                "Detalhes: Causa dano de Perfuração - durabilidade: 9\n", dano.getDano());
    }

    @Test
    public void deveRetornarExecacaoEquipamentoSemDano() {
        try {
            Dano ferramenta = new Dano();
            ferramenta.getDano();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Equipamento não causa Dano", e.getMessage());
        }
    }
}