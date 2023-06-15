package ExamenOrdinario2022;

import pilasYColas.GenericQueue;

public class GenericJosephus<E> {

	private int k;

	private int n;

	private GenericQueue<E> cola;

	// a) Constructor de la clase GnericJosephus
	public GenericJosephus(int k, int n, E[] objects) {
		this.k = k;
		this.n = n;
		cola = new GenericQueue();
		if (objects != null) {
			for (int i = 0; i < objects.length; i++) {
				cola.enqueue(objects[i]);
			}
		}
	}
	
	// b) método getCola()
	public GenericQueue<E> getCola(){
		return cola;
	}

	
	//c) método toString()
	
	public String toString() {
		return "Problema de Josephus: k="+k+", n="+n+"\n"+cola.toString();
	}
	
	//d) El método ordenEliminar
	
	public String ordenEliminar(GenericQueue<E> cola) {
		
		if(cola.getSize() == 0) {
			throw new RuntimeException("No hay ninguna persona");
		} else if(cola.getSize() == 1) {
			//throw new RuntimeException("Solo hay una persona");
			cola.dequeue();
			return "Solo hay una persona";
		} else {
			String salida = "Orden de eliminación:\n";
			
			//Recorre la cola
			for (int i = 0; i < n; i++) {
				//Recorre los elementos antes de la posicion que queremos eliminar
				for (int j = 1; j < k; j++) {
					//Los elementos de antes los eliminamos y los volvemos a meter en la cola
					E elemento = cola.dequeue();
					cola.enqueue(elemento);
				}
				
				//Eliminamos el elemento

				E elemento = cola.dequeue();
				salida += "Elimino "+elemento+"\n";
			}
			return salida;
		}
	}
}
