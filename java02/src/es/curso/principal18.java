package es.curso;

public class principal18 {

	public static void main(String[] args) {

		rectangulo r=new rectangulo();
		r.lado1=10;
		r.lado2=4;
		
		rectangulo r1=new rectangulo();
		r1.lado1=20;
		r1.lado2=4;
		
		rectangulo r2=new rectangulo();
		r2.lado1=30;
		r2.lado2=4;
		
		rectangulo r3=new rectangulo();
		r3.lado1=40;
		r3.lado2=4;
		
		rectangulo[] rconjunto=new rectangulo[] {r,r1,r2,r3};
		
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
