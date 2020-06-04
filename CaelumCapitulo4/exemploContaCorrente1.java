package capituloQuatro;
public class exemploContaCorrente1 {
	
	int numero;
	String titular;
	Double saldo;
	
	boolean saca(double valor) {
		if	(this.saldo	<	valor)	{
			return false;
		}else{												
			this.saldo	=	this.saldo	-	valor;
			return true;
		}
	}
	void	deposita(double	quantidade)	{								
		this.saldo	+=	quantidade;	
	}
}

class programa {
	public	static	void	main(String[]	args)	{	
	exemploContaCorrente1 minhaConta;
	minhaConta = new exemploContaCorrente1();
	
	minhaConta.numero = 001;
	minhaConta.titular = "Jader";
	minhaConta.saldo = 1000.0;
	
	boolean	consegui	=	minhaConta.saca(2000);
	if	(consegui)	{
		System.out.println("Consegui sacar");
	}	else	{
		System.out.println("Nãoconsegui sacar");
	}
  }
}

