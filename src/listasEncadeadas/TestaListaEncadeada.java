package listasEncadeadas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaListaEncadeada {

	private ListaDuplamenteEncadeadaIF<Integer> listaEnc = null;

	@Before
	public void inicializar() {
		listaEnc = new ListaDuplamenteEncadeada<Integer>();
	}

	@Test
	public void imprimeEmOrdemTest() {
		Assert.assertEquals("", listaEnc.imprimeEmOrdem());
		listaEnc.inserir(2);
		Assert.assertEquals("2", listaEnc.imprimeEmOrdem());
		listaEnc.inserir(10);
		Assert.assertEquals("2, 10", listaEnc.imprimeEmOrdem());
		listaEnc.inserir(5);
		Assert.assertEquals("2, 10, 5", listaEnc.imprimeEmOrdem());
		listaEnc.inserir(9);
		Assert.assertEquals("2, 10, 5, 9", listaEnc.imprimeEmOrdem());
		listaEnc.inserir(1);
		Assert.assertEquals("2, 10, 5, 9, 1", listaEnc.imprimeEmOrdem());
		listaEnc.inserir(3);
		Assert.assertEquals("2, 10, 5, 9, 1, 3", listaEnc.imprimeEmOrdem());
		listaEnc.inserir(4);
		Assert.assertEquals("2, 10, 5, 9, 1, 3, 4", listaEnc.imprimeEmOrdem());
	}

	@Test
	public void imprimeInversoTest() {
		Assert.assertEquals("", listaEnc.imprimeInverso());
		listaEnc.inserir(2);
		Assert.assertEquals("2", listaEnc.imprimeInverso());
		listaEnc.inserir(10);
		Assert.assertEquals("10, 2", listaEnc.imprimeInverso());
		listaEnc.inserir(5);
		Assert.assertEquals("5, 10, 2", listaEnc.imprimeInverso());
		listaEnc.inserir(9);
		Assert.assertEquals("9, 5, 10, 2", listaEnc.imprimeInverso());
		listaEnc.inserir(1);
		Assert.assertEquals("1, 9, 5, 10, 2", listaEnc.imprimeInverso());
		listaEnc.inserir(3);
		Assert.assertEquals("3, 1, 9, 5, 10, 2", listaEnc.imprimeInverso());
		listaEnc.inserir(4);
		Assert.assertEquals("4, 3, 1, 9, 5, 10, 2", listaEnc.imprimeInverso());
	}

	@Test
	public void inserirBuscarTeste() {
		Assert.assertEquals(null, listaEnc.buscar(20));
		listaEnc.inserir(20);
		Assert.assertEquals(new Registro<Integer>(20), listaEnc.buscar(20));
		listaEnc.inserir(15);
		Assert.assertEquals(new Registro<Integer>(15), listaEnc.buscar(15));
		listaEnc.inserir(3);
		Assert.assertEquals(new Registro<Integer>(3), listaEnc.buscar(3));
		listaEnc.inserir(90);
		Assert.assertEquals(new Registro<Integer>(90), listaEnc.buscar(90));
		listaEnc.inserir(100);
		Assert.assertEquals(new Registro<Integer>(100), listaEnc.buscar(100));
		listaEnc.inserir(73);
		Assert.assertEquals(new Registro<Integer>(73), listaEnc.buscar(73));
		listaEnc.inserir(29);
		Assert.assertEquals(new Registro<Integer>(29), listaEnc.buscar(29));
		Assert.assertEquals(null, listaEnc.buscar(230));
	}

	@Test
	public void inserirRemoverTeste() {
		listaEnc.inserir(206);
		listaEnc.inserir(152);
		listaEnc.inserir(38);
		listaEnc.inserir(91);
		listaEnc.inserir(18);
		listaEnc.inserir(93);
		listaEnc.inserir(69);
		Assert.assertEquals("206, 152, 38, 91, 18, 93, 69", listaEnc.imprimeEmOrdem());
		Assert.assertEquals(new Registro<Integer>(91), listaEnc.remover(91));
		Assert.assertEquals("206, 152, 38, 18, 93, 69", listaEnc.imprimeEmOrdem());

		Assert.assertEquals(new Registro<Integer>(18), listaEnc.remover(18));
		Assert.assertEquals("206, 152, 38, 93, 69", listaEnc.imprimeEmOrdem());

		Assert.assertEquals(new Registro<Integer>(206), listaEnc.remover(206));
		Assert.assertEquals("152, 38, 93, 69", listaEnc.imprimeEmOrdem());

		Assert.assertEquals(new Registro<Integer>(152), listaEnc.remover(152));
		Assert.assertEquals("38, 93, 69", listaEnc.imprimeEmOrdem());

		Assert.assertEquals(new Registro<Integer>(93), listaEnc.remover(93));
		Assert.assertEquals("38, 69", listaEnc.imprimeEmOrdem());

		Assert.assertEquals(new Registro<Integer>(69), listaEnc.remover(69));
		Assert.assertEquals("38", listaEnc.imprimeEmOrdem());

		Assert.assertEquals(new Registro<Integer>(38), listaEnc.remover(38));
		Assert.assertEquals("", listaEnc.imprimeEmOrdem());
	}

	@Test
	public void sucessorTeste() {
		listaEnc.inserir(206);
		listaEnc.inserir(122);
		listaEnc.inserir(58);
		listaEnc.inserir(11);
		listaEnc.inserir(78);
		listaEnc.inserir(43);
		listaEnc.inserir(59);
		Assert.assertEquals(new Registro<Integer>(122), listaEnc.sucessor(206));
		Assert.assertEquals(new Registro<Integer>(58), listaEnc.sucessor(122));
		Assert.assertEquals(new Registro<Integer>(11), listaEnc.sucessor(58));
		Assert.assertEquals(new Registro<Integer>(78), listaEnc.sucessor(11));
		Assert.assertEquals(new Registro<Integer>(43), listaEnc.sucessor(78));
		Assert.assertEquals(new Registro<Integer>(59), listaEnc.sucessor(43));

	}

	@Test
	public void predecessorTeste() {
		listaEnc.inserir(206);
		listaEnc.inserir(122);
		listaEnc.inserir(58);
		listaEnc.inserir(11);
		listaEnc.inserir(78);
		listaEnc.inserir(43);
		listaEnc.inserir(59);
		Assert.assertEquals(new Registro<Integer>(43), listaEnc.predecessor(59));
		Assert.assertEquals(new Registro<Integer>(78), listaEnc.predecessor(43));
		Assert.assertEquals(new Registro<Integer>(11), listaEnc.predecessor(78));
		Assert.assertEquals(new Registro<Integer>(58), listaEnc.predecessor(11));
		Assert.assertEquals(new Registro<Integer>(122), listaEnc.predecessor(58));
		Assert.assertEquals(new Registro<Integer>(206), listaEnc.predecessor(122));

	}

}