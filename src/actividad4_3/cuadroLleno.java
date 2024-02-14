package actividad4_3;


import java.util.Scanner;

public class cuadroLleno {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

//		1. Escribir un programa que pida al usuario un número n y dibuje un cuadrado de n elementos de lado utilizando '*' mediante matrices bidimensionales
//
//		Por ejemplo para n=4, se visualiza:
		int numero = 0;
		char[][] cuadro = new char[numero][numero];

		do {

			System.out.println("Introduce un número para crear un cuadrado");
			numero = leer.nextInt();

		} while (numero < 1);

		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print("* ");

			}
			System.out.println();

//			cuadradoVacio(cuadro, numero); //SE DEBE COMENTAR EL FOR ANIDADO ANTERIOR DEL CUADRO LLENO PARA UN CORRECTO FUNCIONAMIENTO, DE LO CONTRARIO SE HARÁN COSAS RARAS
leer.close();
		}
	}
}
		
	

//	public static void cuadradoVacio(char[][] cuadro, int numero) {
//
//		for (int i = 0; i < numero; i++) {
//			for (int j = 0; j < numero; j++) {
//				if (i == 0 || i == numero - 1 || j == 0 || j == numero - 1) {
//					System.out.print("* ");
//
//				} else {
//					System.out.print("  ");
//				}
//
//			}
//			System.out.println();
//
//		}
//	}
//
//}
