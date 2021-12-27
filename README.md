# Pila estática con Java

La pila estática usa un arreglo para almacenar los datos, por lo tanto, estas tienen un tamaño definido desde su creación. Estas estructuras de datos son finitas y determinadas por el tamaño de la creación del arreglo.

# Uso

Este proyecto fue realizado con el IDE Eclipse, por lo tanto se recomienda abrirlo con el mismo.
Más detalles sobre la pila estática [aquí](https://gobitza.com/pila-estatica-con-java/).

# Operaciones de una pila estática

## Crear la pila

```java
    /**
	 * Arreglo de objetos usado para almacenar los elementos
	 */
	private Object pila[];

	/**
	 * Índice actual del arreglo
	 */
	private int tope;

	/**
	 * Crear la pila
	 * @param tamanio tamaño de la pila que se desea crear
	 */
	public Pila(int tamanio){
		if(tamanio < 1)
			throw new IllegalArgumentException(
					"El tamaño debe ser mayor a 0");
		this.pila = new Object[tamanio];
		this.tope = -1;
	}
```

## Pila vacía

```java
    public boolean vacia() {
		return tope == -1;
	}
```

## Pila llena

```java
    public boolean llena() {
		return this.tope == this.pila.length - 1;
	}
```

## Apilar (push)

```java
    public void apilar(T elemento) {
		if(!llena()) {
			this.pila[++this.tope] = elemento;
		}else {
			System.out.println("Pila llena");
		}
	}
```

## Desapilar (pop)

```java
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
```

## Último elemento (peek o top)

```java
    public T ultimoElemento() {
		if(!vacia()) {
			return (T) this.pila[this.tope];
		}
		else {
			System.out.println("Pila vacía");
			return null;
		}
	}
```
