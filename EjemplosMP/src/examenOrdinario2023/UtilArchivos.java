package examenOrdinario2023;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UtilArchivos {
	
	public List<File> listarArchivos(File directorio){
		ArrayList<File> archivos = new ArrayList<File>();
				
		File[] array_archivos = directorio.listFiles();
		
		for(int i = 0; i < array_archivos.length; i++) {
			
			if(array_archivos[i].isFile()) {
				archivos.add(array_archivos[i]);
			}
			
		}
		
		return archivos;
	}

}
