package ExerciciosLDP;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dado os três lados de um triângulo determinar o perímetro do mesmo. 
		Scanner scan = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		double perimetro;
		
		System.out.println("Digite o lado 1 do triangulo:");
		lado1 =  scan.nextDouble();
	
		System.out.println("Digite o lado 2 do triangulo:");
		lado2 =  scan.nextDouble();
		
		System.out.println("Digite o lado 3 do triangulo:");
		lado3 =  scan.nextDouble();
		
		perimetro = lado1 + lado2 + lado3;
		
		System.out.println("O perimetro do triangulo é: "+perimetro);
		
		

	}

}
