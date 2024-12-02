package es.curso;

public class principal15 {

	public static void main(String[] args) {

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
			
		}
	
	}

}
