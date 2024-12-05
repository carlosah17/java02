package es.curso;

public class Cuadrado {

	private double lado1;

	public void setLado1(double lado1) {
		this.lado1=lado1;

	}

	public void setLado2(double lado2) {
		this.lado1 = lado2;

	}
	
	public double getLado1() {
		
		return lado1;
	}
	
	public double getLado2() {
		return lado1;
	}
	
	public double area() {
		
		return lado1*lado1;
		
	}

	public Cuadrado(double lado1) {
		super();
		this.lado1 = lado1;
	}
	
}
