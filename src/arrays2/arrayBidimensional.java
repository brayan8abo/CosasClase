package arrays2;

public class arrayBidimensional {

	public static void main(String[] args) {
//		int  [] temperaturas = new int [31]; 
//
//		int[] temperaturas = { 1, 2, 3, 4, 5, 6, 12, 34, 12, 4, 24, 65, 2, 1, 4, 5, 2, 1, 5, 6, 3 };
//
//		for (int i = 0; i < temperaturas.length; i++) {
//			System.out.print(temperaturas[i] + " ");
//
//		}
		int[][][] temperaturas = new int[12][31][24];
		System.out.println("Meses: " + temperaturas.length + " Dias " + temperaturas[0].length + " horas: "
				+ temperaturas[0][0].length);
//		for (int k = 0; k < temperaturas.length; k++) {
//
//			for (int i = 0; i < temperaturas[0].length; i++) {
//				for (int j = 0; j < temperaturas[0][0].length; j++) {
//					System.out.print("Mes: " + (k+1) + " Día: " + (i + 1) + " Hora: " + j + " " + " | ");
//
//				}
//				System.out.println();
//
//			}
//			System.out.println();
	}
}

