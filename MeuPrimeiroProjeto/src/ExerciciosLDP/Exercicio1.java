package ExerciciosLDP;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// T1. Dado o tamanho da base e da altura de um ret�ngulo, 
		//calcular a sua �rea e o seu per�metro. 
		
		Scanner scan = new Scanner(System.in);
		
		double base, altura, area, perimetro;
		
		System.out.println("Digite a base: ");
		base = scan.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = scan.nextDouble();
		
		area = base * altura;
		
		perimetro = base + base + altura + altura;
		
		System.out.println("A area do retangulo �: "+area);
		System.out.println("O perimetro do do retangulo �: "+perimetro);
		

	}

}
