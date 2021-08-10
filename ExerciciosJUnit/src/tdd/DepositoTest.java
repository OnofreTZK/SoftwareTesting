package tdd;
import static org.junit.Assert.*;

/*
 * Adaptado de James W. Grenning
 * 
 */

public class DepositoTest {

	public void testCreate() {
		String depositDate = "2015-03-13";
		int valor = 3000;
		
		Deposito d = new Deposito(depositDate, valor);
		assertEquals(depositDate, d.data());
	}
}
