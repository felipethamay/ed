package quickeMerge;

public class Merge {

	public int[] intercala(int[] arrayEntrada, int inicio, int q, int tamanho) {
		int n1, n2;
		n1 = q - inicio + 1;
		n2 = tamanho - q;
		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];

		for (int i = 0; i < n1; i++)
			L[i] = arrayEntrada[inicio + i];
		for (int j = 0; j < n2; j++)
			R[j] = arrayEntrada[q + j + 1];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;

		for (int k = inicio; k <= tamanho; k++)
			if (L[i] <= R[j]) {
				arrayEntrada[k] = L[i];
				i++;
			} else {
				arrayEntrada[k] = R[j];
				j++;
			}
		return arrayEntrada;
	}

	public int[] ordena(int[] arrayEntrada, int inicio, int tamanho) {
		int q = 0;
		if (inicio < tamanho) {

			q = (inicio + tamanho) / 2;
			ordena(arrayEntrada, inicio, q);
			ordena(arrayEntrada, q + 1, tamanho);
			intercala(arrayEntrada, inicio, q, tamanho);
		}

		return arrayEntrada;
	}

	public static void main(String[] args) {
		Merge mg = new Merge();
		int[] array = { 4, 8, 6, 5 };
		mg.ordena(array, 0, 3);
		for (int h : array)
			System.out.print(h + " ");

	}
}