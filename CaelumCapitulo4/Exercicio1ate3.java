package capituloQuatro;
class Conta {
	String numero;
	String agencia;
	String titular;
	String dataAbertura;
	double saldo;

	void saca(double quantidade) {
		if (this.saldo>=quantidade) {
			this.saldo = this.saldo - quantidade;
		}else{
			System.out.println("Não há saldo suficiente para retirar a quantia");
		}
	}
	
	double deposita(double quantidade) {
		return this.saldo += quantidade;
	}
	
	double calculaRendimento () {
		return (this.saldo);
	}
	
	void imprimeDados(){
		System.out.println(this.numero);
		System.out.println(this.agencia);
		System.out.println(this.titular);
		System.out.println(this.saldo);
		System.out.println(this.dataAbertura);
	}
	
}
public class Exercicio1ate3 {
	public	static	void	main(String[]	args)	{	
	Conta ContaUm = new Conta();
	ContaUm.numero = "1234-5";
	ContaUm.agencia = "0001";
	ContaUm.titular = "Jader";
	ContaUm.saldo = 1010.0;
	ContaUm.dataAbertura = "10/10/2019";
	ContaUm.deposita(1010.0);
	
	ContaUm.imprimeDados();	
	}
}