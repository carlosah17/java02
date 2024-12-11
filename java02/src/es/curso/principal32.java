package es.curso;

import java.util.ArrayList;

public class principal32 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(3);
		
		//System.out.println(lista);
		//System.out.println(lista.get(0));
		//System.out.println(lista.get(1));	
		//System.out.println(lista.get(2));
		
		for(int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
			
		}

	}

}
