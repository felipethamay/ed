package ordenacaoLinear;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestaOrdenacaoLinear {

	CountingSort counting = new CountingSort();
	BucketSort bucket = new BucketSort();
	RadixSort radix = new RadixSort();

	// TESTES DE PARTIÇÃO
	// caso 1: Um teste vai ter todos os numeros iguais

	@Test
	public void testParticaoCaso1() {
		Integer[] arrayEntrada = { 2, 2, 2, 2, 2, 2 };
		Integer[] arrayControle = { 2, 2, 2, 2, 2, 2 };
		assertArrayEquals(arrayControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayControle, radix.sort(arrayEntrada));
	}

	// caso 2: Testar 10 entradas em ordem decrescente

	@Test
	public void testParticaoCaso2() {
		Integer[] arrayEntrada = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Integer[] arrayControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayControle, radix.sort(arrayEntrada));
	}

	// caso 3: Testar 10 entradas em ordem crescente

	@Test
	public void testParticaoCaso3() {
		Integer[] arrayEntrada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] arrayControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayControle, radix.sort(arrayEntrada));
	}

	// Caso 4: Testar numeros aleatórios inseridos por min

	@Test
	public void testParticaoCaso4() {
		Integer[] arrayEntrada = { 2, 8, 7, 1, 3, 5, 6 };
		Integer[] arrayControle = { 1, 2, 3, 5, 6, 7, 8 };
		assertArrayEquals(arrayControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayControle, radix.sort(arrayEntrada));
	}

	// Caso 5: Testar entrada {5,4,3,2,1,10,9,8,7,6}

	@Test
	public void testParticaoCaso5() {
		Integer[] arrayEntrada = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		Integer[] arrayControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayControle, radix.sort(arrayEntrada));
	}

	// TESTES DE ORDENAÇÃO
	// Caso 1: Um teste vai ter todos os numeros iguais

	@Test
	public void testOrdenaCaso1() {
		Integer[] arrayEntrada = { 2, 2, 2, 2, 2, 2 };
		Integer[] arrayEntradaControle = { 2, 2, 2, 2, 2, 2 };
		assertArrayEquals(arrayEntradaControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, radix.sort(arrayEntrada));
	}

	// Caso 2: Testar 10 entradas em ordem decrescente

	@Test
	public void testOrdenaCaso2() {
		Integer[] arrayEntrada = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Integer[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayEntradaControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, radix.sort(arrayEntrada));
	}

	// Caso 3: Testar 10 entradas em ordem crescente

	@Test
	public void testOrdenaCaso3() {
		Integer[] arrayEntrada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayEntradaControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, radix.sort(arrayEntrada));
	}

	// Caso 4: Testar numeros aleatórios inseridos por min. Ex:[2,8,7,1,3,5,6]

	@Test
	public void testOrdenaCaso4() {
		Integer[] arrayEntrada = { 2, 8, 7, 1, 3, 5, 6 };
		Integer[] arrayEntradaControle = { 1, 2, 3, 5, 6, 7, 8 };
		assertArrayEquals(arrayEntradaControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, radix.sort(arrayEntrada));
	}

	// Caso 5: Testar entrada {5,4,3,2,1,10,9,8,7,6}

	@Test
	public void testOrdenaCaso5() {
		Integer[] arrayEntrada = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		Integer[] arrayEntradaControle = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertArrayEquals(arrayEntradaControle, counting.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, bucket.sort(arrayEntrada));
		assertArrayEquals(arrayEntradaControle, radix.sort(arrayEntrada));
	}

}
