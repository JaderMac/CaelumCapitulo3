package capituloCinco;

class Conta {
	
	public Conta() {
	}
	public Conta(String agencia) {
		this.agencia = agencia;
	}
	String agencia;
	private String CPF;
	private String titular;
	private double saldo;
	private double limite;
	
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
		System.out.println(this.CPF);
	}
	void setCPF(String CPF) {
		this.CPF = CPF;
	}
}

public class Exercicio1ate4 {
	
	public static void main (String[] args) {
		Conta nova = new Conta("0001");
		//Não vai funcionar pq Saldo é private!
		//System.out.println(nova.saldo);
		nova.setTitular("JaderMachado");
		nova.setCPF("392.912.111-00");
		
		System.out.println(nova.agencia);
		nova.alteraLimite(1000.0);
		nova.deposita(1000.0);
		nova.getTitular();
		nova.getCPF();
		nova.getSaldo();	
	}
}
