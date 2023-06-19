package ejercicio2Ordinaria2020;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BancoSER {

	String nombreArchivo;
	
	public BancoSER(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	public void escribir(Banco banco) {
		File file = new File(nombreArchivo);
		
		try {
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(banco);
			
			oos.close();
			
		}catch(IOException e) {
			
		}
	}
	
	public Banco leer() {
		Banco banco = null;
		File file = new File(nombreArchivo);
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			banco = (Banco) ois.readObject();
			
			ois.close();
			
		}catch(FileNotFoundException e) {
			System.out.print("El programa falla");
		}catch(ClassNotFoundException pepe) {
			pepe.printStackTrace();
		}catch(IOException e) {
			
		}
		
		return banco;
	}
}
