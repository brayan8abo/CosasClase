package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListaTareas {
	public static void main(String[] args) {

		ArrayList<String> tareasPendientes = new ArrayList<>(); // con esto me creo un array o reservo un espacio a // medida que le ingreso datos.
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();

		tareasPendientes.add("Pan");
		tareasPendientes.add("Leche"); // agregar
		tareasPendientes.add("Café");
		
		tareasPendientes.add(0,"Pan"); // agrego en el indice 0, y agrego pan

		tareasPendientes.set(0, "Café"); //poner en posicion y cambia  es decir elimina el que este en el indice 0
		

		tareasPendientes.remove(0); // remvoer

		System.out.println("Contiene leche: " + tareasPendientes.contains("Leche")); // comparar si lo tiene
		tareasPendientes.remove("Leche");
		System.out.println("Contiene Leche: " + tareasPendientes.contains("Leche"));
		tareasPendientes.add("Carne");
		System.out.println("Contiene Carne: " + tareasPendientes.contains("Carne"));

		tareasPendientes.add("Arroz"); // agrega
		

		//Collections.sort(tareasPendientes); //ordena en orden alfabetico o númericos
		
		//set modifico valor
		//add añadir
		//get veo el valor
		
		for (int i = 0; i < tareasPendientes.size(); i++) {
			System.out.println((i + 1) + ". " + tareasPendientes.get(i));
		}

	}

}
