package activadaArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio2 {
//	2. Crear un programa que use un ArrayList de números float. El programa deberá mostrar un menú donde se pueda agregar un número, buscar un número, modificar un número, 
//	eliminar un número e insertar un número en una posición específica
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		ArrayList<Float> valoresFloat = new ArrayList<Float>() {
			{
				add((float) 50);
				add((float) 100);
				add((float) 150);
			}
		};

		System.out.println("Bienvenido al menú de ArrayList.");
		int menu = 0;
		do {

			System.out.println("1. Agregar un número.");
			System.out.println("2. Buscar un número.");
			System.out.println("3. Modificar un número.");
			System.out.println("4. Eliminar un número");
			System.out.println("5. Insertar un número en posición deseada.");
			System.out.println("0. Para sallir.");

			menu = leer.nextInt();

			switch (menu) {
			case 1:
				Ejercicio2.agregarNumero(valoresFloat);
				break;
			case 2:
				Ejercicio2.busquedaNumero(valoresFloat);
				break;
			case 3:
				Ejercicio2.modificarNumero(valoresFloat);
				break;
			case 4:
				Ejercicio2.eliminarNumero(valoresFloat);
				break;
			case 5:
				Ejercicio2.insertarNumero(valoresFloat);
				break;
			default:
				System.out.println("---HASTA LUEGO \n QUE TENGAS UN BUEN DÍA.");
				break;
			}

		} while (menu != 0);

	}

	public static void agregarNumero(ArrayList<Float> valoresFloat) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dame el número para agregar en el ArrayList");
		float añadir = leer.nextFloat();
		valoresFloat.add(añadir);

		System.out.println(valoresFloat + "\n");

	}

	public static void modificarNumero(ArrayList<Float> valoresFloat) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dame la posición del numero que quieres modificar");
		int indice = leer.nextInt();
		System.out.println("Dame el número nuevo a ingresar");
		float cambio = leer.nextFloat();
		valoresFloat.set(indice, cambio);

		System.out.println(valoresFloat + "\n");

	}

	public static void eliminarNumero(ArrayList<Float> valoresFloat) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dame la posición del número que quieres elimar");
		int indice = leer.nextInt();
		valoresFloat.remove(indice);

		System.out.println(valoresFloat + "\n");

	}

	public static void insertarNumero(ArrayList<Float> valoresFloat) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dame la posición donde deseas agregar un número");
		int indice = leer.nextInt();

		System.out.println("Dame el número nuevo a guardar");
		float añadido = leer.nextFloat();

		valoresFloat.set(indice, añadido);
		System.out.println(valoresFloat + "\n");
	}

	public static void busquedaNumero(ArrayList<Float> valoresFloat) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el número que quisieras buscar");
		int numeroBuscado = leer.nextInt();
		boolean consulta = false;
		for (int i = 0; i < valoresFloat.size(); i++) {
			if (valoresFloat.get(i) == (numeroBuscado)) {
				System.out.println("El número " + numeroBuscado + " está presente en el ArrayList.");
				consulta = true;
			}

		}
		if (!consulta) {
			System.out.println("El número " + numeroBuscado + " no está presente en el ArrayList.");

		}
	}
}
