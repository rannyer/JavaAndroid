package ExerciciosLDP;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5. Ler um n�mero inteiro e exibir o seu sucessor. 
		
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero  = scan.nextInt();
		
		int sucessor =  numero+1;//numero += 1 ou numero =  numero+1;
		
		System.out.println(sucessor+" � o sucessor do n�mero "+numero);
		
	}

}
