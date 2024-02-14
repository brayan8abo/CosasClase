package arrays1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class p2 {

	public static void main(String[] args) {
		String[] paises = new String[7];

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < paises.length; i++) {

			System.out.println("Introducir país " + i);

//			paises[i] = leer.nextLine();
			paises[i] = JOptionPane.showInputDialog("País");

		}

		for (int i = 0; i < paises.length; i++) {

			System.out.println("País " + i + ": " + paises[i]);

		}
		
		for (String string : paises) {
			System.out.println(paises);
			
		}
		leer.close();
	}

}