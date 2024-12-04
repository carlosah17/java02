package es.curso;

public class Factura2 {

	private double importe;
	private double numiva;
	
	public Factura2(double importe, double numiva) {
		super();
		this.importe = importe;
		this.numiva = numiva;
	}

	public double getNumiva() {
		return numiva;
	}

	public void setNumiva(double numiva) {
		this.numiva = numiva;
	}

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

}
