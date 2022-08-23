package lista1;

public class Questão3 {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		for(int i = 0;i < 100; i++) {
			numeros[i] = (int)(Math.random()*100);
        	System.out.println(numeros[i]);
		}
		System.out.println("O inverso é :");
		for(int j = 99; j >= 0; j--) {
			System.out.println(numeros[j]);
		}
	}
}
