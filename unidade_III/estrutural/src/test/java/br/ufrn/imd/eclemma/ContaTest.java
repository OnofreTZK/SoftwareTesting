package br.ufrn.imd.eclemma;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testDebitarSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.debitar(10);
		assertEquals(10,c.getSaldo(),0.0);

	} 

	@Test
	public void testTransferirSucesso() throws OperacaoIlegalException{
		Conta pagante = new Conta("001", 1000);
		Conta favorecido = new Conta("002", 100);

		double valorCobranca = 500;
		double saldoFavorecidoAntes = favorecido.getSaldo();
		double saldoPaganteAntes = pagante.getSaldo();

		pagante.transferir(favorecido, valorCobranca);

		double saldoFavorecidoDepois = favorecido.getSaldo();
		double saldoPaganteDepois = pagante.getSaldo();

		// Testando saldo do favorecido
		assertEquals(saldoFavorecidoAntes+valorCobranca, saldoFavorecidoDepois, 0.0);

		// Testando saldo do pagante
		assertEquals(saldoPaganteAntes-valorCobranca, saldoPaganteDepois, 0.0);
	}
	
	@Test (expected=OperacaoIlegalException.class)
	public void testTransferirException() throws OperacaoIlegalException{
		Conta pagante = new Conta("001", 1000);
		Conta favorecido = new Conta("002", 100);
	
		double valorCobranca = -10;
		pagante.transferir(favorecido, valorCobranca);
	}

}
