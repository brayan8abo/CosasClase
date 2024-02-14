package activadaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
//	1. Realizar un programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer.
//	La lectura de números enteros termina cuando se introduzca el valor 0. 
//	Este valor no se guarda en el ArrayList. A continuación el programa mostrará por pantalla el número de valores que se han leído, el mayor, el menor, su suma y su media. 
//	Se mostrarán todos los valores leídos, 
//	indicando cuántos de ellos son mayores que la media.
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		ArrayList<Integer> valoresNumericos = new ArrayList<>(); // ME CREO EL ARRAY LIST

//		ME DECLARO VARIAS VARIABLES QUE ME AYUDARAN PARA SACAR LAS OPERACIONES DESEADAS
		int numeros;
		int mayor = 0;
		int menor = 999999999;
		int suma = 0;
		double media = 0;

//		HAGO UN DO WHILE PARA QUE ME PIDA NUMEROS, HASTA QUE INGRESE UN CERO, Y SEGUIDO GUARDA EN EL ARRAYLIST
		do {

			System.out.println("Ingresa un número por favor");
			numeros = leer.nextInt();

			if (numeros > 0) {
				valoresNumericos.add(numeros);
			} else {
				System.out.println("Has puesto [0] número erroneo \n");
			}

		} while (numeros != 0);

		System.out.println(valoresNumericos);

//		RECORRO EL ARRAY PARA SACAR EL NUMERO MAYOR Y JUNTO GUARDARLO EN LA VARIABLE SUMA Y SEGUIDO IMPRIMIR EN PANTALLA
		for (int i = 0; i < valoresNumericos.size(); i++) {
			if (valoresNumericos.get(i) > mayor) {

				mayor = valoresNumericos.get(i);

			}

		}
		System.out.println("El número mayor ingresado es " + mayor);

//		RECORRO EL ARRAY  PARA CALCULAR EL NUMERO MENOR, Y EN LA VARIABLE MENOR INDICADA ARRIBA PONGO EL LIMITE DE NUMEROS QUE ME PERMITE UNA VARIABLE DE TIPO INT.
//		Y ME VA HACIENDO LA COMPARACICON Y GUARDANDO, SU RESPECTIVO NUMERO MENOR, ASI COMO LO HACE EL METODO BURBUJA E IMPRIMO
		for (int i = 0; i < valoresNumericos.size(); i++) {
			if (valoresNumericos.get(i) < menor) {

				menor = valoresNumericos.get(i);

			}

		}
		System.out.println("El número menor ingresado es: " + menor);

		for (int i = 0; i < valoresNumericos.size(); i++) {

			suma += valoresNumericos.get(i); // ASIGNO EL VALOR DE LOS NUMEROS INGRESADOS EN EL ARRAY A LA VARIABLE SUMA
												// E IMPRIMO

		}
		System.out.println("La suma de los números ingresados es: " + suma);

//		for (int i = 0; i < valoresNumericos.size(); i++) {

		media = (suma / valoresNumericos.size()); // HAGO LA OPERACION PARA QUE ME CALCULE LA MEDIA, DE LOS NUMEROS
													// INTRODUCIDOS HACIENDO LA DIVISION CON EL NUMERO DE ELEMENTOS
													// EN EL ARRAY

//		}
		System.out.println("La media de los números ingresados es: " + media);
		int contador = 0;
		for (int i = 0; i < valoresNumericos.size(); i++) {
			
			if (valoresNumericos.get(i) > media) {
				contador++;

			}

		}
		System.out.println("Los números superios a la media son: " + contador);

	}

}
