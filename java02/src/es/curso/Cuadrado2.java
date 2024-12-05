package es.curso;

public class Cuadrado2 {

	private double lado;

	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getLado() {
		
		return lado;
	}
	
	public Cuadrado2(double lado) {
		super();
		this.lado = lado;
	}

	public double area() {
		
		return lado*lado;	
	}
	
}
