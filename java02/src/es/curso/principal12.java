package es.curso;

public class principal12 {

	public static void main(String[] args) {
		
		String cadena="hola que tal estas";
		int contador=0;
		for(int i=0;i<cadena.length();i++) {
			
			//char letra=cadena.charAt(i);
			System.out.println(cadena.charAt(i));
			
			//if (letra=='a') {
			if (cadena.charAt(i)=='a') {
				
				System.out.println(cadena.charAt(i));
				contador++;
				
			}
			
		}
		
		System.out.println(contador);

	}

}
