package lista2;

import java.util.Scanner;

public class Questão5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero : ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O numero e par");
		}
		else {
			System.out.println("O numero e impar");
		}
		
		sc.close();
	}
}
