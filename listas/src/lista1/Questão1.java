package lista1;

import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		float[] notas = new float[5];
		float resultado = 0f;
		int contador = 1;
		for (int i=0;i<5;i++) {
			System.out.println("Digite sua "+contador+" nota:");
			contador++;
			notas[i] = sc.nextFloat();
			resultado +=notas[i];
			
		}
		float media = resultado/5;
		System.out.println("Sua media foi " +media);
		sc.close();
	}
	
}
