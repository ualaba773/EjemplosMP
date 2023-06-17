package examenOrdinario2023;

import java.io.File;
import java.util.Iterator;

public class FileIterator implements Iterator<File> {

	File[] archivos;
	int indice;

	public FileIterator(File directorio) {
		this.archivos = directorio.listFiles();
		this.indice = 0;
	}

	@Override
	public boolean hasNext() {
		if (indice >= archivos.length) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public File next() {
		File file = null;
		if (this.hasNext()) {
			file = archivos[indice];
			indice++;
		}
		return file;
	}

}
