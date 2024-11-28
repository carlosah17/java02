package es.curso;

public class principal2 {

	public static void main(String[] args) {
		
		int[] lista = new int[] {1,2,3,4};
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
			
		}
		int mayor =numeromayor(lista);
		System.out.println("******");
		System.out.println(mayor);
		
		int menor =numeromenor(lista);
		System.out.println("******");
		System.out.println(menor);
		
		int suma =suma(lista);
		System.out.println("******");
		System.out.println(suma);
		
	}
	
	public static int numeromayor(int[]myarray) {
		
		int mayor=0;
		for (int i=0;i<myarray.length;i++) {
			
			if (myarray[i]>mayor) {
				
				mayor = myarray[i];
				
			}	
		}
		return mayor;
	}
	public static int numeromenor(int[]myarray) {
		
		int menor=Integer.MAX_VALUE;
		for (int i=0;i<myarray.length;i++) {
			
			if (myarray[i]<menor) {
				
				menor = myarray[i];
				
			}
			
		}
		return menor;
	}
	
public static int suma(int[]myarray) {
		
		int suma=0;
		for (int i=0;i<myarray.length;i++) {
			
			suma=suma+myarray[i];
			//suma+=myarray[i];
			
		}
		return suma;
	}

}
