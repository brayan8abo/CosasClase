package ejercicios1;

import java.util.Scanner;

public class ejercicio0 {

	public static void main(String[] args) {

//		Escribir un programa que lea 6 enteros por teclado y los almacene en un array. Visualizar su contenido.
		int[] numerosEnteros = new int[6];

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.print("Ingrese el entero " + (i) + ": ");
			numerosEnteros[i] = leer.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("Posición " + (i) + ": " + numerosEnteros[i]);
		}

//		Idem con 6 cadenas de caracteres.
		leer.nextLine();
		String[] cadenaCaracteres = new String[6];

		for (int i = 0; i < 6; i++) {
			System.out.print("Ingresa una cadena:");

			cadenaCaracteres[i] = leer.nextLine();

			System.out.println("Cadena" + (i) + ": " + cadenaCaracteres[i]);

		}
//		Idem con 6 caracteres

		char[] caracter = new char[6];

		for (int i = 0; i < 6; i++) {
			System.out.println("Ingresa un caracter");
			caracter[i] = leer.nextLine().charAt(0);

			System.out.println("Caracter " + (i) + ": " + caracter[i]);

		}

		leer.close();
	}

}
