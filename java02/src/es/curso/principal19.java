package es.curso;

public class principal19 {

	public static void main(String[] args) {

		rectangulo2 r=new rectangulo2();
		r.setLado1(10);
		r.setLado2(4);
		
		rectangulo2 r1=new rectangulo2();
		r1.setLado1(20);
		r1.setLado2(4);
		
		rectangulo2 r2=new rectangulo2();
		r2.setLado1(30);
		r2.setLado2(4);
		
		rectangulo2 r3=new rectangulo2();
		r3.setLado1(40);
		r3.setLado2(4);
		
		rectangulo2[] rconjunto=new rectangulo2[] {r,r1,r2,r3};
		
		double areatotal=0;
		double perimetrototal=0;
		
		for(int i=0;i<rconjunto.length;i++) {
			
			areatotal=areatotal+rconjunto[i].CalcularArea();
			perimetrototal=perimetrototal+rconjunto[i].CalcularPerimetro();
			
		}
		
		System.out.println("######");
		System.out.println(areatotal);
		
		System.out.println("######");
		System.out.println(perimetrototal);

	}

}
