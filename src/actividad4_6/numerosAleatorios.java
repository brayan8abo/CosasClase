package actividad4_6;

import java.util.Random;

public class numerosAleatorios {
//	2. Realizar un programa que genere 20 números enteros aleatorios entre 100 y 199 y los almacene en un array, no deberá haber números repetidos. 
//	El programa debe crear un nuevo array con los números primos que haya entre esos 20 números. Luego debe mostrar los dos arrays.
	public static void main(String[] args) {

		Random numAleatorio = new Random(); // SE IMPORTA LA UTILIDAD DE RANDOM PARA GENERAR LOS NUMEROS ALEATORIOS
		int numero;

		int CANTIDAD_NUMEROS = 20;
		int[] arrayAleatorio = new int[CANTIDAD_NUMEROS];

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {

			boolean fin = true; // INICIALIZO A TRUE PARA QUE INGRESE EN EL DO WHILE Y ME GENERÉ LOS NUMEROS
								// ENTRE 1 Y 50
			do {

				numero = numAleatorio.nextInt(100, 199);

				if (comprobacionesNumeros(arrayAleatorio, numero)) { // GENERACIÓN DE NUMEROS ALEATORIOS, EN CONJUNTO
																		// CON EL
					arrayAleatorio[i] = numero;
					fin = false;
				}

			} while (fin); // SALE DEL DO WHILE, CUANDO COMPLETA LA GENERACIÓN DE NÚMEROS

		}
		for (int i = 0; i < arrayAleatorio.length; i++) {
			System.out.println(" numero:" +  (i + 1) + " " + arrayAleatorio[i]);
		esPrimo(arrayAleatorio, CANTIDAD_NUMEROS);

		}
	}

	public static boolean comprobacionesNumeros(int[] array, int numero) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) { // SI array[i] QUE EQUIVALE A ganadora ES IGUAL DEVUELVE Y SALE
				return false;
			}
		}

		return true;

	}

	public static void esPrimo(int[] array, int numeros) {
	

		
		for (int i = 2; i <= array.length; i++) {
			int contador = 0;
			
			boolean esPrimo = true;
			for (int j = 2; j <= i - 1; j++) {
				
				int[] primos = new int[contador];

				if (i % j == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				contador++;
			}
		}

	}
}
