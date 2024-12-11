package es.curso;

public class Turista {

	private String nombre;
	private Maletas maleta1;
	private Maletas maleta2;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Maletas getMaleta1() {
		return maleta1;
	}
	public void setMaleta1(Maletas maleta1) {
		this.maleta1 = maleta1;
	}
	public Maletas getMaleta2() {
		return maleta2;
	}
	public void setMaleta2(Maletas maleta2) {
		this.maleta2 = maleta2;
	}
	
	public Turista(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public double pesototal() {
		if(maleta1!=null && maleta2!=null) {
			return maleta1.getPeso()+maleta2.getPeso();
		}else if(maleta1!=null && maleta2==null) {
			return maleta1.getPeso();
		}else{
			return maleta2.getPeso();
		}
		
	}
	
	public double pesototal2(double peso1, double peso2) {
		
		return peso1+peso2;
		
	}

}
