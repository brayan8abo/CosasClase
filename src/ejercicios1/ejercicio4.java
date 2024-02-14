package ejercicios1;

public class ejercicio4 {
//	Escribir un método max() al que se le pase como argumento el array números y devuelva el valor máximo
	public static void main(String[] args) {
		int[] numeros = { 12, 15, 11, 10, 8, 9, 13, 14 }; // DECLARO ARRAY CON LOS NUMEROS
		max(numeros);

	}

	public static void max(int numeros[]) {
		int max = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= max) {
				max =+ numeros[i];
				
			}

		}
		System.out.println("El valor máximo que tenemos en el array es:" + max);
		

//		return max;

	}
	

}
