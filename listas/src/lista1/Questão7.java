package lista1;

public class Questão7 {
	public static void main(String[] args) {
		int[] numeros = new int [100];
		int maior = 0,menor = 0;
		for(int i = 0;i < 100; i++) {
			numeros[i] = (int)(Math.random()*100);
        	System.out.println(numeros[i]);
        	if(numeros[i] > maior) {
        		maior = numeros[i];
        	}else if(numeros[i] < menor) {
        		menor = numeros[i];
        	}
		}
		System.out.println("O maior valor e : "+maior+" \n o menor valor e : "+ menor);
	}
}
