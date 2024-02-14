package ejercicios1;

import java.util.Scanner;

public class ejercicio1V2 {
//	Escribir un método estaPresente() al que se le pase como argumento el array números y un entero y devuelva si el entero se encuentra en el array.
//	Opcional: parar la búsqueda en cuanto se ha encontrado el número.
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int[] numeros = { 12, 15, 13, 10, 8, 9, 13, 14 }; // DECLARO ARRAY CON LOS NUMEROS
		int numeroBuscado;

		System.out.println("Ingresa un número para buscar");
		numeroBuscado = leer.nextInt();
		
	estaPresente(numeros, numeroBuscado);
	
	
leer.close();

	}

	public static void estaPresente(int[] numeros, int numeroBuscado) {
		boolean numero =false;
		for (int i = 0; i < numeros.length && numero == false; i++) {
			
			if (numeros[i] == numeroBuscado) {
				System.out.println("El número " + numeroBuscado + " está presente en el array.");
				numero =true;
				
			}
			if (numeros[i] != numeroBuscado) {
				System.out.println("El número " + numeroBuscado + " no está presente en el array.");
			}
		}

	}

}
