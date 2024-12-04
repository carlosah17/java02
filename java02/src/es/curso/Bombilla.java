package es.curso;

public class Bombilla {

	private int intensidad;
	
	public int getIntensidad() {
		
		return intensidad;
		
	}
	
	public void setIntensidad(int i) {
		
		if(i>=0 && i<=3) {
			
		intensidad=i;
		
		}
		
	}
	
	public void incrementar() {
			
		//intensidad=intensidad+1;
		setIntensidad(getIntensidad()+1);
	}
	
	public void decrementar() {
		
		//intensidad=intensidad-1;
		setIntensidad(getIntensidad()-1);
		
	}

}
