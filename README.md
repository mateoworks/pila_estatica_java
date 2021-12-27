# Pila estática con Java

La pila estática usa un arreglo para almacenar los datos, por lo tanto, estas tienen un tamaño definido desde su creación. Estas estructuras de datos son finitas y determinadas por el tamaño de la creación del arreglo.

# Uso

Este proyecto fue realizado con el IDE Eclipse, por lo tanto se recomienda abrirlo con el mismo.

# Operaciones de una pila estática

## Crear la pila

´´´java
private Object pila[];
/**
_ Índice actual del arreglo
_/
private int tope;
/**
_ Crear la pila
_ @param tamanio tamaño de la pila que se desea crear
\*/
public Pila(int tamanio){
if(tamanio < 1)
throw new IllegalArgumentException(
"El tamaño debe ser mayor a 0");
this.pila = new Object[tamanio];
this.tope = -1;
}
´´´

## Pila vacía

´´´java
public boolean vacia() {
return tope == -1;
}
