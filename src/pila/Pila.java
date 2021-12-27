package pila;

/**
 * Clase que simula la pila estatica LIFO, usando un arreglo para 
 * guardar los elementos de la pila
 * 
 * @param <T>	El tipo de dato del que ser� la pila
 * @author 		Mateo Mtz
 * @since 		1.0.0
 */
public class Pila<T> implements IPila<T>{
	
	/**
	 * Arreglo de objetos usado para almacenar los elementos
	 */
	private Object pila[];
	
	/**
	 * �ndice actual del arreglo
	 */
	private int tope;
	
	/**
	 * Crear la pila
	 * @param tamanio tama�o de la pila que se desea crear
	 */
	public Pila(int tamanio){
		if(tamanio < 1)
			throw new IllegalArgumentException(
					"El tama�o debe ser mayor a 0");
		this.pila = new Object[tamanio];
		this.tope = -1;
	}
	@Override
	/**
	 * Comprueba si la pila esta vac�a
	 * @return verdadero si la pila esta vac�a
	 * 		   falso si la pila contiene elementos
	 */
	public boolean vacia() {
		return tope == -1;
	}

	@Override
	/**
	 * Comprueba si la pila esta llena
	 * @return verdadero si la pila esta llena, 
	 * 		   falso si la pila no esta llena
	 */
	public boolean llena() {
		return this.tope == this.pila.length - 1;
	}

	@Override
	/**
	 * Agrega un elemento a la pila (push), comprueba si la pila no esta llena,
	 * si lo esta, no agrega el elemento
	 * 
	 * @param elemento objeto que se desea agregar a la pila
	 */
	public void apilar(T elemento) {
		if(!llena()) {
			this.pila[++this.tope] = elemento;
		}else {
			System.out.println("Pila llena");
		}
	}

	@Override
	/**
	 * Quita un elemento de la pila si no esta vac�a 
	 * y lo retorna (pop). Se reutiliza el m�todo ultimoElemento
	 * 
	 * @return �ltimo elemento de la pila
	 * @see pila.Pila#ultimoElemento() m�todo reutilizado
	 */
	public T desapilar() {
		if(!vacia()) {
			T object = ultimoElemento();
			this.pila[this.tope--] = null;
			return object;
		}else {
			System.out.println("Pila vacia");
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	/**
	 * Retorna el �ltimo elemento de la pila SIN eliminarlo (peek)
	 * valida si la pila no esta vac�a, entonces retorna el elemento
	 * de lo contrario retornar� NULL
	 * 
	 * @return ultimo elemento, si no hay elementos retorna null
	 */
	public T ultimoElemento() {
		if(!vacia()) {
			return (T) this.pila[this.tope];
		}
		else {
			System.out.println("Pila vac�a");
			return null;
		}
	}

	@Override
	/**
	 * Retorna el tama�o de la pila; tama�o del arreglo
	 * 
	 * @return tama�o de la pila, dato entero
	 */
	public int tamanioPila() {
		return this.pila.length;
	}

	@Override
	/**
	 * Retorna el n�mero de elementos actuales en la pila
	 * 
	 * @return elementos en la pila, dato entero
	 */
	public int numeroElementos() {
		return this.tope + 1;
	}
	
	public String toString() {
		String cadena = "[";
		for(int i = 0; i < pila.length; i++) {
			if(this.pila.length - 1 == i)
				cadena += this.pila[i] + "]";
			else 
				cadena += this.pila[i] + ", ";
		}
		return cadena;
	}
}
