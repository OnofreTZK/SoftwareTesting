package tdd;

import java.util.ArrayList;

public class ContaCorrente {
	
	private double saldo;
	private String nome;
	private ArrayList<String> operacoes;
	private ArrayList<Double> balanco;

	// Construtores ----------------------------------------------------------
	public ContaCorrente() {
		this.saldo = 0.0;
		this.operacoes = new ArrayList<String>();
		this.balanco = new ArrayList<Double>();
		balanco.add(this.saldo);
		operacoes.add("Nenhuma transação realizada\n");
	}
	
	// Com balanço inicial
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
		this.operacoes = new ArrayList<String>();
		this.balanco = new ArrayList<Double>();
		balanco.add(this.saldo);
		operacoes.add("Nenhuma transação realizada\n");
	}
	
	// Com nome inicial
	public ContaCorrente(String nome) {
		this.nome = nome;
		this.saldo = 0.0;
		this.operacoes = new ArrayList<String>();
		this.balanco = new ArrayList<Double>();
		balanco.add(this.saldo);
		operacoes.add("Nenhuma transação realizada\n");
	}

	// Com nome e balanço inicial
	public ContaCorrente(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.operacoes = new ArrayList<String>();
		this.balanco = new ArrayList<Double>();
		balanco.add(this.saldo);
		operacoes.add("Nenhuma transação realizada\n");
	}
	//------------------------------------------------------------------------
	
	// Setters
	public void setNome(String nome){
		this.nome = nome;
	}

	// Getters
	public double saldo(){
		return this.saldo;
	}

	// Metodos
	public void creditar(Deposito deposito){
		
		if(this.saldo == 0) {
			operacoes.clear();
		}

		// Creditando
		this.saldo += deposito.valor();

		// Atualizando lista do balanço
		balanco.add(this.saldo);
		
		// Salvando data, tipo e valor da transação
		operacoes.add(deposito.data() + "\t" + "Deposito\t$" + 
		deposito.valor() + "\n");

	}

	private String historicoTransacoes(){
		String temp = "";

		for (int i = 0; i < operacoes.size(); i++){
			temp += operacoes.get(i);
		}

		return temp;
	}

	public String extrato() {

		String historico = this.historicoTransacoes();

		return "Conta de " + this.nome + "\n" +
			"Saldo Inicial $" + balanco.get(0) + "\n" +
			"Saldo Final $" + this.saldo + "\n" +
			historico;
	}

}
