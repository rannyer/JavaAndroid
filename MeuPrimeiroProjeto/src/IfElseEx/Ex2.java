package IfElseEx;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 2.	Fa�a um Programa que pe�a um valor e mostre na tela se o 
		//valor � positivo ou negativo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int n1 =  scan.nextInt();
		
		if (n1 > 0) {
			System.out.println(n1+" � positivo");
		}else if (n1==0) {
			System.out.println(n1+" � igual a 0");
		}else {
			System.out.println(n1+" � negativo");
		}

	}

}
