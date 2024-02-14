package actividad4_2;

import java.util.Scanner;

public class ejercicio5_2 {
//	Crear un array de números y otro de strings de 5 posiciones. En el array de números se insertarán notas entre 0 y 10 (habrá que controlar que se 
//			inserte una nota correcta), la nota puede tener decimales, en el array de strings se insertarán los nombres de los alumnos.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);

		double notasAlumno;

		double[] notas = new double[5];
		String[] nombres = new String[5];
		String[] palabra = new String[5];

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingresa el nombre del estudiante:");
			nombres[i] = leer.nextLine();

		}

		for (int i = 0; i < notas.length; i++) {

			do {

				System.out.println("------Ingresa las notas del alumno------ " + nombres[i]);
				notasAlumno = leer.nextDouble();

				if (notasAlumno < 0 || notasAlumno > 10) {
					System.out.println("La nota ingresada " + "[" + notasAlumno + "]" + " no es válida");

				}

			} while (notasAlumno < 0 || notasAlumno > 10);

			if (notasAlumno >= 0 && notasAlumno <= 10) {
				notas[i] = notasAlumno;

			}
			for (int j = 0; j < palabra.length; j++) {
				if (notas[i] >0 && notas[i] <= 4.99) {
					palabra[i] = "Suspenso";

				}
				if (notas[i] >=5 && notas[i] <= 6.99) {
					palabra[i] = "Bien";

				}
				if (notas[i] >=7 && notas[i] <=8.99) {
					palabra[i] = "Notable";

				}
				if (notas[i] >= 9) {
					palabra[i] = "Sobresaliente";

				}

			}

		}
		for (int j = 0; j < palabra.length; j++) {
			System.out.println("El alumno: " + nombres[j] + " tiene como nota: " + "[" + notas[j] + "]" + " te da para "
					+ palabra[j]);

		}
	}
}
