package application;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0;
		double media;
		
		System.out.print("Quantos numeros você vai digitar? ");
		n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
		System.out.print("Digite um numero: ");
		vect [i] = sc.nextDouble();
		
		}
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect [i];
		}
		 
		media = soma / vect.length;
		
		System.out.print("Vlores = ");
		
		for (int i = 0; i < vect.length; i++) {
		System.out.printf("%.1f ", vect [i]);
			
			
		}
		System.out.printf("\nSoma = %.2f%n", soma );
		System.out.printf("media = %.2f%n", media );
		
		

		sc.close();

	}

}
