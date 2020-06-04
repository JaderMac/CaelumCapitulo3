package CapituloDoze;

class TesteErro {
	public static void main (String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	static void metodo2() {
		System.out.println("Inicio do metodo2");
		Conta cc = new Conta();
		for (int i = 0; i <= 15; i++) {
			cc.deposita(i+1000);
			System.out.println(cc.getSaldo());
			if(i == 5) {
				cc = null;
				
			}
		}
		System.out.println("Fim do metodo2");	
	}
}
