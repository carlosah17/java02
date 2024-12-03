package es.curso;

public class principal16 {

	public static void main(String[] args) {

		int suma=0;
		double contador=0;
		Persona p1=new Persona();
		p1.edad=20;
		p1.nombre="ceci";
		
		Persona p2=new Persona();
		p2.edad=1;
		p2.nombre="catalina";
		
		Persona[] lista=new Persona[] {p1,p2};
		
		for(int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i].nombre);
			System.out.println(lista[i].edad);
			
			if (lista[i].edad>0) {
				
				suma=suma+lista[i].edad;
				contador++;
				
			}
			
		}
	
		System.out.println(suma);
		System.out.println(suma/contador);
		
	}

}
