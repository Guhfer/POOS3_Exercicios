package test;

import junit.framework.TestCase;
import model.Fila;
import model.Nada;

public class TestFila extends TestCase {

	Fila testF1 = new Fila(200);
	Fila testF2 = new Fila(100);
	Fila testF3 = new Fila(999);
	Fila testF4 = new Fila(-1);
	Fila testF5 = new Fila();

	Nada n1 = new Nada();
	Nada n2 = new Nada(true);
	Nada n3 = new Nada();
	Nada n4 = new Nada(true);
	Nada n5 = new Nada(true);
	Nada n6 = new Nada();
	Nada n7 = new Nada(true);
	Nada n8 = new Nada();
	Nada n9 = new Nada();
	Nada n10 = new Nada(true);
	Nada n11 = new Nada(true);
	Nada n12 = new Nada();
	Nada n13 = new Nada();
	Nada n14 = new Nada();
	Nada n15 = new Nada(true);
	Nada n16 = new Nada(true);
	Nada n17 = new Nada();
	Nada n18 = new Nada(true);
	Nada n19 = new Nada();
	Nada n20 = new Nada(true);

	public void testEntrarFila() {

		assertEquals(true, testF1.enqueue(n1));
		assertEquals(true, testF1.enqueue(n2));
		assertEquals(true, testF1.enqueue(n3));
		assertEquals(true, testF1.enqueue(n4));
		assertEquals(true, testF1.enqueue(n5));

		assertEquals(true, testF2.enqueue(n20));
		assertEquals(true, testF2.enqueue(n19));
		assertEquals(true, testF2.enqueue(n18));
		assertEquals(true, testF2.enqueue(n17));
		assertEquals(true, testF2.enqueue(n16));

		assertEquals(true, testF3.enqueue(n6));
		assertEquals(true, testF3.enqueue(n7));
		assertEquals(true, testF3.enqueue(n8));
		assertEquals(true, testF3.enqueue(n9));
		assertEquals(true, testF3.enqueue(n10));

		assertEquals(true, testF4.enqueue(n11));
		assertEquals(true, testF4.enqueue(n12));
		assertEquals(true, testF4.enqueue(n13));
		assertEquals(true, testF4.enqueue(n14));
		assertEquals(true, testF4.enqueue(n15));

		assertEquals(true, testF5.enqueue(n1));
		assertEquals(true, testF5.enqueue(n20));
		assertEquals(true, testF5.enqueue(n11));

		assertEquals(false, testF1.enqueue(null));
		assertEquals(false, testF2.enqueue(null));
		assertEquals(false, testF3.enqueue(null));
		assertEquals(false, testF4.enqueue(null));
		assertEquals(false, testF5.enqueue(null));

	}

	public void testSairFila() {
		
		testF1.enqueue(n1);
		testF1.enqueue(n2);
		testF1.enqueue(n3);
		testF1.enqueue(n4);
		testF1.enqueue(n5);

		testF2.enqueue(n20);
		testF2.enqueue(n19);
		testF2.enqueue(n18);
		testF2.enqueue(n17);
		testF2.enqueue(n16);

		testF3.enqueue(n6);
		testF3.enqueue(n7);
		testF3.enqueue(n8);
		testF3.enqueue(n9);
		testF3.enqueue(n10);

		testF4.enqueue(n11);
		testF4.enqueue(n12);
		testF4.enqueue(n13);
		testF4.enqueue(n14);
		testF4.enqueue(n15);

		testF5.enqueue(n1);
		testF5.enqueue(n20);
		testF5.enqueue(n11);

		testF1.enqueue(null);
		testF2.enqueue(null);
		testF3.enqueue(null);
		testF4.enqueue(null);
		testF5.enqueue(null);

		assertEquals(n1, testF1.dequeue());
		assertEquals(n20, testF2.dequeue());
		assertEquals(n6, testF3.dequeue());
		assertEquals(n11, testF4.dequeue());
		assertEquals(n1, testF5.dequeue());

		assertEquals(n19, testF2.dequeue());
		assertEquals(n12, testF4.dequeue());
	
		assertEquals(n2, testF1.dequeuePrioridade());
		assertEquals(n18, testF2.dequeuePrioridade());
		assertEquals(n7, testF3.dequeuePrioridade());
		assertEquals(n15, testF4.dequeuePrioridade());
		assertEquals(n20, testF5.dequeuePrioridade());

	}	
}
