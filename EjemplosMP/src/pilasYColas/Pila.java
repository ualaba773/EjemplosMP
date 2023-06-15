package pilasYColas;

public interface Pila<T> {

	/**
	 * Agrega un elemento a la pila
	 * @param elemento
	 */
	public void apilar(T elemento);
	
	/**
	 * 
	 * @return T
	 * @throws PilaVaciaException
	 */
	public T desapilar() throws PilaVaciaException;
}
