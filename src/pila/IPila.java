package pila;

public interface IPila<T> {
	public boolean vacia();
	public boolean llena();
	public void apilar(T elemento);
	public T desapilar();
	public T ultimoElemento();
	public int tamanioPila();
	public int numeroElementos();
}
