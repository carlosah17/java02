package examen;

public class principal05 {

	public static void main(String[] args) {

		String cadena="Hola me llamo pepe y soy informatico.";	
		int i=0;
		int letras=0;
		while(i<cadena.length()) {
			
			if (cadena.charAt(i)=='e') {
				
				System.out.println(cadena.charAt(i));
				letras=letras+1;
				
			}
			i++;
			
		}
		
		System.out.println("Numero de letras e: "+letras+".");

	}

}
