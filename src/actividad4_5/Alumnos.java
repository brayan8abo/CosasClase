package actividad4_5;

import java.time.LocalDate;
import java.util.Arrays;

public class Alumnos {
//
//	Crear una clase Alumnos que tenga :
//
//		Atributos:
//
//		o Nombre
//		o Apellido
//		o Fecha de nacimiento
//		o Notas: array de 3 notas (inglés, francés, alemán)
//
//
//		Constructor de 3 parámetros (los tres primeros) y de 0 parámetros
//		Métodos toString() y calcularMedia()
//		Métodos setNotaIngles(), setNotaFrances(), setNotaAleman(). En los tres casos se pasa la nota como parámetro.
	String nombre;
	String apellido;
	LocalDate fechaNacimiento;
	int[] notas = new int[3];

	public Alumnos(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;

	}
	public Alumnos() {
	}

	static void setNotaIngles(Alumnos alumno, int nota) {
		alumno.notas[0] = nota;

	}

	static void setNotaFrances(Alumnos alumno, int nota) {
		alumno.notas[1] = nota;

	}

	static void setNotaAleman(Alumnos alumno, int nota) {
		alumno.notas[2] = nota;

	}

	public static int calcularMedia(Alumnos alumno) {
		int sumaNotas = 0;

		for (int i = 0; i < alumno.notas.length; i++) {

			sumaNotas += alumno.notas[i];

		}
		return sumaNotas / alumno.notas.length;

	}

	@Override
	public String toString() {
		return "Alumnos [nombre = " + nombre + ", apellido = " + apellido + ", fechaNacimiento = " + fechaNacimiento
				+ ", notas = " + Arrays.toString(notas) + "]";
	}

}
