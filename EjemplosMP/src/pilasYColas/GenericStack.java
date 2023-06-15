package pilasYColas;

import java.util.ArrayList;

public class GenericStack<E> {
  private ArrayList<E>
     lista = new ArrayList<E>();

  public int getSize() {
    return lista.size();
  }

  public E peek() {
    return lista.get(getSize() - 1);
  }

  public void push(E o) {
    lista.add(o);
  }

  public E pop() {
    E o = lista.get(getSize() - 1);
    lista.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return lista.isEmpty();
  }

  @Override
  public String toString() {
	return "Pila: " + lista.toString();
  }
}
