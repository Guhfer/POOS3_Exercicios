package view;

import model.Fila;
import model.FilaCircular;
import model.Nada;

public class Main {
	public static void main(String[] args) {
		
		Fila testF1 = new Fila(200);
		FilaCircular testF2 = new FilaCircular();
		
		Nada n1 = new Nada();
		Nada n2 = new Nada(true);
		Nada n3 = new Nada();
		Nada n4 = new Nada(true);
		Nada n5 = new Nada(true);
		
		System.out.println(testF1.enqueue(n1));
		System.out.println(testF1.enqueue(n2));
		System.out.println(testF1.enqueue(n3));
		
		System.out.println(testF1.dequeue());
		System.out.println(testF1.dequeuePrioridade());
		
		System.out.println(testF2.enqueue(n4));
		System.out.println(testF2.enqueue(n5));
		
		System.out.println(testF2.dequeue());
		System.out.println(testF2.dequeuePrioridade());
		
		
		
	}
	
}
