package capituloQuatro;

public class Exercicio4e5 {
	public static void main(String[] args) {
	Conta ContaJader = new Conta();
	Conta ContaJMachado = new Conta();
	
	ContaJader.numero = "1234-5";
	ContaJader.agencia = "0001";
	ContaJader.titular = "Jader";
	ContaJader.saldo = 1010.0;
	ContaJader.dataAbertura = "10/10/2019";
	
	
	ContaJMachado.numero = "1234-5";
	ContaJMachado.agencia = "0001";
	ContaJMachado.titular = "Jader";
	ContaJMachado.saldo = 1010.0;
	ContaJMachado.dataAbertura = "10/10/2019";
	
	//contas com mesmos atributos, mas referências diferentes.
	if( ContaJader == ContaJMachado) {
		System.out.println("Contas Iguais.");
	}else{
		System.out.println("Contas Diferentes.");
	}
	//igualando as referências
	ContaJader = ContaJMachado;
	
	if( ContaJader == ContaJMachado) {
		System.out.println("Contas Iguais.");
	}else{
		System.out.println("Contas Diferentes.");
	}
	
	}
}
