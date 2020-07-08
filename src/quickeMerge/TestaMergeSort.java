package quickeMerge;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaMergeSort {
	Merge merge = new Merge();

	// TESTES DE INTERCALA��O
	// Caso 1: Um teste vai ter todos os numeros iguais

	@Test
	public void testIntercalaCaso1() {

		int[] arrayEntrada = { 2, 2, 2, 2, 2, 2 };
		int[] arrayEntradaControle = { 2, 2, 2, 2, 2, 2 };
		int q = 2;
		assertArrayEquals(merge.intercala(arrayEntrada, 0, q, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 2: Testar 10 entradas em ordem decrescente

	@Test
	public void testIntercalacaso2() {
		int[] arrayEntrada = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arrayEntradaControle = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int q = 4;
		assertArrayEquals(merge.intercala(arrayEntrada, 0, q, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 3: Testar 10 entradas em ordem crescente

	@Test
	public void testIntercalacaso3() {
		int[] arrayEntrada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int q = 4;
		assertArrayEquals(merge.intercala(arrayEntrada, 0, q, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 4: Testar numeros aleat�rios inseridos por min

	@Test
	public void testIntercalacaso4() {
		int[] arrayEntrada = { 2, 8, 7, 1, 3, 5, 6 };
		int[] arrayEntradaControle = { 2, 3, 5, 6, 8, 7, 1 };
		int q = 3;
		assertArrayEquals(merge.intercala(arrayEntrada, 0, q, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 5: Testar entrada {5,4,3,2,1,10,9,8,7,6}

	@Test
	public void testIntercalacaso5() {
		int[] arrayEntrada = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int[] arrayEntradaControle = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int q = 4;
		assertArrayEquals(merge.intercala(arrayEntrada, 0, q, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// TESTES DE ORDENA��O
	// Caso 1: Um teste vai ter todos os numeros iguais

	@Test
	public void testOrdenacaso1() {
		int[] arrayEntrada = { 2, 2, 2, 2, 2, 2 };
		int[] arrayEntradaControle = { 2, 2, 2, 2, 2, 2 };
		assertArrayEquals(merge.ordena(arrayEntrada, 0, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 2: Testar 10 entradas em ordem decrescente

	@Test
	public void testOrdenacaso2() {
		int[] arrayEntrada = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(merge.ordena(arrayEntrada, 0, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 3: Testar 10 entradas em ordem crescente

	@Test
	public void testOrdenacaso3() {
		int[] arrayEntrada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(merge.ordena(arrayEntrada, 0, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 4: Testar numeros aleat�rios inseridos por min

	@Test
	public void testOrdenacaso4() {
		int[] arrayEntrada = { 2, 8, 7, 1, 3, 5, 6 };
		int[] arrayEntradaControle = { 1, 2, 3, 5, 6, 7, 8 };
		assertArrayEquals(merge.ordena(arrayEntrada, 0, arrayEntrada.length - 1), arrayEntradaControle);
	}

	// Caso 5: Testar entrada {5,4,3,2,1,10,9,8,7,6}

	@Test
	public void testOrdenacaso5() {
		int[] arrayEntrada = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(merge.ordena(arrayEntrada, 0, arrayEntrada.length - 1), arrayEntradaControle);
	}
}
