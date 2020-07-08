package quickeMerge;

public class Quick {

	public int particao(int[] arrayEntrada, int i, int j) {
		int indice = i - 1;
		int aux = arrayEntrada[j];
		for (int a = i; a <= j; a++) {
			if (arrayEntrada[a] <= aux) {
				troca(arrayEntrada, a, ++indice);
			}
		}
		return indice;
	}

	public void troca(int arrayEntrada[], int i, int j) {
		int aux = arrayEntrada[i];
		arrayEntrada[i] = arrayEntrada[j];
		arrayEntrada[j] = aux;
	}

	public int[] ordena(int arrayEntrada[], int i, int j) {
		if (i < j) {
			int x = particao(arrayEntrada, i, j);
			ordena(arrayEntrada, i, x - 1);
			ordena(arrayEntrada, x + 1, j);
		}
		return arrayEntrada;
	}

}
