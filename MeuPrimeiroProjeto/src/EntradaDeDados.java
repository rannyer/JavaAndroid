import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		String nome;
		
		System.out.println("Digite seu nome:");
		nome = scan.next();
		
		System.out.println("Bem vindo "+nome);
		
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Voc� tem "+idade+" anos");
		
		System.out.println("Digite sua altura:");
		double altura =  scan.nextDouble();
		
		System.out.println("Voc� tem "+altura+"m de altura");

	}

}
