package actividad4_4;

//	Completar los métodos siguientes para crear un programa que simule el juego de la lotería primitiva.

//	Tenemos dos arrays de 6 números entre 1 y 50: uno con la combinación ganadora que debe generarse aleatoriamente ; y otro con la apuesta del usuario que hemos leído por teclado.
//	Se comprueba el número de aciertos y se imprime el resultado.
//
//	Clase predefinida Random genera valores aleatorios del tipo que queramos.
//	Para utilizar esta clase hay que importar la clase y definir un objeto de la clase Random.

/*
 * Programa que simula el juego de la lotería primitiva
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimitivaModular {
	public static Scanner sc = new Scanner(System.in);
	public static Random rnd = new Random();

	public static void main(String[] args) {

		// Definición de las variables
		final int CANTIDAD_NUMEROS = 6; // Números en una apuesta de lotería primitiva
		int[] ganadora = new int[CANTIDAD_NUMEROS]; // combinación ganadora
		int[] miPrimitiva = new int[CANTIDAD_NUMEROS]; // apuesta del usuario

		// Cargar/Inicializar el array ganadora sin repetidos
		inicializarArrayAleatorio(ganadora);

		// Cargar/Inicializar el array miPrimitiva sin repetidos
		inicializarArrayUsuario(miPrimitiva);

		// imprimir aciertos
		System.out.println("La combinación ganadora es  : " + Arrays.toString(ganadora));
		System.out.println("tu apuesta es : " + Arrays.toString(miPrimitiva));
		System.out.println("Has tenido " + comprobarAciertos(ganadora, miPrimitiva) + " acierto(s)");
	}

	/************************************************************************/
	/* El método va a inicializar un array con números aleatorios */
	/* Si el número generado ya está en el array , se genera otro número */
	/************************************************************************/
	static void inicializarArrayAleatorio(int[] vector) {

		Random numAleatorio = new Random(); // SE IMPORTA LA UTILIDAD DE RANDOM PARA GENERAR LOS NUMEROS ALEATORIOS
		int numero;

		for (int i = 0; i < vector.length; i++) {

			boolean fin = true; // INICIALIZO A TRUE PARA QUE INGRESE EN EL DO WHILE Y ME GENERÉ LOS NUMEROS
								// ENTRE 1 Y 50
			do {

				numero = numAleatorio.nextInt(49) + 1;

				if (comprobacionesNumeros(vector, numero, i)) { // GENERACIÓN DE NUMEROS ALEATORIOS, EN CONJUNTO CON EL
																// METODO DE COMPROBACIÓN QUE ESTA AL FINAL DE LA CLASE
					vector[i] = numero;
					fin = false;
				}

			} while (fin); // SALE DEL DO WHILE, CUANDO COMPLETA LA GENERACIÓN DE NÚMEROS

		}
	}

	/****************************************************************************/
	/* El método va a inicializar un array con números pedidos al usuario */
	/* Si el número generado ya está en el array o está fuera del rango 1..49 */
	/* se pide al usuario que introduzca otro número */
	/****************************************************************************/
	static void inicializarArrayUsuario(int[] vector) {
		Scanner leer = new Scanner(System.in); // IMPORTO SCANNER
		int numero;

		for (int i = 0; i < vector.length; i++) { // RECORRO ARRAY, QUE EN ESTE CASO, VECTOR HACE REFERENCIA, A
													// miPrimitiva.
			boolean fin = true;

			do {
				System.out.println("Introduce tu número de apuesta"); // SE PIDE AL USUARIO APUESTA
				numero = leer.nextInt();

				if (comprobacionesNumeros(vector, numero, i)) {
					vector[i] = numero; // SE VA GUARDANDO EN EL MOMENTO QUE RECORRE, LAS APUESTAS INGRESAS POR USUARIO
					fin = false;

				} else {
					if (numero < 1 || numero > 50) { // COMPROBACIÓN PARA SABER SI EL NÚMERO DE LA APUESTA DEL USUARIO
														// ESTA FUERA DEL RANGO
						System.out.println("El número : " + numero
								+ " esta fuera de rango para poder jugar loteria \n Tu número tiene que estar entre el 1 y el 50");

					} else {

						System.out.println("El número : " + "[" + numero + "]"
								+ " esta repetido en una de tus posiciones poder jugar la loteria"); // COMPROBACIÓN
																										// PARA
																										// DETERMINAR
																										// QUE NO ACEPTE
																										// NUMEROS
																										// IGUALES EN TU
																										// APUESTA
					}
					System.out.println("Vuelve a introducir un número ");

				}
			} while (fin);
		}
		leer.close();
	}

	/*****************************************************************************/
	/* El método recibe dos arrays y comprueba cuantos números están contenidos */
	/* en los dos arrays . Devuelve el número de aciertos */
	/*****************************************************************************/
	static int comprobarAciertos(int[] vector1, int[] vector2) {

		int aciertos = 0;

		for (int i = 0; i < vector2.length; i++) { // RECORREMOS EL ARRAY DE miPrimitiva

			for (int j = 0; j < vector2.length; j++) {

				if (vector1[i] == vector2[j]) { // Y AQUÍ HACEMOS UNA COMPARACIÓN DE SI VECTOR1 que equivale a ganadora,
												// ES IGUAL A VECTOR2 que equivale a miPrimitiva, DE SER ASI, LE SUMA EL VALOR A LA VARIABLE ACIERTOS

					aciertos++;
				}

			}

		}

		return aciertos;

	}

	public static boolean comprobacionesNumeros(int[] array, int numero, int indice) {
		if (numero < 1 || numero > 50) { // SI LOS NUMEROS ESTAN FUERA DE ESTE RANGO HAGO UN SALTO DE LINEA

			System.out.println();
			return false;
		}

		for (int i = 0; i < indice; i++) {
			if (array[i] == numero) { // SI array[i] QUE EQUIVALE A ganadora ES IGUAL DEVUELVE Y SALE
				return false;
			}
		}

		return true;
		
	
	}
}
