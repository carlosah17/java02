package es.curso;

public class principal13 {

	public static void main(String[] args) {
		
		String cadena="hola que tal estas";
		
		//System.out.println(cadena.length());
		//System.out.println(cadena.charAt(2));
		int i=0;
		int contador=0;
		while(i<cadena.length()) {
			
			System.err.println(cadena.charAt(i));
			i++;
			char letra = cadena.charAt(i);
			
			if(letra=='a') {
				
				System.out.println(cadena.charAt(i));
				contador++;
				
			}
			
		}
		
		System.out.println(contador);
		
	}

}
