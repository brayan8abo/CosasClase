package arrays2;

import java.util.Iterator;
import java.util.Scanner;

public class registroCalificacionesBidimensional {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int nEstudiantes = 3;
		int nNotas = 4;

		String[] nombre = new String[nEstudiantes];
		double[][] calificaciones = new double[nEstudiantes][nNotas];
		String[] asignatura = {"Programación","FOL","Base de datos","Lenguaje de marcas"};

		for (int i = 0; i < nEstudiantes; i++) {
			System.out.println("Ingresar nombre del estudiante " + (i + 1) + ":");
			nombre[i] = leer.nextLine();

			System.out.println("Digita la calificación del estudiante " + nombre[i] + ":" + " en la asignatura " + asignatura[i]);
			for (int j = 0; j < nNotas; j++) {
				System.out.println("Calificación del estudiante: " + nombre[i] + " En la asignatura " + asignatura[i] + ":");
				calificaciones[i][j] = leer.nextDouble();

			}
			leer.nextLine();

		}
		for (int i = 0; i < nEstudiantes; i++) {
			double suma = 0;
			for (int j = 0; j < nNotas; j++) {
				suma += calificaciones[i][j];

			}
			System.out.println("Media del alumno " + nombre[i] + " = " + (suma / nNotas));

		}
	}

}
