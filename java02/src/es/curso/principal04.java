package es.curso;

public class principal04 {

	public static void main(String[] args) {
		
		int[] lista = new int[] {4,5,7,2};
		int aprobados = genteaprobada(lista);

	}
	
public static int genteaprobada(int[]myarray) {
		
		int aprobado=5;
		for (int i=0;i<myarray.length;i++) {
			
			if (myarray[i]>=aprobado) {
				
				System.out.println("Aprobado con un "+myarray[i]);
				
			}
			
		}
		return aprobado;
	}

}
