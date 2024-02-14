package actividad4_6;

import java.util.Scanner;

public class ordenarNumeros {
//	Escribir un programa Java que pida por teclado el número de elementos que se van a introducir y 
//	posteriormente vaya pidiendo el valor de esos números enteros, los almacene en un array, los ordene y los muestre por pantalla.
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int elementos;

		System.out.println("Dame un números de elementos");
		elementos = leer.nextInt();
		int[] numeros = new int[elementos];

		for (int i = 0; i < elementos; i++) {
			System.out.println("Dame los números internos " + (i + 1));
			numeros[i] = leer.nextInt();

		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {

				if (numeros[i] < numeros[j]) {
					int cambiar = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = cambiar;

				}

			}

		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");

		}

	}

}
