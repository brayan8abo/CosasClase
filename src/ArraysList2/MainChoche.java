package ArraysList2;

import java.util.ArrayList;
import java.util.Scanner;
//en el programa principal, declarar dos listas: alquilados y libres que van a contener los coches que están actualmente alquilados y los coches actualmente libres.
//El programa presenta un menú:
//  dar de alta un coche: inserta un coche nuevo a la lista de los libres
//  alquilar un coche: visualiza la lista , pide al usuario el coche que desea alquilar, comprueba que en efecto el coche está libre, y si es así borra el coche de la lista de los coches libres y lo inserta en la lista de los coches alquilados
//  devolver coche: se introduce la matrícula del coche, se comprueba que está en la lista de los coches alquilados. Si es así, se borra el coche de la lista de los coches alquilados y se inserta en la lista de los coches libres.
//  Ordenar lista (cualquiera de las dos) por marca.

public class MainChoche {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		ArrayList<String> alquilerCoches = new ArrayList<String>();
		
		
	}
	public static void menu() {
		Scanner leer = new Scanner (System.in);
		boolean menu = true;
		
		while (menu) {
			System.out.println("Ingresa una opción para el alquiler de coches:");
			int opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				
				
				break;

			default:
				break;
			}
			
		}
		
	}

}