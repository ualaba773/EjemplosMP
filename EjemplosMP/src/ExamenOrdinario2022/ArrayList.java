package ExamenOrdinario2022;

import java.util.AbstractList;
import java.util.Iterator;

public class ArrayList<E> {
	
	private int size;
	E[] data;
	
	// (2 puntos) a) Metodo add. Añade a la lista un  nuevo elemento e en la posicion especificada por index
	
	public void add(int index, E e) {
		
		if(index < 0 || index > data.length) {
			throw new IndexOutOfBoundsException("Falla");
		}
		
		ensureCapacity();
		
		for(int i = size-1; i >= index; i--) {
			E dato = data[i];
			data[i+1] = dato;
		}
		
		// 1 4 [] 5 2 7 8 3
		
		data[index] = e;
		
		size++;
	}
	
	// (1 punto) b) Metodo ensureCapacity. Verifica si eñ array data está lleno. De ser así, crea un nuevo array
	// de tamaño doble de data más 1 y copia data en el nuevo array
	
	
	public void ensureCapacity() {
		
		if(data.length >= size) {
			//Esta lleno
			E[] dataNuevo = (E[]) new Object[2*size+1];
			
			//(array que queremos, desde qué posicion queremos que copie, array donde queremos copiarlo, 
			
			System.arraycopy(data, 0, dataNuevo, 0, size);
			data = dataNuevo;
		}

		// [1, 2, 3]
		// [ ,  ,  , 1, 2, 3]
	}
	
	
	// (2 puntos) c) El método equals compara dos listas. Devuelve verdadero si son iguales y falso en caso contrario. Debe comparar el tamaño de las listas
	// Si el tamaño coincide, utilizar un iterador para cada lista e iterar ambas listas comparando pares de elementos
	
	public <T> boolean equals(Object o) {
		
		if(o instanceof AbstractList) { //Comprobamos que nos pasan una lista
			o = (AbstractList)o;
			
			if(this.size() == o.size()) {//Comprobamos que sean de la misma longitud
				
				Iterator <T> iterador1 = new Iterator<T>(this);
				Iterator <T> iterador2 = new Iterator<T>(o);
				
				while(iterador1.hasNext() && iterador2.hasNext()) { //Mientras los iterator tengan elementos que recorrer
					T dato1 = iterador1.next();
					T dato2 = iterador2.next();
					
					if(dato1 != dato2) {//Comprobamos uno a uno que los elementos sean iguales
						return false;
					}else {
						return true;
					}
				}
				
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
