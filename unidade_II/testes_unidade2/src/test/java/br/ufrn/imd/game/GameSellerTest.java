package br.ufrn.imd.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameSellerTest {
   
   private GameSeller virtual = new GameSeller();

   /// Teste de limite para jogo de tabuleiro
   @Test
   public void testLimiteFreteJogoTabuleiro() throws ArgumentoInvalidoException {
      assertEquals(229, virtual.calculaPreco(1, 199), 0.0);
   }
  
   /// Teste de limite minimo para frete gratuito de jogo de tabuleiro
   @Test
   public void testLimiteGratuitoJogoTabuleiro() throws ArgumentoInvalidoException {
      assertEquals(200, virtual.calculaPreco(1, 200), 0.0);
   }

   /// Teste de frete inexistente de jogo de stream
   @Test
   public void testJogoStream() throws ArgumentoInvalidoException {
      assertEquals(60, virtual.calculaPreco(2, 60), 0.0);
   }
  
   /// Teste limite de frete de R$30 para jogo de dvd
   @Test
   public void testLimite30JogoDvd() throws ArgumentoInvalidoException {
      assertEquals(130, virtual.calculaPreco(3, 100), 0.0);
   }
  
   /// Teste de limite de frete de R$20 para jogo de dvd
   @Test
   public void testLimite20JogoDvd() throws ArgumentoInvalidoException {
      assertEquals(121, virtual.calculaPreco(3, 101), 0.0);
   }

   /// Teste de lançamento de exceção para jogo inválido
   @Test(expected=ArgumentoInvalidoException.class)
   public void testExceptionGameSeller() throws ArgumentoInvalidoException {
      assertEquals(0, virtual.calculaPreco(4, 0), 0.0);
   }
   
}
