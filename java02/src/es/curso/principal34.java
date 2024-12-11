package es.curso;

import java.util.ArrayList;

public class principal34 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(7);
		lista.add(3);
		
		for(int i=lista.size()-1;i>=0;i--) {
			
			System.out.println(lista.get(i));	
			
		}
	
	}

}
