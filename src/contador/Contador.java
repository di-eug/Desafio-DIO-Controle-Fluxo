package contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primeiroParâmetro = sc.nextInt();
		int segundoParâmetro = sc.nextInt();
		
		try{
			
			contar(primeiroParâmetro,segundoParâmetro);
			
		}catch(Exception e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		};
		
		sc.close();
	}
	
	static void contar(int primeiro, int segundo) throws ParâmetroInvalidoException{
		if(primeiro > segundo) {
			throw new ParâmetroInvalidoException();
		};
		
		if(primeiro == segundo) {
			System.out.println("Os dois parâmetro são iguais, logo não houve iterações");}

		int contagem = segundo - primeiro;
		
		for(int i=1; contagem>0 ; i++, contagem--) {
			System.out.println("imprimindo o número " + i);
		};
	};
}
