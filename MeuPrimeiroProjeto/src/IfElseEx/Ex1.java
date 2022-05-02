package IfElseEx;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 1.	Faça um Programa que peça dois números e imprima o maior deles.
		Scanner scan = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite n1: ");
		n1 =  scan.nextInt();
		
		System.out.println("Digite n2: ");
		n2 =  scan.nextInt();
		
		if(n1>n2) {
			System.out.println("N1: "+n1+ " é o maior");
		}else if(n2>n1) {
			System.out.println("N2: "+n2+" é o maior");
		}else if(n1 == n2) {
			System.out.println("Os números são iguais");
		}
	}

}
