package arrayObjetos;

import java.util.Iterator;
import java.util.Scanner;

public class MatricesJagged {
	public static void main(String[] args) {
			Scanner leer = new Scanner (System.in);
		int [][] alumnos = new int [4][];
		int numAsignaturas;
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Nº asignaturas: " );
			numAsignaturas = leer.nextInt();
			
			alumnos [i] = new int [numAsignaturas];
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.println("Introducir nota " + (j+1));
				alumnos[i][j] = leer.nextInt();
				
			}
			
		}
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Alumno " + (i+1));
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.println("\tNota: " + alumnos[i][j] + " ");
				
				
			}
			System.out.println();
			
		}
	}

}
