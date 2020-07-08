package ordenacaoLinear;

import java.util.LinkedList;

public class BucketSort {

	@SuppressWarnings("unchecked")
	public Integer[] sort(Integer[] arrayEntrada) {

		Integer maiorValor = 0;
		Integer numBaldes = maiorValor / 5;

		@SuppressWarnings("rawtypes")
		LinkedList[] B = new LinkedList[numBaldes];// cria um vetor Linked List

		for (int i = 0; i < numBaldes; i++) {
			B[i] = new LinkedList<Integer>();
		}

		// Coloca os valores no balde respectivo:
		for (int i = 0; i < arrayEntrada.length; i++) {
			Integer j = numBaldes - 1;
			while (true) {
				if (j < 0) {
					break;
				}
				if (arrayEntrada[i] >= (j * 5)) {
					B[j].add(arrayEntrada[i]);
					break;
				}
				j--;
			}
		}

		// Ordena e atualiza o vetor:
		Integer indice = 0;
		for (int i = 0; i < numBaldes; i++) {

			Integer[] aux = new Integer[B[i].size()];

			// Coloca cada balde num vetor:
			for (int j = 0; j < aux.length; j++) {
				aux[j] = (Integer) B[i].get(j);
			}

			insertionSort(aux); // algoritmo escolhido para ordenação.

			// Devolve os valores ao vetor de entrada:
			for (int j = 0; j < aux.length; j++, indice++) {
				arrayEntrada[indice] = aux[j];
			}

		}
		return arrayEntrada;
	}

	// InsertionSort para ordenar
	public Integer[] insertionSort(Integer[] arrayEntrada) {
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
}