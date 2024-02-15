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

		System.out.println("\n----Palabra nueva----\n");

		cadenaCaracteres.add(0, "Pascal");

		for (int i = 0; i < cadenaCaracteres.size(); i++) {

			System.out.println(cadenaCaracteres.get(i));

		}
		System.out.println("\nPosición 3(2º indice) recuperada " + "\n" + cadenaCaracteres.get(2) + "\n");

		String elementoABuscar = "Python";

		boolean consulta = false;
		for (int i = 0; i < cadenaCaracteres.size(); i++) {
			if (cadenaCaracteres.get(i) == (elementoABuscar)) {
				System.out.println("La palabra: " + "[" + elementoABuscar + "]"
						+ " está presente en el ArrayList, en la posicion: " + (i + 1));
				consulta = true;
			}

		}
		if (!consulta) {
			System.out.println("La palabra " + "[" + elementoABuscar + "]" + " no está presente en el ArrayList.");

		}
		cadenaCaracteres.remove(0);
		
		System.out.println("\nLista con PASCAL eliminado:");
		for (String string : cadenaCaracteres) {
			System.out.println(string);
			
		}
		cadenaCaracteres.clear();
		
		System.out.println("\nDespués de borrar:");
		for (String string : cadenaCaracteres) {
			System.out.println(string);
			
		}

	}
}
