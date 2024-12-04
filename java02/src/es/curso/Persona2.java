package es.curso;

public class Persona2 {

		private String nombre;
		
		private int edad;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Persona2(String nombre, int edad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

}
