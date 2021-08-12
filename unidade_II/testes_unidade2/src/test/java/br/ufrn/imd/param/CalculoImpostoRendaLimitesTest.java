package br.ufrn.imd.param;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoImpostoRendaLimitesTest {

    private double entrada;
    private double esperado; 

    // Construtor
    public CalculoImpostoRendaLimitesTest (double entrada, double esperado) {
        this.entrada = entrada;
        this.esperado = esperado;
    }

    /*
     * Casos de testes com critério de Análise do Valor Limite
     * [1] Limite da renda isenta: R$1200 -> Deve retornar 0% de imposto.
     * [2, 3] Limites da renda de aliquota 1: R$1201 e R$5000 -> Devem retornar 10% de imposto
     * [4, 5] Limites da renda de aliquota 2: R$5001 e R$10000 -> Devem retornar 15% de imposto
     * [6] Limite da renda de aliquota 3: R$10001 -> Deve retornar 20% de imposto
     * */
    @Parameters
    public static Object[][] renda() {
        return new Object[][] {
            {1200, 0},
            {1201, 120.1},
            {5000, 500.0},
            {5001, 750.15},
            {10000, 1500.0},
            {10001, 2000.2}
        };
    }


    @Test
    public void testCalculoImpostoRendaLimistes() {
        assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada), 0.0);
    }

}
