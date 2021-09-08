package br.ufrn.imd.eclemma;


public class Conta{

	private double saldo = 0.0;
	private String codigo = "000";

	public Conta (String p_id, double p_saldo) throws OperacaoIlegalException {
		if(p_saldo >  0) {
			this.saldo = p_saldo;
			this.codigo = p_id;
		}
		else {
			throw new OperacaoIlegalException();
		}
	}
	
	public double getSaldo() {
		return saldo;
	} 
	
	public String getCodigo() {
		return codigo;
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
		 if(valor > 0 ) {
			 destino.creditar(valor);
			 this.debitar(valor);
		 } 
		 else {
			 throw new OperacaoIlegalException();
		 }
      }	
	
	 
}
