package IfElse;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
//		== verifica se ambos os valores são iguais
//		> verifica se um valor é maior que o outro (10 > 9)
//		< verifica se um valor é menor que o outro (9 < 10)
//		>= maior igual
//		<= menor igual
//		!=
		
		int n1 = 1;
		if ( n1 > 0) {
			System.out.println("N1 é maior a zero");
		}
		
		if(n1 < 0) {
			System.out.println("N1 é menor que zero");
		}
		
		if(n1 == 0) {
			System.out.println("N1 é igual a zero");

		}
		
		if(n1>=0) {
			System.out.println("N1 é maior ou igual a zero");
		}
		if(n1 <= 0) {
			System.out.println("N1 é menor ou igual a zero");
		}
		if(n1 != 0 ) {
			System.out.println("N1 é diferente de zero");
		}
	}

}
