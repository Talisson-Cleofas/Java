package application;

import java.util.Locale;
import java.util.Scanner;

import entities.P_A;

public class altura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double soma;
		int n;
		int menores;
		double mediaAltura;
		double percent;

		System.out.print("Quantas pessoas serão inseridas? ");
		n = sc.nextInt();
		P_A[] vect = new P_A[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da" + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int indade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new P_A(nome, indade, altura);

		}
		soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[1].getAltura();
		}
		mediaAltura = soma / vect.length;

		System.out.printf("\nAltura media: %.2f%n", mediaAltura);

		menores = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		percent = 0.0;
		percent = menores * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

		sc.close();

	}

}
