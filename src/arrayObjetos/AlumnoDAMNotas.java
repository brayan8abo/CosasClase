package arrayObjetos;

import java.util.Arrays;
import java.util.Scanner;

public class AlumnoDAMNotas {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		// SE DECLARA UNA CONSTANTE PARA DARLE TAMAÑO AL ARRAY EN ESTE CASO, COMO LE
		// ESTAMOS PASANDO ABAJO EN EL ARRAY LA VARIABLE NUM_ALUMNOS PARA
		// QUE TENGA UN TAMAÑO ESTABLECIDO DE 4; LUEGO PUEDE SER MÁS FÁCIL PARA EL
		// MANTENIMIENTO...
		final int NUM_ALUMNOS = 4;
		final int NUM_ASIGNATURAS = 3;
		int numAsignaturas;

		AlumnoDAM[] alumnos = new AlumnoDAM[NUM_ALUMNOS];

		// CREO UN ALUMNO Y RESERVO ESPACIO EN ARRAY 0

		alumnos[0] = new AlumnoDAM("Brayan");

		System.out.println("Nombre: " + alumnos[0].nombre);

		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.println("Nombre:");
			alumnos[i] = new AlumnoDAM(leer.nextLine()); // CON ESTO SE RECORRE EL ARRAY COMPLETO PARA GUARDAR EL NOMBRE O DATO DEL CONSTRUCTOR DEL ALUMN
			System.out.println("Nº asignaturas del alumno " + alumnos[i].nombre);
			numAsignaturas = leer.nextInt();
			alumnos[i].notas = new int[numAsignaturas]; // creo el array de numASIGNATURAS para el espacio de las notas
			
			
			for (int j = 0; j <  numAsignaturas; j++) {
				
				
				System.out.println("Notas: " + (j + 1) + ":");
				alumnos[i].notas[j] = leer.nextInt();

			}
			leer.nextLine();
		}
		// primero el tipo, luego el nombre de la variable donde se almacena, y luego
		// donde se recorrerá
		for (AlumnoDAM alu : alumnos) {
			System.out.print(alu.nombre + " ");
//			for (int i = 0; i < NUM_ASIGNATURAS; i++) {
//				System.out.print(alu.notas[i] + " ");
//			}
			System.out.println(Arrays.toString(alu.notas)); // MANERA MÁS FÁCIL DE DE IMPRIMIR

		}
		System.out.println();

	}

}
