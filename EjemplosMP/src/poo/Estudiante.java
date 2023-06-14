package poo;

public class Estudiante implements Persona1{

	private int edad;
	
	private String nombre;
	
	private boolean muerto;
	
	private String curso;
	
	public Estudiante(int edad, String nombre, String curso) {
		this.edad = edad;
		this.nombre = nombre;
		this.muerto = false;
		this.curso = curso;
	}
	
	@Override
	public void hablar() {
		System.out.println("Hola me llamo "+nombre);
		
	}

	public String toString() {
		return "Hola me llamo "+nombre;
	}
}
