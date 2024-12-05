package es.curso;

public class principal29 {

	public static void main(String[] args) {

		String c1="Hola que tal.";
		String c2="Hola que tal amigo.";
		String c3="Hola.";
		String c4="Hola que.";
		String[] lista=new String[] {c1,c2,c3,c4};
		
		int i=0;
		String cadenalarga="";
		int posiciones=0;
		int posicion=0;
		while (i<lista.length) {
	
			if (lista[i].length()>posiciones) {
				
				posiciones=lista[i].length();
				cadenalarga=lista[i];
				posicion=i;
				
			}
			
			i++;
			
		}
		
		System.out.println("La cadena mas larga es: "+cadenalarga);
		System.out.println("Con un total de "+posiciones+" posiciones.");
		System.out.println("La lista esta en la posicion "+posicion+".");
		
	}

}
