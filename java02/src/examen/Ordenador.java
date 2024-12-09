package examen;

public class Ordenador {

	public boolean encendido;
	
	public boolean encenderlo() {
		
		return encendido=true;

		
	}
	
	public boolean apagarlo() {
		
		return encendido=false;
		
	}
	
	public void estaencendido() {
		
		if (encendido=true) {
			System.out.println("Esta encendido.");
			
		}else {
			System.out.println("Esta apagado.");
		}

		
	}
	
}
