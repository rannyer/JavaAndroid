package IfElseEx;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3.	Faça um Programa que verifique se uma letra digitada é "F" ou "M" ou “O”. 
		//Conforme a letra escrever: F - Feminino, M - Masculino, O - Outro.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F,M,O");
		char letra = scan.next().charAt(0);
		
		if (letra == 'F') {
			System.out.println("Feminino");
		}else if(letra == 'M') {
			System.out.println("Masculino");
		}else if(letra =='O') {
			System.out.println("Outro");
		}else {
			System.out.println("Valor inválido");
		}
		
		System.out.println("Digite F,M,O");
		String letra2 =  scan.next();
		
		if(letra2.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}else if(letra2.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}else if (letra2.equalsIgnoreCase("O")) {
			System.out.println("Outro");
		}else {
			System.out.println("Inválido");
		}
	}

}
