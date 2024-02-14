package ejercicios1;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
//		Escribir un programa que lea un entero por teclado y diga si se encuentra en el array números indicando las posiciones en las que se encuentra.
		Scanner leer = new Scanner(System.in);

		int[] numeros = { 12, 15, 13, 10, 8, 9, 13, 14 }; // DECLARO ARRAY CON LOS NUMEROS
		int numeroBuscado;

		System.out.println("Ingresa un número para buscar");
		numeroBuscado = leer.nextInt();
 estaPresente(numeros, numeroBuscado);	
 leer.close();

	}

	public static void estaPresente(int[] numeros, int numeroBuscado) {

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] == numeroBuscado) {
				System.out.println("El número " + numeroBuscado + " está presente en la posición" +": "+ i);

			}
			if (numeros[i] != numeroBuscado) {
				System.out.println("El número " + numeroBuscado + " no está presente en el array" + ": " +i);
			
			}
			
			
		}

	}

}
