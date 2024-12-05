package es.curso;

public class Alumno {

	private int nota;

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Alumno(int nota) {
		super();
		this.nota = nota;
	}

	public String imprimirnota() {
		
		if(nota<=10 && nota>8) {
			return "Sobresaliente.";}
		
			else if(nota>6 && nota<9) {
			return "Notable.";}
		
			else if(nota==6) {
			return "Bien.";}
		
			else if(nota==5) {
			return "Suficiente.";}
			
			else if(nota<5 && nota>=0) {
				return "Suspenso.";
				
			}else {
			return "Mete una nota valida.";
		}
	}
	
}
