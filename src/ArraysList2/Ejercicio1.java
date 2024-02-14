package ArraysList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
//	Escribir un programa que:
//    cree una lista (arrayList) de cadenas de caracteres
//    inserte las cadenas PHP, Java, C++, Python y visualice la lista con un for
//    inserte Pascal en la primera posición y visualice de nuevo la lista (Pascal, PHP, Java, C++, Python)
//    Recuperar el 3º elemento de la lista : Java
//    Buscar en qué posición se encuentra el elemento Python.
//    Borrar Pascal y visualizar la lista
//    Borrar todos los elementos de la lista y visualizarla de nuevo
//
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		ArrayList<String> cadenaCaracteres = new ArrayList<>() {
			{
				add("PHP");
				add("Java");
				add("C++");
				add("Python");
			}

		};

		System.out.println("Lista original:");
		for (int i = 0; i < cadenaCaracteres.size(); i++) {
			System.out.println(cadenaCaracteres.get(i));

		}

		System.out.println("\n----String nuevo----\n");

		cadenaCaracteres.add(0, "Pascal");

		for (int i = 0; i < cadenaCaracteres.size(); i++) {

			System.out.println(cadenaCaracteres.get(i));

		}
		System.out.println("\nPosición 3(2º indice) recuperada " + "\n" + cadenaCaracteres.get(2));

		String elementoABuscar = "Python";

		// Variable para almacenar la posición del elemento (si se encuentra)
		int posicion = -1;

		// Iterar sobre el array
		for (int i = 0; i < cadenaCaracteres.size(); i++) {
			// Comprobar si el elemento en la posición actual es igual al elemento a buscar
			if (cadenaCaracteres.contains(elementoABuscar)) {
				// Almacenar la posición del elemento
				posicion = i;
				// Salir del bucle una vez que se encuentra el elemento
				break;
			}
		}

		// Mostrar el resultado
		if (posicion != -1) {
			System.out.println("El elemento " + elementoABuscar + " se encuentra en la posición " + posicion);
		} else {
			System.out.println("El elemento " + elementoABuscar + " no se encuentra en el array.");
		}
	}
}
