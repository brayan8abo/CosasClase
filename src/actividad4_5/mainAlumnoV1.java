package actividad4_5;

import java.time.LocalDate;

public class mainAlumnoV1 {
	public static void main(String[] args) {
		

//		En el programa principal:
//
//			• crear 5 alumnos
//			• Poner las notas de los alumnos con los métodos set.
//			• Imprimir la información de los alumnos
		
		final int NUM_ALUMNOS = 5;
		
		Alumnos[] alumno = new Alumnos[NUM_ALUMNOS];
		
		alumno[0] = new Alumnos("Noel", "Dominguez", LocalDate.of(1992, 4, 4)); // ACÁ LE ESTOY PASANDO EL LOCAL DATE.OF PARA DARLE LA FECHA DE NACIMIENTO
		alumno[1] = new Alumnos("Brayan", "Ochoa", LocalDate.of(2000, 8, 11));
		alumno[2] = new Alumnos("Sara", "Londoño", LocalDate.of(2001, 3, 3));
		alumno[3] = new Alumnos("Pablo", "Almagro", LocalDate.of(1996, 10, 4));
		alumno[4] = new Alumnos("Carlos", "Ochoa", LocalDate.of(1973, 12, 24));

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
		
		
		
		for (int i = 0; i < alumno.length; i++) {
			System.out.println(alumno[i].toString()+"\n");
			System.out.println("Su nota media es de: " + "\n" + Alumnos.calcularMedia(alumno[i]));
			
			
			
				
				
			}
		
			
		}


	}

