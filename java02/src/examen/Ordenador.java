package examen;

public class Ordenador {

	public boolean encendido;
	
	public Ordenador(boolean encendido) {
		super();
		this.encendido = encendido;
	}

	public boolean encenderlo() {
		
		return encendido=true;

		
	}
	
	public boolean apagarlo() {
		
		return encendido=false;
		
	}
	
	public boolean estaencendido() {
		
		if (encendido==true) {
			System.out.println("Esta encendido.");
			return true;
			
		}else {
			System.out.println("Esta apagado.");
			return false;
		}

		
	}
	
}
