package arrays1;

public class arrayList {
	public static void main(String[] args) {
		int[] miArray = new int[5];

		miArray[0] = 55; // EL NUMERO QUE ESTA EN EL CORCHETE EL LA POSICION DEL ARRAY
		miArray[1] = 11;
		miArray[2] = -3;
		miArray[3] = 28;
		miArray[4] = 64;
		
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i] + "[" + i + "]");
			
		}
		for (int i : miArray) {
			System.out.print(i);
			
		}
		
		
			
		}
		
	}


