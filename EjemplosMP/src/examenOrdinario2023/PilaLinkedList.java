package examenOrdinario2023;

import java.util.LinkedList;

public class PilaLinkedList<T> {

	private LinkedList<T> linkedList;

	public PilaLinkedList(LinkedList<T> linkedList) {
		super();
		this.linkedList = linkedList;
	}
	
	public void apilar(T elemento) {
		linkedList.addFirst(elemento);
	}
	
	public T cima() throws PilaVaciaException{
		if(this.isVacia()) {
			throw new PilaVaciaException("Está vacía");
		}else {
			return linkedList.getLast();
		}
	}

	public boolean isVacia() {
		if(linkedList.size() == 0) {
			return true;
		}else {
			return false;
		}
		
		//return linkedList.isEmpty();
	}
}
