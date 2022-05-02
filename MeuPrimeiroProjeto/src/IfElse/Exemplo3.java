package IfElse;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String nome1,nome2;
		
		System.out.println("Digite nome 1");
		nome1 =  scan.next();
		
		System.out.println("Digite nome 2");
		nome2=scan.next();
		
		if(nome1.equalsIgnoreCase("Pedro")) {
			System.out.println("Os nomes são iguais");
		}else {
			System.out.println("Os nomes sao diferentes");
		}
		
	}

}
