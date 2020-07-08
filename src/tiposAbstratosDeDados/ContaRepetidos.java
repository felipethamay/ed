package tiposAbstratosDeDados;

public class ContaRepetidos {

	public int contaRepetidos(int[] vetor) {

		int rep = 0;
		int finalvalue = 0;

		for (int a = 0; a < vetor.length; a++) {
			rep = 0;
			for (int b = a + 1; b < vetor.length; b++) {

				if (vetor[a] == vetor[b])
					rep = +1;
			}
			if (rep >= 1) {
				finalvalue += 1;
			}
		}
		return finalvalue;
	}

}