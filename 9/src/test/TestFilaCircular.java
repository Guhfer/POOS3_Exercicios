package test;

import junit.framework.TestCase;
import model.FilaCircular;
import model.Nada;

public class TestFilaCircular extends TestCase {

	FilaCircular testF1 = new FilaCircular(15);
	FilaCircular testF2 = new FilaCircular(999);
	FilaCircular testF3 = new FilaCircular(-1);

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
		assertEquals(true, testF1.enqueue(n11));
		assertEquals(true, testF1.enqueue(n20));
		assertEquals(true, testF1.enqueue(n14));
		assertEquals(true, testF1.enqueue(n19));
		assertEquals(true, testF1.enqueue(n18));

		assertEquals(true, testF2.enqueue(n1));
		assertEquals(true, testF2.enqueue(n7));
		assertEquals(true, testF2.enqueue(n14));
		assertEquals(true, testF2.enqueue(n19));
		assertEquals(true, testF2.enqueue(n20));

		assertEquals(true, testF3.enqueue(n5));
		assertEquals(true, testF3.enqueue(n13));
		assertEquals(true, testF3.enqueue(n17));

	}

	public void testSairFila() {
		
		testF1.enqueue(n2);
		testF1.enqueue(n3);
		testF1.enqueue(n4);
		testF1.enqueue(n5);
		testF1.enqueue(n11);
		testF1.enqueue(n20);
		testF1.enqueue(n14);
		testF1.enqueue(n19);
		testF1.enqueue(n18);

		testF2.enqueue(n1);
		testF2.enqueue(n7);
		testF2.enqueue(n14);
		testF2.enqueue(n19);
		testF2.enqueue(n20);
		testF2.enqueue(n8);

		testF3.enqueue(n5);
		testF3.enqueue(n13);
		testF3.enqueue(n17);
			
		assertEquals(n2, testF1.dequeue());
		assertEquals(n1, testF2.dequeue());
		assertEquals(n5, testF3.dequeue());
		
		assertEquals(n4, testF1.dequeuePrioridade());
		assertEquals(n7, testF2.dequeuePrioridade());
		assertEquals(n13, testF3.dequeuePrioridade());
		
	}

}
