package banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testDebitarSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.debitar(10);
		assertEquals(10,c.getSaldo(),0.0);
	} 
}
