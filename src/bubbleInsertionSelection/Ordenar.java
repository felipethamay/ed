package bubbleInsertionSelection;

public class Ordenar {

	public int[] bubbleSort(int[] arrayEntrada) {

		boolean a = true;

		while (a) {
			a = false;

			for (int i = 0; i < arrayEntrada.length - 1; i++) {
				if (arrayEntrada[i] > arrayEntrada[i + 1]) {
					int temp = arrayEntrada[i];
					arrayEntrada[i] = arrayEntrada[i + 1];
					arrayEntrada[i + 1] = temp;
					a = true;
				}
			}

		}
		return arrayEntrada;

	}

	public int[] insertionSort(int[] arrayEntrada) {
		for (int i = 1; i < arrayEntrada.length; i++) {
			int a = arrayEntrada[i];
			int j;

			for (j = i - 1; j >= 0 && arrayEntrada[j] > a; j--) {
				arrayEntrada[j + 1] = arrayEntrada[j];
				arrayEntrada[j] = a;
			}
		}
		return arrayEntrada;

	}

	public int[] SelectionSort(int[] arrayEntrada) {
		int index_min, aux;

		for (int i = 0; i < arrayEntrada.length; i++) {
			index_min = i;

			for (int j = i + 1; j < arrayEntrada.length; j++) {
				if (arrayEntrada[j] < arrayEntrada[index_min]) {
					index_min = j;
				}
			}

			if (index_min != i) {
				aux = arrayEntrada[index_min];
				arrayEntrada[index_min] = arrayEntrada[i];
				arrayEntrada[i] = aux;
			}
		}
		return arrayEntrada;

	}

	public boolean compara(int[] array1, int[] array2) {
		boolean temp = true;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				temp = false;
			}
		}
		return temp;
	}
}
