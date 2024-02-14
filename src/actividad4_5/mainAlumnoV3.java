package actividad4_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class mainAlumnoV3 {
	public static void main(String[] args) {

		final int NUM_ALUMNOS = 5;

		Scanner leer = new Scanner(System.in);

		Grupo[] curso = new Grupo[2];

		curso[0] = new Grupo("Marketing", 0);
		curso[1] = new Grupo("DAM", 1);

		Alumnos[] alumno = new Alumnos[NUM_ALUMNOS];
		alumno[0] = new Alumnos("Noel", "Dominguez", LocalDate.of(1992, 4, 4));
		alumno[1] = new Alumnos("Brayan", "Ochoa", LocalDate.of(2000, 8, 11));
		alumno[2] = new Alumnos("Sara", "Londoño", LocalDate.of(2001, 3, 3));
		alumno[3] = new Alumnos("Pablo", "Almagro", LocalDate.of(1996, 10, 4));
		alumno[4] = new Alumnos("Carlos", "Ochoa", LocalDate.of(1973, 12, 24));

//		for (int i = 0; i < NUM_ALUMNOS; i++) {
//			System.out.println("Dame la nota de inglés del alumno: " + alumno[i].nombre + " " + alumno[i].apellido);
//			Alumnos.setNotaIngles(alumno[i], leer.nextInt());
//			System.out.println("Dame la nota de fracés del alumno  " + alumno[i].nombre + " " + alumno[i].apellido);
//			Alumnos.setNotaFrances(alumno[i], leer.nextInt());
//			System.out.println("Dame la nota de alemán del alumno " + alumno[i].nombre + " " + alumno[i].apellido);
//			Alumnos.setNotaAleman(alumno[i], leer.nextInt());
//
//		}

//		SE HACE UN SET CON TODAS LAS NOTAS Y ALUMNOS, ESTE MAIN SE AHCE ALUSION A PEDIR NOTAS CON EL METODO SET A LOS ALUMNOS, SE PIDEN PARA TODOS LOS ALUMNOS CON SU RESPECTIVA NOTA DE INGLES ALEMAN Y FRANCES
		Alumnos.setNotaIngles(alumno[0], 0);
		Alumnos.setNotaFrances(alumno[0], 6);
		Alumnos.setNotaAleman(alumno[0], 5);

		Alumnos.setNotaIngles(alumno[1], 2);
		Alumnos.setNotaFrances(alumno[1], 3);
		Alumnos.setNotaAleman(alumno[1], 4);

		Alumnos.setNotaIngles(alumno[2], 4);
		Alumnos.setNotaFrances(alumno[2], 5);
		Alumnos.setNotaAleman(alumno[2], 6);

		Alumnos.setNotaIngles(alumno[3], 8);
		Alumnos.setNotaFrances(alumno[3], 4);
		Alumnos.setNotaAleman(alumno[3], 1);

		Alumnos.setNotaIngles(alumno[4], 2);
		Alumnos.setNotaFrances(alumno[4], 1);
		Alumnos.setNotaAleman(alumno[4], 4);

		
//		ACÁ ESTOY ASIGNANDO 3 ESTUDIANTES AL CURSO 0  Y DOS ESTUDIANTES AL CURSO 1, CON EL METODO NO STATIC CREADO EN LA CLASE GRUPO
		Grupo.asignarAlumno(alumno[0], curso[0]);
		Grupo.asignarAlumno(alumno[1], curso[0]);
		Grupo.asignarAlumno(alumno[2], curso[0]);
		Grupo.asignarAlumno(alumno[3], curso[1]);
		Grupo.asignarAlumno(alumno[4], curso[1]);

//		leer.nextLine(); //
		
		for (int i = 0; i < NUM_ALUMNOS; i++) { // FOR PARA RECORRER ARRAY E IMPRIMIR LOS TO STRING CON SU CALCULAR MEDIA, QUE TAMBIEN ESTA CREADA EN LA CLASE PRINCIPAL
			System.out.println(alumno[i].toString() + "\n");
			System.out.println("Su nota media es de: " + "\n" + Alumnos.calcularMedia(alumno[i]));

			System.out.println(curso[0].toString());

			leer.close();// CIERRO SCANNER

		}
	}
}
