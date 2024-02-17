package ArraysList2;

public class Coche {
//    Escribir un programa java que gestione los coches de una empresa de alquiler de coches.
//    definir una clase Coche con los atributos: matrícula, marca y modelo. Constructor con todos los parámetros. Método toString().
//    en el programa principal, declarar dos listas: alquilados y libres que van a contener los coches que están actualmente alquilados y los coches actualmente libres.
//    El programa presenta un menú:
//        dar de alta un coche: inserta un coche nuevo a la lista de los libres
//        alquilar un coche: visualiza la lista , pide al usuario el coche que desea alquilar, comprueba que en efecto el coche está libre, y si es así borra el coche de la lista de los coches libres y lo inserta en la lista de los coches alquilados
//        devolver coche: se introduce la matrícula del coche, se comprueba que está en la lista de los coches alquilados. Si es así, se borra el coche de la lista de los coches alquilados y se inserta en la lista de los coches libres.
//        Ordenar lista (cualquiera de las dos) por marca.

	 private String matricula;
	 private String marca;
	 private String modelo;

	public Coche(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [Matricula= " + getMatricula() + ", Marc)= " + getMarca() + ", Modelo= " + getModelo()
				+ "]";
	}

}
