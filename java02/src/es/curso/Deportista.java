package es.curso;

public class Deportista extends Persona3{

		private String deporte;

		public String getDeporte() {
			return deporte;
		}

		public void setDeporte(String deporte) {
			this.deporte = deporte;
		}

		public Deportista(String nombre, String deporte) {
			super(nombre);
			this.setNombre(nombre);
			this.deporte = deporte;
		}

}
