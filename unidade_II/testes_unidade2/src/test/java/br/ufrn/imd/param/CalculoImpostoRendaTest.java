package br.ufrn.imd.param;

import br.ufrn.imd.param.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculoImpostoRendaTest {

    // Conjunto Isento
    @Test
    public void testCalculoImpostoRendaIsenta() {
        double esperado_1 = 0;
        double esperado_2 = 0;
        double esperado_3 = 0;
        double esperado_4 = 0;
        assertEquals(esperado_1, CalculoImpostoRenda.calculaImposto(RendaIsenta.valor_1), 0.0);
        assertEquals(esperado_2, CalculoImpostoRenda.calculaImposto(RendaIsenta.valor_2), 0.0);
        assertEquals(esperado_3, CalculoImpostoRenda.calculaImposto(RendaIsenta.valor_3), 0.0);
        assertEquals(esperado_4, CalculoImpostoRenda.calculaImposto(RendaIsenta.valor_4), 0.0);
    }

    // Conjunto Aliquota 1
    @Test
    public void testCalculoImpostoRendaAliquota1() {
        double esperado_1 = RendaAliquota1.valor_1 * 0.1;
        double esperado_2 = RendaAliquota1.valor_2 * 0.1;
        double esperado_3 = RendaAliquota1.valor_3 * 0.1;
        double esperado_4 = RendaAliquota1.valor_4 * 0.1; 
        assertEquals(esperado_1, CalculoImpostoRenda.calculaImposto(RendaAliquota1.valor_1), 0.0);
        assertEquals(esperado_2, CalculoImpostoRenda.calculaImposto(RendaAliquota1.valor_2), 0.0);
        assertEquals(esperado_3, CalculoImpostoRenda.calculaImposto(RendaAliquota1.valor_3), 0.0);
        assertEquals(esperado_4, CalculoImpostoRenda.calculaImposto(RendaAliquota1.valor_4), 0.0);
    }

    // Conjunto Aliquota 2
    @Test
    public void testCalculoImpostoRendaAliquota2() {
        // Arrendondado as casas decimais neste conjunto
        double esperado_1 = Math.floor((RendaAliquota2.valor_1 * 0.15)*100)/100;
        double esperado_2 = Math.floor((RendaAliquota2.valor_2 * 0.15)*100)/100;
        double esperado_3 = Math.floor((RendaAliquota2.valor_3 * 0.15)*100)/100;
        double esperado_4 = Math.floor((RendaAliquota2.valor_4 * 0.15)*100)/100; 
        assertEquals(esperado_1, CalculoImpostoRenda.calculaImposto(RendaAliquota2.valor_1), 0.0);
        assertEquals(esperado_2, CalculoImpostoRenda.calculaImposto(RendaAliquota2.valor_2), 0.0);
        assertEquals(esperado_3, CalculoImpostoRenda.calculaImposto(RendaAliquota2.valor_3), 0.0);
        assertEquals(esperado_4, CalculoImpostoRenda.calculaImposto(RendaAliquota2.valor_4), 0.0);
    }

    // Conjunto Aliquota 3
    @Test
    public void testCalculoImpostoRendaAliquota3() {
        double esperado_1 = RendaAliquota3.valor_1 * 0.2;
        double esperado_2 = RendaAliquota3.valor_2 * 0.2;
        double esperado_3 = RendaAliquota3.valor_3 * 0.2;
        double esperado_4 = RendaAliquota3.valor_4 * 0.2; 
        assertEquals(esperado_1, CalculoImpostoRenda.calculaImposto(RendaAliquota3.valor_1), 0.0);
        assertEquals(esperado_2, CalculoImpostoRenda.calculaImposto(RendaAliquota3.valor_2), 0.0);
        assertEquals(esperado_3, CalculoImpostoRenda.calculaImposto(RendaAliquota3.valor_3), 0.0);
        assertEquals(esperado_4, CalculoImpostoRenda.calculaImposto(RendaAliquota3.valor_4), 0.0);
    }
}
