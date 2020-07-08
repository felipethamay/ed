package fila;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestaFila {

	private Fila fila = null;

	@Before
	public void iniciar() {
		fila = new MinhaFila();
	}

	@Test
	public void enqueueTest() throws Exception {
		fila.enqueue(3);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(5);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(7);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(4);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(2);
		Assert.assertEquals(new Integer(3), fila.front());
	}

	// Neste teste a fila tem que estourar o tamanho depois de 999
	@Test(expected = Exception.class)
	public void enqueueEstouroTeste() throws Exception {
		fila = new MinhaFila(5);
		for (int i = 0; i <= 6; i++) {
			fila.enqueue(i);
		}
	}

	@Test
	public void frontTest() throws Exception {
		Assert.assertNull(fila.front());
		fila.enqueue(3);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(5);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(7);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(4);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(2);
		Assert.assertEquals(new Integer(3), fila.front());

	}

	// configurar o tamanho da fila para 5
	@Test
	public void dequeueTest() throws Exception {
		fila = new MinhaFila(5);
		try {
			fila.dequeue();
			Assert.fail("deveria lan�ar uma exce��o quando chamar o dequeue de uma pilha vazia");
		} catch (Exception e) {
		}
		fila.enqueue(3);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(5);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(7);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(4);
		Assert.assertEquals(new Integer(3), fila.front());
		fila.enqueue(2);
		Assert.assertEquals(new Integer(3), fila.front());
		Assert.assertEquals(new Integer(3), fila.dequeue());
		Assert.assertEquals(new Integer(5), fila.front());

		fila.enqueue(15);

		Assert.assertEquals(new Integer(5), fila.dequeue());
		Assert.assertEquals(new Integer(7), fila.front());

		fila.enqueue(20);

		Assert.assertEquals(new Integer(7), fila.dequeue());
		Assert.assertEquals(new Integer(4), fila.front());

		Assert.assertEquals(new Integer(4), fila.dequeue());
		Assert.assertEquals(new Integer(2), fila.front());

		Assert.assertEquals(new Integer(2), fila.dequeue());
	}

	@Test
	public void isEmptyTest() throws Exception {
		Assert.assertTrue(fila.isEmpty());
		fila.enqueue(3);
		Assert.assertEquals(new Integer(3), fila.front());
		Assert.assertFalse(fila.isEmpty());
		fila.dequeue();
		Assert.assertTrue(fila.isEmpty());
	}

}
