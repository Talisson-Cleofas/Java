package application;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		int num;
		int [] vect = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect [i] = sc.nextInt();
		}
        num = 0;
        System.out.println();
        System.out.println("Numeros Pares:");
		for (int i = 0; i<n; i++) {
			if (vect [i] % 2 == 0) {
				System.out.printf("%d  ", vect[i]);
	            num++;

				
	            
			
			 
			}
		 }
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", num);
		sc.close();
	}

}
