package actividad4_2;

import java.util.Scanner;

public class ejercicio3_2 {

//	3. Realizar un programa que pida al usuario una frase y pase sus caracteres a un array de caracteres. Se podrá realizar con o sin métodos de String.
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingresa una frase");
		String frase = leer.nextLine();
		
		char[] letras = new char [frase.length()];
		
		for (int i = 0; i < letras.length; i++) {
			letras[i] = frase.charAt(i);
			
			System.out.print(letras[i]+ " ");
			
		}
		leer.close();
		
		
		
	}

}
