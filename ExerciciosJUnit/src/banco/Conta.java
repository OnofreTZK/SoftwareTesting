package banco;


public class Conta{

	private String codigo;
	private double saldo = 0;

	public Conta (String p_id, double p_saldo) { 
		this.saldo = p_saldo;
	    this.codigo = p_id;
	}
	
	public double getSaldo() {
		return saldo;
	} 

	public double debitar (double valor) throws OperacaoIlegalException {
		
		
		if( valor > 0 ){
	         saldo = saldo-valor; 
	    }
		else{
			throw new OperacaoIlegalException();
		}
	   return saldo;

	}


	public double creditar (double valor) throws OperacaoIlegalException {
		
		
		if(valor > 0 ){
	         saldo = saldo+valor; 
	    }
		else{
			throw new OperacaoIlegalException();
		}
	   return saldo;

	}
	
	/* Este método transfere o valor da conta origem para a conta destino. Se o 
	 * valor for negativo ou superior que o saldo da conta origem uma 
	 * OperacaoIlegalException é lançada*/

	 public void transferir (Conta destino, double valor) throws OperacaoIlegalException {
		 this.creditar(valor);
		 this.debitar(valor);
      }	
	
	 
	}

