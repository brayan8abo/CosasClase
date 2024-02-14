package actividad4_5;

import java.util.Arrays;

public class Grupo {
//	Crear una clase Grupo que tenga:
//
//		Atributos:
//
//		o Nombre
//		o Planta
//		o Alumnos : array de 5 alumnos
//
//		Constructor de 2 parámetros : el nombre y la planta
//		Métodos toString() y AsignarAlumno(): se le pasa un alumno

	String nombre;
	int planta;
	Alumnos[] alumno = new Alumnos[5];

	public Grupo(String nombre, int planta) {
		this.nombre = nombre;
		this.planta = planta;
	}

	
	public static  void asignarAlumno(Alumnos alumno, Grupo curso) {
        for (int i = 0; i <curso.alumno.length; i++) {
        	if(curso.alumno[i] == null) {
        		curso.alumno[i] = alumno;
        		break;
        		
			
		}
            }
        }


	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", planta=" + planta + ", alumno=" + Arrays.toString(alumno) + "]";
	}
	
	

	

	

			

		
	
}
