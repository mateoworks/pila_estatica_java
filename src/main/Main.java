package main;

import pila.IPila;
import pila.Pila;

public class Main {
	public static void main(String[] args) {
		IPila<Object> pila = new Pila<>(2);
		pila.apilar(1);
		pila.apilar(2);
		System.out.println(pila);
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
	}
}
