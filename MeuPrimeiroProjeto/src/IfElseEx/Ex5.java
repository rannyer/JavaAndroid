package IfElseEx;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
//		5.	Fa�a um programa para a leitura de duas notas parciais de um aluno. 
		//O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
//			A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
//			A mensagem "Reprovado", se a m�dia for menor do que sete;
//			A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
		
		double nota1, nota2, media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1 =  scan.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 =  scan.nextDouble();
		
		media  =  (nota1+nota2)/2;
		
		if(media >=7 && media<10) {
			System.out.println("Aprovado");
		}else if (media < 7) {
			System.out.println("Reprovado");
		}else if(media == 10) {
			System.out.println("Aprovado com distin��o");
		}
		
		
	}

}
