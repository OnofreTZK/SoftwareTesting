package param;

public class CalculoImpostoRenda {
	
	
	/**
	 * Este método calcula o imposto a ser pago baseado no valor de uma dada compra.
	 * 
	 * Se  1201 <= valor <= 5000 deve pagar 10% de imposto
	 * Se  5001 <= valor <= 10000 deve pagar 15% de imposto
	 * Se  valor > 10000 deve pagar 20% de imposto
	 * Se  valor < 1201 deve pagar 0% de imposto
	 * 
	 * @param valor
	 */

	public static void calculaImposto(double valor) {
	       //Declaração de Variáveis
	       double imposto;
	       double impostotot;
	       String porcento;

	        if (valor >= 1201 && valor <= 5000) {
	                 imposto = 1.1;
	                 porcento = "10%";
	                 impostotot = 0.1;
	        } else if(valor >= 5001 && valor <= 10000){
	                 imposto = 1.15;
	                 porcento = "15%";
	                 impostotot = 0.15;
	       } else{
	                imposto = 1.2;
	                porcento = "20%";
	                impostotot = 0.2;
	       }
	     
	       //Saída de dados
	       System.out.println("Valor em Dinheiro: R$" + (valor*impostotot));
	    }
	
	
	public static void main(String[] args) {
		calculaImposto(200.5);
	}
}
