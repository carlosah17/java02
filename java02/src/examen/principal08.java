package examen;

public class principal08 {

	public static void main(String[] args) {

		int[] lista=new int[] {5,9,26,49,16};

		int numerogrande=0;

		for (int i=0;i<lista.length;i++) {
	
			if (lista[i]>numerogrande) {
				
				numerogrande=lista[i];
				
			}
			
		}
		
		System.out.println("El numero mas grande es: "+numerogrande+".");
		
	}

}
