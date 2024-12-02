package es.curso;

public class principal16 {

	public static void main(String[] args) {

		int suma=0;
		double contador=0;
		persona p1=new persona();
		p1.edad=20;
		p1.nombre="ceci";
		
		persona p2=new persona();
		p2.edad=1;
		p2.nombre="catalina";
		
		persona[] lista=new persona[] {p1,p2};
		
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
