package lista1;

public class Questão6 {
	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		for(int i = 0;i < 100; i++) {
			numeros[i] = (int)(Math.random()*100);
			if(numeros[i]%2 == 0 && numeros[i] != 0) {
				System.out.println(numeros[i]);
			}
		}
	}
}
