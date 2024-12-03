package es.curso;

public class principal17 {

	public static void main(String[] args) {

		Factura f=new Factura();
		f.importe=100;
		System.out.println(f.importe);
		System.out.println(f.CalcularConIva(f.importe));
		System.out.println(f.CalcularSoloIva(f.importe));
		
	}

}
