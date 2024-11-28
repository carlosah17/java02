package es.curso;

public class principal6 {

	public static void main(String[] args) {
		
		persona paula = new persona();
		paula.edad=28;
		paula.nombre="Paula";
		
		persona manu = new persona();
		manu.edad=25;
		manu.nombre="Manu";
		
		persona[] alumnos = new persona[] {paula,manu};
		
		for (int i=0;i<alumnos.length;i++) {
			
			System.out.println(alumnos[i].nombre);
			System.out.println(alumnos[i].edad);
			
		}

	}

}
