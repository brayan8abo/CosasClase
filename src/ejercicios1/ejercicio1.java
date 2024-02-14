package ejercicios1;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
//		Versión 1: Escribir un programa que lea un entero por teclado y diga si se encuentra en el array números.
		Scanner leer = new Scanner(System.in);

		int[] numeros = { 12, 15, 13, 10, 8, 9, 13, 14 };

		System.out.println("Ingresa un número para buscar");
		int numeroBuscado = leer.nextInt();

		boolean numeroEncontrado = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeroBuscado == numeros[i]) {
				numeroEncontrado = true;
				System.out.println("El número ingresado esta en el ARRAY");
			}
		}
		if (!numeroEncontrado) {
			System.out.println("El número no esta en el ARRAY");
			leer.close();

		}

	}

}
