package arrays1;

public class p1 {
	public static void main(String[] args) {
//		int[] miArray = new int[5];

//		miArray[0] = 55; // EL NUMERO QUE ESTA EN EL CORCHETE EL LA POSICION DEL ARRAY
//		miArray[1] = 11;
//		miArray[2] = -3;
//		miArray[3] = 28;
//		miArray[4] = 64;

		int[] miArray = { 22, 43, 64, 55, 99, 15, 33, 72, -8, 0 }; // ACÁ LO QUE HACEMOS ES DECLARAR EL ARRAY Y ENTRE
																	// LAS LLAVES LE ESTOY PASANDO LOS VALORES, Y ESTE
																	// AUTOMATICAMENTE GENERA Y HACE LAS POSICIONES

//		System.out.println("miArray[3] =" + miArray[3]);

//		for (int i = 0; i <= 4; i++) {
//			System.out.println("miArray[" + i + "]= " + miArray[i]); // imprimo lo que tengo declarado en mi new que son
//																		// 5 elementos
//
//		}
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("miArray[" + i + "]= " + miArray[i]);

		}

	}

}
