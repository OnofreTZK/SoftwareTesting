package param;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoImpostoRendaTest {

    private double entrada;
    private double esperado;

    // Construtor
    public CalculoImpostoRendaTest (double in, double esp){
     
        this.entrada = in;
        this.esperado = esp;
    }
    
    @Parameters
    public static Object[][] renda() {
        return new Object[][] {
            { 1000, 0 },
            { 1201, 120.1},
            { 5001, 750.15},
            { 10001, 2000.2 } };
    }

    @Test
    public void testCalculoImpostoRenda(){
        assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada), 0.0);
    }
}
