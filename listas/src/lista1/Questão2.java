package lista1;

import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int contador = 1;
		for(int i = 0; i<10;i++) {
			System.out.println("Digite o "+contador+" numero:");
			contador ++;
			numeros[i] = sc.nextInt();
		}
		for(int j = 9; j >=0; j--) {
			System.out.println(numeros[j]);
		}
		sc.close();
	} 
}
