package IfElse;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
//		== verifica se ambos os valores s�o iguais
//		> verifica se um valor � maior que o outro (10 > 9)
//		< verifica se um valor � menor que o outro (9 < 10)
//		>= maior igual
//		<= menor igual
//		!=
		
		int n1 = 1;
		if ( n1 > 0) {
			System.out.println("N1 � maior a zero");
		}
		
		if(n1 < 0) {
			System.out.println("N1 � menor que zero");
		}
		
		if(n1 == 0) {
			System.out.println("N1 � igual a zero");

		}
		
		if(n1>=0) {
			System.out.println("N1 � maior ou igual a zero");
		}
		if(n1 <= 0) {
			System.out.println("N1 � menor ou igual a zero");
		}
		if(n1 != 0 ) {
			System.out.println("N1 � diferente de zero");
		}
	}

}
