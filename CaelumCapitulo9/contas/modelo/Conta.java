package br.com.caelum.contas.modelo;

public class Conta {
	protected String agencia;
	protected String cpf;
	protected int numero;
	protected String titular;
	protected double saldo;
	protected double limite;
	private Conta Conta;
	
	void saca(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo Insuficiente!");
		}else {
			this.saldo -= valor;
		}
	}
	void alteraLimite(double limite) {
		this.limite = limite;
	}
	void deposita(double valor) {
		this.saldo += valor;	
	}
	void getSaldo() {
		System.out.println(this.saldo+this.limite);
	}
	public void getTitular() {
		System.out.println(this.titular);
	}
	void setTitular(String titular) {
		this.titular = titular;
	}
	public void getCPF() {
		System.out.println(this.cpf);
	}
	void setCPF(String CPF) {
		this.cpf = CPF;
	}
	 public Conta getTipo() {
		return this.Conta;
	}
	 public void criaConta (Evento evento) {
		this.Conta	=	new	Conta();			
		this.Conta.setAgencia(evento.getString("agencia"));			
		this.Conta.setNumero(evento.getInt("numero"));			
		this.Conta.setTitular(evento.getString("titular")); 
	 }
}
		