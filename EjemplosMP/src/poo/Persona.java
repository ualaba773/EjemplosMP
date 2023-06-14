package poo;

public class Persona {

	// Propiedades o atributos
	private int edad;
	
	private String nombre;
	
	private boolean muerto;
	
	
	//Constructor
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.muerto = false;
	}
	
	public Persona() {
		this.muerto = false;
	}
	
	//Metodos
	public void hablar() {
		System.out.println("hola");
	}
	
	


	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isMuerto() {
		return muerto;
	}

	@Override
	public String toString() {
		super.toString();
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
}
