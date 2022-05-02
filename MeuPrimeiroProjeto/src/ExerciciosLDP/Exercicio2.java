package ExerciciosLDP;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// T2. Dado o tamanho do lado de um quadrado, 
		//calcular a área e o perímetro do mesmo. 
		
		Scanner scan = new Scanner(System.in);
		
		double lado;
		double area, perimetro;
		
		System.out.println("Digite o lado do quadrado: ");
		lado =  scan.nextDouble();
		
		area =  lado * lado; //Math.pow(lado,2)
		
		perimetro = 4*lado;//lado + lado + lado+lado
		
		System.out.println("Area do quadrado: "+area);
		System.out.println("Perimetro do quadrado: "+perimetro);

	}

}
