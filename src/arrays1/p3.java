package arrays1;

public class p3 {

	public static void main(String[] args) {
		int [] matrizAleatorio = new int [100];
		
		for (int i = 0; i < matrizAleatorio.length; i++) {
			matrizAleatorio[i] = (int) Math.round(Math.random()*100);
			
		}
		
		for (int i = 0; i < matrizAleatorio.length; i++) {
			System.out.print(matrizAleatorio[i] + " ");
			
		}
		

	}

}
