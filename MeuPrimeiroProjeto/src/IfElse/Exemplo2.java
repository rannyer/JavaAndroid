package IfElse;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int n1 = scan.nextInt();
		
		if(n1 == 10) {
			System.out.println("Condi��o Verdadeira");
			System.out.println("Voc� digitou o n�mero 10");
			
		}else if (n1 ==9){
			
			System.out.println("Voc� nao digitou o numero 9");
			
		}else {
			System.out.println("Voc� nao digitou nem 10 nem 9");
		}
		
		
	}

}
