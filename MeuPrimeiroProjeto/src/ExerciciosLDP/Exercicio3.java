package ExerciciosLDP;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//  Dado o tamanho do raio de uma circunferência, 
		//calcular a área e o perímetro da mesma. 
		
		Scanner scan = new Scanner(System.in);
		
		double raio, area, perimetro;
		
		System.out.println("Digite o tamanho do raio:");
		raio = scan.nextDouble();
		
		area = Math.PI * (raio*raio);// Math.PI * Math.pow(raio,2);
		
		perimetro = 2 * Math.PI * raio;
		
		System.out.println("Area do circulo: "+area);
		System.out.println("Perimetro do circulo: "+perimetro);

	}

}
