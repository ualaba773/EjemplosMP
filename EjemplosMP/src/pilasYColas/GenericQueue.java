package pilasYColas;

import java.util.LinkedList;

public class GenericQueue<E> {
  private LinkedList<E> lista
    = new LinkedList<E>();

  //Encolar, añade al final
  public void enqueue(E e) {
    lista.addLast(e);
  }

  //Desencolar, quita el primero de la cola
  public E dequeue() {
    return lista.removeFirst();
  }

  public int getSize() {
    return lista.size();
  }

  @Override
  public String toString() {
    return "Cola: " + lista.toString();
  }
}
