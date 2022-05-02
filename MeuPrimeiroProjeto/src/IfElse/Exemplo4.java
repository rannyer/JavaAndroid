package IfElse;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		char a1, a2;

	
		
		String  nome = "Pedro";
		
		
		System.out.println("Digite a letra A");
		a1 = scan.next().charAt(0);
		
		System.out.println(a1);
		
	 if ('B' == 'A') {
		System.out.println("Os dois chars sao iguais");
	}else {
		System.out.println("Os dois chars sao diferentes");
	}
		
	}

}
