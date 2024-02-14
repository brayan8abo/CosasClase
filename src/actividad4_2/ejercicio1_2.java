package actividad4_2;

import java.util.Scanner;

public class ejercicio1_2 {
	public static void main(String[] args) {
//		1. Construir un array de caracteres que contenga las letras de la ‘A’ a la ‘Z’ (solo las mayúsculas sin tener en cuenta las letras 'Ñ', 'LL'...). 
//		Posteriormente se pedirán posiciones del array por teclado y, si la posición es correcta, se añadirá el carácter correspondiente a una cadena que se imprimirá al final, 
//		se dejará de insertar cuando se introduzca un número negativo.

		String[] abecedario = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		Scanner leer = new Scanner(System.in);

		int indice;
		String letra = "";
		do {
			System.out.println("Ingresa una posición para buscar en el abecedario");
			indice = leer.nextInt();
			

			if (indice >= 0) {
				letra += abecedario[indice];
				System.out.println("La letra ingresada" + abecedario[indice]);
				
			} else {
				System.out.println("FIN");

			}
		} while (indice >= 0);
		System.out.println("La cadena final es: "  + letra); 
leer.close();
	}

}
