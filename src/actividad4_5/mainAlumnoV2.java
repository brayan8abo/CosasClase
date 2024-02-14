package actividad4_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class mainAlumnoV2 {
	public static void main(String[] args) {

		final int NUM_ALUMNOS = 5;

		Scanner leer = new Scanner(System.in);

		String fecha;
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		Alumnos[] alumno = new Alumnos[NUM_ALUMNOS];

		for (int i = 0; i < NUM_ALUMNOS; i++) {

			alumno[i] = new Alumnos();

			System.out.println("Dame el nombre del alumno : " + (i + 1));
			alumno[i].nombre = leer.nextLine();

			System.out.println("Dame el apellido del estudiante : " + (i + 1));
			alumno[i].apellido = leer.nextLine();

			System.out.println("Dame tu fecha de nacimiento, (AÑO-MES-DÍA)");
			fecha = leer.nextLine();
			alumno[i].fechaNacimiento = LocalDate.parse(fecha, formateo);

		}

		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.println("Dame la nota de inglés del alumno: " + alumno[i].nombre + alumno[i].apellido);
			Alumnos.setNotaIngles(alumno[i], leer.nextInt());
			System.out.println("Dame la nota de fracés del alumno  " + alumno[i].nombre + alumno[i].apellido);
			Alumnos.setNotaFrances(alumno[i], leer.nextInt());
			System.out.println("Dame la nota de alemán del alumno " + alumno[i].nombre + alumno[i].apellido);
			Alumnos.setNotaAleman(alumno[i], leer.nextInt());

		}
		leer.nextLine();
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.println(alumno[i].toString() + "\n");
			System.out.println("Su nota media es de: " + "\n" + Alumnos.calcularMedia(alumno[i]));
leer.close();
		}

	}

}
