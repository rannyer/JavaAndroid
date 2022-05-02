package ExerciciosLDP;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//6. Ler dois números inteiros e exibir o quociente e
		//o resto da divisão inteira entre eles. 
		
		int num1, num2;
		int quociente, resto;
		
		System.out.println("Digite um numero: ");
		num1 =  scan.nextInt();
		System.out.println("Digite outro numero: ");
		num2 =  scan.nextInt();
		
		quociente = num1/num2;
		resto = num1%num2;
	}

}
