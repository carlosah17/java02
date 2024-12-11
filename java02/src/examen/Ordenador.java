package examen;

public class Ordenador {

	private boolean encendido;
	
	public boolean estaEncendido() {
		
		return encendido;
		
	}
	
	public boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Ordenador(boolean encendido) {
		super();
		this.encendido = encendido;
	}

	public void encenderlo() {
		
		if (!encendido) {
			encendido=true;
		}
		
	}
	
	public void apagarlo() {
		
		if (encendido) {
			encendido=false;
		}
		
	}
	
	public void estaencendido() {
		
		if (encendido==true) {
			System.out.println("Esta encendido.");
			
			
		}else {
			System.out.println("Esta apagado.");
			
		}

		
	}
	
}
