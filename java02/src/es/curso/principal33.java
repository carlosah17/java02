package es.curso;

import java.util.ArrayList;

public class principal33 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(7);
		lista.add(3);
		
		int mayor=0;
		
		for(int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
			if (lista.get(i)>mayor) {
				mayor=lista.get(i);
			}
			
		}
		System.out.println("El numero mas grande es: "+mayor);
	}

}
