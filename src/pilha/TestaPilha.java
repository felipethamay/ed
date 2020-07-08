package pilha;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestaPilha {

	private Pilha pilha = null;

	@Before
	public void iniciar() {
		pilha = new MinhaPilha();
	}

	@Test
	public void pushTest() throws Exception {
		pilha.push(3);
		Assert.assertEquals(new Integer(3), pilha.top());
		pilha.push(5);
		Assert.assertEquals(new Integer(5), pilha.top());
		pilha.push(7);
		Assert.assertEquals(new Integer(7), pilha.top());
		pilha.push(4);
		Assert.assertEquals(new Integer(4), pilha.top());
		pilha.push(2);
		Assert.assertEquals(new Integer(2), pilha.top());
	}

	// Neste teste a pilha tem que estourar o tamanho depois de 999
	@Test(expected = Exception.class)
	public void pushEstouroTeste() throws Exception {
		for (int i = 0; i < 1000; i++) {
			pilha.push(i);
		}
	}

	@Test
	public void topTest() throws Exception {
		Assert.assertNull(pilha.top());
		pilha.push(3);
		Assert.assertEquals(new Integer(3), pilha.top());
		pilha.push(5);
		Assert.assertEquals(new Integer(5), pilha.top());
		pilha.push(7);
		Assert.assertEquals(new Integer(7), pilha.top());
		pilha.push(4);
		Assert.assertEquals(new Integer(4), pilha.top());
		pilha.push(2);
		Assert.assertEquals(new Integer(2), pilha.top());

	}

	@Test
	public void popTest() throws Exception {
		try {
			pilha.pop();
			Assert.fail("deveria lan�ar uma exce��o quando chamar o pop de uma pilha vazia");
		} catch (Exception e) {
		}
		pilha.push(3);
		Assert.assertEquals(new Integer(3), pilha.top());
		pilha.push(5);
		Assert.assertEquals(new Integer(5), pilha.top());
		pilha.push(7);
		Assert.assertEquals(new Integer(7), pilha.top());
		pilha.push(4);
		Assert.assertEquals(new Integer(4), pilha.top());
		pilha.push(2);
		Assert.assertEquals(new Integer(2), pilha.top());
		Assert.assertEquals(new Integer(2), pilha.pop());
		Assert.assertEquals(new Integer(4), pilha.top());

		Assert.assertEquals(new Integer(4), pilha.pop());
		Assert.assertEquals(new Integer(7), pilha.top());

		Assert.assertEquals(new Integer(7), pilha.pop());
		Assert.assertEquals(new Integer(5), pilha.top());

		Assert.assertEquals(new Integer(5), pilha.pop());
		Assert.assertEquals(new Integer(3), pilha.top());

		Assert.assertEquals(new Integer(3), pilha.top());
	}

	@Test
	public void isEmptyTest() throws Exception {
		Assert.assertTrue(pilha.isEmpty());
		pilha.push(3);
		Assert.assertEquals(new Integer(3), pilha.top());
		Assert.assertFalse(pilha.isEmpty());
		pilha.pop();
		Assert.assertTrue(pilha.isEmpty());
		pilha.push(4);
		pilha.push(6);
		Assert.assertFalse(pilha.isEmpty());
	}

}
