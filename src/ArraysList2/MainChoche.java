package ArraysList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//en el programa principal, declarar dos listas: alquilados y libres que van a contener los coches que están actualmente alquilados y los coches actualmente libres.
//El programa presenta un menú:
//  dar de alta un coche: inserta un coche nuevo a la lista de los libres
//  alquilar un coche: visualiza la lista , pide al usuario el coche que desea alquilar, comprueba que en efecto el coche está libre, 
//y si es así borra el coche de la lista de los coches libres y lo inserta en la lista de los coches alquilados
//  devolver coche: se introduce la matrícula del coche, se comprueba que está en la lista de los coches alquilados. Si es así, se borra el 
//coche de la lista de los coches alquilados y se inserta en la lista de los coches libres.
//  Ordenar lista (cualquiera de las dos) por marca.

public class MainChoche {
	public static void main(String[] args) {
		ArrayList<Coche> cochesLibres = new ArrayList<>();
		ArrayList<Coche> cochesAlquilados = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		char opcion;

		do {
			System.out.println("\nMenú:");
			System.out.println("A. Dar de alta un coche");
			System.out.println("B. Alquilar un coche");
			System.out.println("C. Devolver coche");
			System.out.println("D. Ordenar lista por marca");
			System.out.println("E. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = leer.next().toUpperCase().charAt(0);

			switch (opcion) {
			case 'A':
				altaCoche(cochesLibres, leer);
				break;
			case 'B':
				alquilarCoche(cochesLibres, cochesAlquilados, leer);
				break;
			case 'C':
				devolverCoche(cochesLibres, cochesAlquilados, leer);
				break;
			case 'D':
				ordenarPorMarca(cochesLibres);
				ordenarPorMarca(cochesAlquilados);
				break;
			case 'E':
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción incorrecta. Por favor, seleccione una opción válida.");
			}
		} while (opcion != 'E');

		leer.close();
	}

	public static void altaCoche(ArrayList<Coche> cochesLibres, Scanner sc) {
		System.out.print("Ingrese la matrícula del coche: ");
		String matricula = sc.next();
		sc.nextLine();

		System.out.print("Ingrese la marca del coche: ");
		String marca = sc.nextLine();
		System.out.print("Ingrese el modelo del coche: ");
		String modelo = sc.nextLine();

		Coche coche = new Coche(matricula, marca, modelo);
		cochesLibres.add(coche);
		System.out.println("Coche dado de alta correctamente.");
	}

	public static void alquilarCoche(ArrayList<Coche> cochesLibres, ArrayList<Coche> cochesAlquilados, Scanner sc) {
		System.out.println("Lista de coches disponibles para alquilar:");
		for (Coche coche : cochesLibres) {
			System.out.println(coche);
		}

		System.out.print("Ingrese la matrícula del coche que desea alquilar: ");
		String matricula = sc.next();

		Coche coche = buscarCoche(cochesLibres, matricula);
		if (coche != null) {
			cochesLibres.remove(coche);
			cochesAlquilados.add(coche);
			System.out.println("Coche alquilado correctamente.");
		} else {
			System.out.println("No se encontró un coche con esa matrícula disponible para alquilar.");
		}
	}

	public static void devolverCoche(ArrayList<Coche> cochesLibres, ArrayList<Coche> cochesAlquilados, Scanner sc) {
		System.out.print("Ingrese la matrícula del coche que desea devolver: ");
		String matricula = sc.next();

		Coche coche = buscarCoche(cochesAlquilados, matricula);
		if (coche != null) {
			cochesAlquilados.remove(coche);
			cochesLibres.add(coche);
			System.out.println("Coche devuelto correctamente.");
		} else {
			System.out.println("No se encontró un coche con esa matrícula alquilado.");
		}
	}

	public static void ordenarPorMarca(ArrayList<Coche> coches) {
		Collections.sort(coches, (c1, c2) -> c1.getMarca().compareTo(c2.getMarca()));
		System.out.println("Lista ordenada por marca:");
		for (Coche coche : coches) {
			System.out.println(coche);
		}
	}

	public static Coche buscarCoche(ArrayList<Coche> coches, String matricula) {
		for (Coche coche : coches) {
			if (coche.getMatricula().equals(matricula)) {
				return coche;
			}
		}
		return null;
	}
}
