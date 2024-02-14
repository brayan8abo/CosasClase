package ejercicios1;

import java.util.Scanner;

public class ejercicio3 {
//	Escribir un método alternar() al que se le pase como argumento el array números y dos índices del array. 
//	El método alternará los valores contenidos en los dos índices. Se deberá comprobar que los índices están dentro del rango del array.
	public static void main(String[] args) {
//		Scanner leer = new Scanner(System.in);

		int[] numeros = { 12, 15, 11, 10, 8, 9, 13, 14 }; // DECLARO ARRAY CON LOS NUMEROS
		int indice = 0;
		int indice2 = 5;
		alternar(numeros, indice, indice2);

	}

	public static void alternar(int numeros[], int indice, int indice2) {
		if (indice >= 0 && indice < numeros.length && indice2 >= 0 && indice2 < numeros.length) {
			int cambiar = numeros[indice];
			numeros[indice] = numeros[indice2];
			numeros[indice2] = cambiar;
			// FOR PARA RECORRER
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);

			}
		} else {
			System.out.println("Indices alternados fuera del rango");

		}
	}
}
