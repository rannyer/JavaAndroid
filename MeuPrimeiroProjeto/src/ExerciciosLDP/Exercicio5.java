package ExerciciosLDP;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5. Ler um número inteiro e exibir o seu sucessor. 
		
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero  = scan.nextInt();
		
		int sucessor =  numero+1;//numero += 1 ou numero =  numero+1;
		
		System.out.println(sucessor+" é o sucessor do número "+numero);
		
	}

}
