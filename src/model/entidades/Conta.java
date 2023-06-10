package model.entidades;

import model.execao.Execao;

public class Conta {
	
	private Integer numeroConta;
	private String nome;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta(Integer numeroConta, String nome, Double saldo, Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	
	public void deposito(double qtdeDeposito) {	
		saldo += qtdeDeposito;
	}
	
	public void saque(double qtdeSaque) throws Execao {
		if(qtdeSaque > saldo) {
			throw new Execao("Operacao invalida(SEM SALDO SUFICIENTE)");
		}
		else if(qtdeSaque > limiteSaque) {
			throw new Execao("Operacao invalida(LIMITE DE SAQUE EXEDIDO)");
		}
		else {
			saldo -= qtdeSaque;
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Numero da conta: " + numeroConta +
		" Nome: " + nome +
		" Saldo: " + saldo +
		" Limite saque: " + limiteSaque;
		
	}

}
