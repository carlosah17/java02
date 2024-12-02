package es.curso;

public class principal11 {

	public static void main(String[] args) {

		String[] lista = new String[] {"hola","que","tal","estas"};
		for(int i=0;i<lista.length;i++) {
			
			System.out.println("Sacame cada palabra: "+lista[i]);
			
			for(int j=0;j<lista[i].length();j++) {
				
				System.out.println("Sacame cada letra: "+lista[i].charAt(j));
				char caracter = lista[i].charAt(j);
				System.out.println(caracter);
				//System.out.println(lista[i].charAt(j));
				
			}
			
			System.out.println();
			
		}

	}

}
