package Pila;

import java.util.Stack;

public class main {

	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<Integer>();
		
		System.out.println("Pila vacia: "+pila);
		System.out.println("Esta vacia? "+pila.isEmpty());

		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		
		for(Integer pilita : pila) {
			System.out.println(pilita);
		}
		
		System.out.println("Pila: "+pila);
		System.out.println("Pila vacia? "+pila.isEmpty());
		
		pila.pop();
		System.out.println("Esta el 3? "+pila.search(3));
		System.out.println("Ultimo agregado: "+pila.peek());
	}
}
