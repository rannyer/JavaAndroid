package IfElse;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n1 = scan.nextInt();
		
		if(n1 == 10) {
			System.out.println("Condição Verdadeira");
			System.out.println("Você digitou o número 10");
			
		}else if (n1 ==9){
			
			System.out.println("Você nao digitou o numero 9");
			
		}else {
			System.out.println("Você nao digitou nem 10 nem 9");
		}
		
		
	}

}
