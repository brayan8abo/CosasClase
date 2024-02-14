package actividad4_2;

import java.util.Scanner;

public class ejercicio4_2 {
//	4. Obtener la letra de un DNI, se pedirá el DNI por teclado y se nos devolverá el DNI completo.
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int numero = 0;
		boolean condicional = true;

		System.out.print("Ingrese el número de DNI (sin letra): ");
		numero = leer.nextInt();
//		String a = String.valueOf(numero);
//		System.out.println(a.length());
//		System.out.println(a);
		do {
			if (numero >=0 && numero <=9999999) {

				char letraDNI = calcularLetraDNI(numero);

				System.out.println("DNI completo: " + numero + letraDNI);
				condicional = false;
			}
//			else if (a.charAt(0)==0) {
//				
//				char letraDNI = calcularLetraDNI(numero);
//
//				System.out.println("DNI completo: " + numero + letraDNI);
//				condicional = false;
//				
//			}
			else {
				System.out.println("error no es válido");
				condicional = false;
			}

		} while (condicional);
leer.close();
	}

	public static char calcularLetraDNI(int numero) {

		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		int resto = numero % 23;
		return letras[resto];
	}

	public static boolean esDNIValido(int numero) {
		String dni = String.valueOf(numero);
		return dni.length() > 0 && dni.length() == 8;
	}
}
