package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		
		File file = new File("./archivonuevo");
		
		
		//--------------LEER ARCHIVOS DE TEXTO---------
		
		try {
			
			//Lee archivos de texto caracter a caracter 
			FileReader fr = new FileReader(file);
			//FileReader fr = new FileReader("ruta_archivo");
			
			fr.read();
			
			fr.close();
			
			//Lee archivos de texto linea a linea
			BufferedReader br = new BufferedReader(fr);
			
			br.read(); //lee carcarter a caracter
			br.readLine(); //lee la linea entera
			br.close();
			
			//"2.1;1.1;3.1"
			
			String linea = "Hola me llamo Pepe";
			
			//Como el BufferedeReader pero permite leer hasta un delimitador que le indiquemos
			Scanner sc = new Scanner(file);
			//Scanner sc = new Scanner(linea);
			sc.useDelimiter(";");
			sc.hasNext();
			sc.next();
			sc.nextInt();
			sc.close();
			
			
			//-----------------ESCRIBIR ARCHIVOS DE TEXTO-----------------
			
			
			//Escribe caracter a caracter
			FileWriter fw = new FileWriter(file);
			//FileWriter fw = new FileWriter("ruta_archivo");
			
			fw.write('a');
			fw.write("a");
			fw.close();
			
			//Escribir archivos de texto linea a linea
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			char[] caracteres = {'a', 'b', 'c'};
			bw.write(caracteres);
			bw.close();
			
			//Igual que el BufferedWriter pero con otros métodos
			PrintWriter pw = new PrintWriter(file);
			pw.println();
			pw.print("");
			pw.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void copiar(File origen, File destino) {
		
		try {
			
			//Para copiar primero leemos del archivo origen
			
			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(destino);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String linea;
			
			while((linea = br.readLine()) != null) { //Leemos la linea y vemos si contiene texto
				bw.write(linea); //Escribimos lo que haya leido
				bw.newLine();
			}
			
			br.close();
			bw.close();
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
	}
	
	
	//------------------EXAMEN 2022--------------------
	
	
	public void escribirATexto(Matriz2DReal matriz, File file) {
		try {
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			//Obtengo los datosa de la matriz
			int nFilas = matriz.getnFilas();
			int nCols = matriz.getnCols();
			double[][] elementos = matriz.getElementos();
			
			
			
			bw.write("NumeroFilas;NumeroColumnas");
			bw.newLine();
			bw.write(nFilas+";"+nCols);
			bw.newLine();
			
			for(int filas = 0; filas < nFilas; filas++) { //Recorro filas
				for(int columnas = 0; columnas < nCols; columnas++) { //Recorro columnas
					bw.write(elementos[filas][columnas]+""); //Escribo el dato
					if(columnas < nCols-1) {
						bw.write(";");
					}
				}
				if(filas < nFilas-1) {
					bw.newLine();
				}
			}
			bw.close();
			
		}catch(IOException e) {
			
		}
	}
	
	public Matriz2DReal leerDeTexto(File file) {
		
		Matriz2DReal matriz = null;
		
		try {
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();
			
			String linea = br.readLine();
			Scanner sc = new Scanner(linea);
			sc.useDelimiter(";");
			
			int nFilas = sc.nextInt();
			int nCols = sc.nextInt();
			
			double[][] elementos = new double[nFilas][nCols]; 
			
			for(int filas = 0; filas < nFilas; filas++) {
				linea = br.readLine();
				sc = new Scanner(linea);
				sc.useDelimiter(";");
				sc.useLocale(Locale.US);
				int columnas = 0;
				while(sc.hasNext()) {
					elementos[filas][columnas] = sc.nextDouble();
					columnas++;
				}
			}
			
			matriz = new Matriz2DReal(elementos);
			
			sc.close();
			br.close();
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
		
		return matriz;
	}

}
