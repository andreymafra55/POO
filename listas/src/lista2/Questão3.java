package lista2;

import java.util.Scanner;

public class Questão3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float baseMaior = 0f;
		float baseMenor = 0f;
		float altura = 0f;
		
		System.out.println("Insira o tamanho da base maior em cm :");
		baseMaior = sc.nextFloat();
		System.out.println("Insira o tamanho da base menor em cm :");
		baseMenor = sc.nextFloat();
		System.out.println("Insira a altura em cm :");
		altura = sc.nextFloat();
		
		float area = ((baseMaior + baseMenor)*altura)/2;
		System.out.println("A area do trapezio em cm2 e : "+area);
		
		sc.close();
	}
}
