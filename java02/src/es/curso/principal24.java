package es.curso;

public class principal24 {

	public static void main(String[] args) {

		String cadena="Hola amigo que tal estas.";	
		int i=0;
		while(i<cadena.length()) {
			
			if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u') {
				
				System.out.println(cadena.charAt(i));
				
			}
			i++;
			
		}

	}

}
