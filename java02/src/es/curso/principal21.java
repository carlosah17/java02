package es.curso;

public class principal21 {

	public static void main(String[] args) {

		Bombilla intensidad1 = new Bombilla();
		intensidad1.setIntensidad(3);
		intensidad1.incrementar();
		System.out.println(intensidad1.getIntensidad());

	}

}
