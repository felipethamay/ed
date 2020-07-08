package tiposAbstratosDeDados;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestaAlgContaRepetidos {

	@Test
	public void testaContaRepetidosVazio() {
		ContaRepetidos cr = new ContaRepetidos();
		int[] vetor = {};
		assertEquals(0, cr.contaRepetidos(vetor));
	}

	@Test
	public void testaContaRepetidos() {
		ContaRepetidos cr = new ContaRepetidos();
		int[] vetor = { 1, 2, 3, 4, 3, 7, 5, 6, 4, 1 };
		assertEquals(3, cr.contaRepetidos(vetor));
	}

	@Test
	public void testaContaRepetidosTodos() {
		ContaRepetidos cr = new ContaRepetidos();
		int[] vetor = { 1, 1, 1, 1, 1 };
		assertEquals(4, cr.contaRepetidos(vetor));
	}

	@Test
	public void testaContaRepetidosOrdenados() {
		ContaRepetidos cr = new ContaRepetidos();
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertEquals(0, cr.contaRepetidos(vetor));
	}

	@Test
	public void testaContaRepetidosDesordenados() {
		ContaRepetidos cr = new ContaRepetidos();
		int[] vetor = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		assertEquals(0, cr.contaRepetidos(vetor));
	}
}