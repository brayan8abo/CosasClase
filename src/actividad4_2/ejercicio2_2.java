package actividad4_2;

import java.util.Scanner;

public class ejercicio2_2 {
//	2. Mejorar el programa anterior de forma que el array de caracteres con las letras de la ‘A’ a la ‘Z’ se rellene de forma automática teniendo en cuenta que en 
//	la tabla ASCII la letra 'A' corresponde al número 65 y la letra 'Z' corresponde al número 90. (https://es.wikipedia.org/wiki/ASCII Links to an external site.)
	public static void main(String[] args) {
		char[] abecedario = new char[26];

		Scanner leer = new Scanner(System.in);

		int ascii = 65;
		for (int i = 0; i < abecedario.length; i++, ascii++) {

			abecedario[i] = (char) ascii;

		}

		int indice;
		String letra = "";
		do {
			System.out.println("Ingresa una posición para buscar en el abecedario");
			indice = leer.nextInt();

			if (indice >= 0) {
				letra += abecedario[indice];
				System.out.println("La letra ingresada " + abecedario[indice]);

			} if(indice <0 && indice >25) {
				System.out.println("FIN");

			}
		} while (indice >= 0);
		System.out.println("La cadena final es: " + letra);
leer.close();
	}

}
