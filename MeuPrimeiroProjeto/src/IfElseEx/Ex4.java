package IfElseEx;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// 4.	Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		
		Scanner scan = new Scanner(System.in);
		
		String vogal = "AEIOU";
		String consoante = "B C D F G H J K L M N P Q R S T V W X Y Z ";
		
		System.out.println("Digite uma letra: ");
		String letra =  scan.next();
		
		
		if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || 
				letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("o") || 
				letra.equalsIgnoreCase("U")) {
			System.out.println("Vogal");
		}else{
			System.out.println("Consoante");
		}
		
		
		
		
//		if (letra.equalsIgnoreCase("A")) {
//			System.out.println("Vogal");
//		} else if (letra.equalsIgnoreCase("E")) {
//			System.out.println("Vogal");
//		}else if (letra.equalsIgnoreCase("I")) {
//			System.out.println("Vogal");
//		}else if (letra.equalsIgnoreCase("O")) {
//			System.out.println("Vogal");
//		}else if (letra.equalsIgnoreCase("U")) {
//			System.out.println("Vogal");
//		}else {
//			System.out.println("Consoante");
//		}
		
//		if (vogal.contains(letra)) {
//			System.out.println("Vogal");
//		} else if(consoante.contains(letra)) {
//			System.out.println("Consoante");
//		}else {
//			System.out.println("Valor invalido");
//		}
		

	}

}
