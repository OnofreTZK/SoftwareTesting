package br.ufrn.imd.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GameSellerParamTest {

   private int tipoJogo;
   private double valorJogo;
   private double esperado;

   public GameSellerParamTest(int tipoJogo, double valorJogo, double esperado) {
        super();
        this.tipoJogo = tipoJogo;
        this.valorJogo = valorJogo;
        this.esperado = esperado;
   }
 
    /*
     * Casos de testes com critério de Análise do Valor Limite
     * [1] Limite de frete pago para jogo de tabuleiro: R$199 -> Deve retornar o valor somado a R$30.
     * [2] Limite minimo para frete gratuito na compra de jogo de tabuleiro: 
     *      R$200 -> Devem retornar somente o valor do jogo.
     * [3] Limite de frete no valor de 30 reais para dvd: R$100 -> Deve retornar o valor somado a R$30.
     * [4] Limite minimo para frete no valor de 20 reais para dvd: R$101 -> Deve retornar o valor somado a R$20
     * */

   @Parameterized.Parameters
   public static Collection entradas() {
        return Arrays.asList(new Object[][] {
            {1, 199, 229},
            {1, 200, 200},
            {3, 100, 130},
            {3, 101, 121},
        });
   }

   @Test
   public void testParamGameSellerLimites() throws ArgumentoInvalidoException {
      GameSeller virtual = new GameSeller();
      assertEquals(esperado, virtual.calculaPreco(tipoJogo, valorJogo), 0.0);
   }

}
