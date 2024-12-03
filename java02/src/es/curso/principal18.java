package es.curso;

public class principal18 {

	public static void main(String[] args) {

		Rectangulo r=new Rectangulo();
		r.lado1=10;
		r.lado2=4;
		
		Rectangulo r1=new Rectangulo();
		r1.lado1=20;
		r1.lado2=4;
		
		Rectangulo r2=new Rectangulo();
		r2.lado1=30;
		r2.lado2=4;
		
		Rectangulo r3=new Rectangulo();
		r3.lado1=40;
		r3.lado2=4;
		
		Rectangulo[] rconjunto=new Rectangulo[] {r,r1,r2,r3};
		
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
