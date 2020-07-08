package bubbleInsertionSelection;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestaOrdenar {

	Ordenar ordenar = new Ordenar();

	// TESTES DE PARTI��O
	// caso 1: Um teste vai ter todos os numeros iguais

	@Test
	public void testParticaoCaso1() {
		int[] arrayEntrada = { 2, 2, 2, 2, 2, 2 };
		int[] arrayControle = { 2, 2, 2, 2, 2, 2 };
		assertArrayEquals(arrayControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.SelectionSort(arrayEntrada));
	}

	// caso 2: Testar 10 entradas em ordem decrescente

	@Test
	public void testParticaoCaso2() {
		int[] arrayEntrada = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arrayControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.SelectionSort(arrayEntrada));
	}

	// caso 3: Testar 10 entradas em ordem crescente

	@Test
	public void testParticaoCaso3() {
		int[] arrayEntrada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.SelectionSort(arrayEntrada));
	}

	// Caso 4: Testar numeros aleat�rios inseridos por min

	@Test
	public void testParticaoCaso4() {
		int[] arrayEntrada = { 2, 8, 7, 1, 3, 5, 6 };
		int[] arrayControle = { 1, 2, 3, 5, 6, 7, 8 };
		assertArrayEquals(arrayControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.SelectionSort(arrayEntrada));
	}

	// Caso 5: Testar entrada {5,4,3,2,1,10,9,8,7,6}

	@Test
	public void testParticaoCaso5() {
		int[] arrayEntrada = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int[] arrayControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayControle, ordenar.SelectionSort(arrayEntrada));
	}

	// TESTES DE ORDENA��O
	// Caso 1: Um teste vai ter todos os numeros iguais

	@Test
	public void testOrdenaCaso1() {
		int[] arrayEntrada = { 2, 2, 2, 2, 2, 2 };
		int[] arrayEntradaControle = { 2, 2, 2, 2, 2, 2 };
		assertArrayEquals(arrayEntradaControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.SelectionSort(arrayEntrada));
	}

	// Caso 2: Testar 10 entradas em ordem decrescente

	@Test
	public void testOrdenaCaso2() {
		int[] arrayEntrada = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayEntradaControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.SelectionSort(arrayEntrada));
	}

	// Caso 3: Testar 10 entradas em ordem crescente

	@Test
	public void testOrdenaCaso3() {
		int[] arrayEntrada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayEntradaControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.SelectionSort(arrayEntrada));
	}

	// Caso 4: Testar numeros aleat�rios inseridos por min. Ex:[2,8,7,1,3,5,6]

	@Test
	public void testOrdenaCaso4() {
		int[] arrayEntrada = { 2, 8, 7, 1, 3, 5, 6 };
		int[] arrayEntradaControle = { 1, 2, 3, 5, 6, 7, 8 };
		assertArrayEquals(arrayEntradaControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.SelectionSort(arrayEntrada));
	}

	// Caso 5: Testar entrada {5,4,3,2,1,10,9,8,7,6}

	@Test
	public void testOrdenaCaso5() {
		int[] arrayEntrada = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayEntradaControle, ordenar.bubbleSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.insertionSort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, ordenar.SelectionSort(arrayEntrada));
	}

}
