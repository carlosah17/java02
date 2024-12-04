package es.curso;

public class Factura2 {

	private double importe;
	
	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double CalcularConIva(double importe) {
		
		return importe*1.21;
		
	}
	
	public double CalcularSoloIva(double importe) {
		
		return importe*0.21;
		
	}

	public Factura2(double importe) {
		super();
		this.importe = importe;
	}

}
