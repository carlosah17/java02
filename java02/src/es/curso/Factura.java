package es.curso;

public class Factura {

	public double importe;
	
	public double CalcularConIva(double importe) {
		
		return importe*1.21;
		
	}
	
public double CalcularSoloIva(double importe) {
		
		return importe*0.21;
		
	}

}
