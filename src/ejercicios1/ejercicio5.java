package ejercicios1;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) { // castear en el 2
//		Escribir un método longitudMax() al que se le pase un array de cadenas de caracteres y devuelva la cadena que tiene la longitud más larga.
		String[] cadenas = new String[3];

		longitudMax(cadenas);

	}

	public static void longitudMax(String cadenas[]) {
		//String cadena = " ";
		Scanner leer = new Scanner(System.in);
		int numeroCaracteres = 0;
		String palabra= "";
		for (int i = 0; i < cadenas.length; i++) {
			

			System.out.println("Ingresa una cadena de caracteres");
			cadenas[i] = leer.nextLine();

		}

		for (int i = 0; i < cadenas.length; i++) {
			if (cadenas[i].length() > numeroCaracteres) {
				//cadena = cadenas[i];
				numeroCaracteres = cadenas[i].length();
				palabra = cadenas[i];
			}

			leer.close();
		}
		
		System.out.println("La palabra ingresada es: " + "[" +  palabra + "]" + " y tiene " + numeroCaracteres + " caracteres");

	}

}
