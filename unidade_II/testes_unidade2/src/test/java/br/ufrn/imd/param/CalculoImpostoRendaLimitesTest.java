package br.ufrn.imd.param;

import br.ufrn.imd.param.*;

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
