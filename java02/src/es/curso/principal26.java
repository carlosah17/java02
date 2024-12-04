package es.curso;

public class principal26 {

	public static void main(String[] args) {

		Factura2 f=new Factura2(100,17);
		System.out.println(f.CalcularConIva(f.getImporte()));
		System.out.println(f.CalcularSoloIva(f.getImporte()));
		
	}

}
