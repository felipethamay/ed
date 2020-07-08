package ordenacaoLinear;

public class RadixSort {

	public Integer[] sort(Integer[] arrayEntrada) {

		int a = 0;
		int n = 0;
		int arrayAux[][] = new int[10][arrayEntrada.length];

		int c = 0;
		int rad = 0;
		for (int i = 0; i < arrayEntrada.length; i++) {
			for (int k = 0; k < rad; k++)
				arrayAux[i][c] = 0;
		}

		for (int k = 0; k < arrayEntrada.length; k++) {
			int d = (int) ((arrayEntrada[k] / Math.pow(10, 0)) % 10);
			arrayAux[k][d] = arrayEntrada[k];
		}

		for (int j = 0; j < a; j++) {
			for (int k = 0; k < arrayEntrada.length; k++)
				if (arrayAux[k][j] != 0)
					arrayEntrada[n++] = arrayAux[k][j];
		}

		return arrayEntrada;

	}
}