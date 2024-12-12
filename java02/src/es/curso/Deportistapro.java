package es.curso;

public class Deportistapro extends Deportista{

		private String nivel;

		public String getNivel() {
			return nivel;
		}

		public void setNivel(String nivel) {
			this.nivel = nivel;
		}

		public Deportistapro(String nombre, String deporte, String nivel) {
			super(nombre,deporte);
			this.setNombre(nombre);
			this.setNombre(deporte);
			this.nivel=nivel;
		}

}
