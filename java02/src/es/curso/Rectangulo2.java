package es.curso;

public class Rectangulo2 {

	private double lado1;
	
	private double lado2;
	
	public double CalcularArea() {
		
		return lado1*lado2;
		
	}
	
	public double CalcularPerimetro() {
		
		return lado1*2+lado2*2;
		
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
}
