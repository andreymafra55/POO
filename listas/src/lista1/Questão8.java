package lista1;

public class Questão8 {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		int media =0;
		for(int i = 0;i < 100; i++) {
			numeros[i] = (int)(Math.random()*100);
			media += numeros[i];        	
		}
		System.out.println("A media é : "+media/5);
	}
}
