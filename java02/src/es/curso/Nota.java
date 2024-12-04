package es.curso;

public class Nota {

	private double valor;
	
	public double getValor() {
		
		return valor;
		
	}
	
	public void setValor(double v) {
		
		if(v>=1 && v<=10) {
			
		valor=v;
		
		}
		
	}

}
