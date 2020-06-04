package caelum.capitulotres;
//Imprima	os	fatoriais	de	1	a	10.
public class exercicioQuatro {
	public static void main (String[] args){
		int fat=10;
		int n;
		int aux=1;
		
		for(n=fat;n>=1;n--){
			aux=aux*n;
		}
		System.out.println(aux);
	}
}
