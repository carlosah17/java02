package es.curso;

public class principal06 {

	public static void main(String[] args) {
		
		Persona paula = new Persona();
		paula.edad=28;
		paula.nombre="Paula";
		
		Persona manu = new Persona();
		manu.edad=25;
		manu.nombre="Manu";
		
		Persona[] alumnos = new Persona[] {paula,manu};
		
		for (int i=0;i<alumnos.length;i++) {
			
			System.out.println(alumnos[i].nombre);
			System.out.println(alumnos[i].edad);
			
		}

	}

}
