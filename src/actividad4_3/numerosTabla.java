package actividad4_3;

import java.util.Scanner;

public class numerosTabla {
	public static void main(String[] args) {
//		2. Realizar un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas. 
//		El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.

		Scanner leer = new Scanner(System.in);

		int[][] numeros = new int[5][6];
		int sumaTotal = 0;
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros[0].length - 1; j++) {

				int columnas = 0;
				int filas = 0;

				System.out.println("Ingresa un número");
				numeros[i][j] = leer.nextInt();

				columnas += numeros[i][j];
				filas += numeros[i][j];
				numeros[4][j] += columnas;
				numeros[i][5] += filas;

				sumaTotal += numeros[i][j];
				numeros[4][5] = sumaTotal;
			}

		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				System.out.print(" " + "[" +  numeros[i][j] + "] " +   "\t");

			}
			System.out.println();
		}
		leer.close();

	}

}
