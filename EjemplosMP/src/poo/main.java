package poo;

public class main {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona(23, "Manolo");
		Estudiante estudiante1 = new Estudiante(20, "Pablo", "1º Ing. informatica");

		System.out.println(persona1);
		System.out.println(persona2);
		persona1.hablar();
		estudiante1.hablar();

	}

}
