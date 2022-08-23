package lista2;

import java.util.Scanner;

public class Questão4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primeiro;
		int segundo;
		
		System.out.println("Digite o primeiro numero");
		primeiro = sc.nextInt();
		System.out.println("Digite o segundo numero");
		segundo = sc.nextInt();
		
		if(primeiro > segundo) {
			System.out.println("O primeiro e maior");
		}else {
			System.out.println("O segundo e maior");
			
		sc.close();
		}
	}
}
