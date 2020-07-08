package ordenacaoLinear;

public class CountingSort {

	public Integer[] sort(Integer[] arrayEntrada) {

		Integer maior = getIndiceDoMaiorValor(arrayEntrada);// Chama o metodo Indice de maior valor
		Integer[] aux = new Integer[arrayEntrada[maior] + 1];// Cria um vetor auxiliar com tamanho do maior elemento do
																// vetor +1
		Integer[] resposta = new Integer[arrayEntrada.length];// Cria um vetor resposta do mesmo tamanho do vetor

		for (int i = 0; i < aux.length; i++) {
			aux[i] = 0;
		}

		for (int i = 0; i < arrayEntrada.length; i++) {
			aux[arrayEntrada[i]] += 1;
		}

		for (int i = 1; i < aux.length; i++) {
			aux[i] += aux[i - 1];
		}

		for (int i = 0; i < arrayEntrada.length; i++) {
			resposta[aux[arrayEntrada[i]] - 1] = arrayEntrada[i];
			aux[arrayEntrada[i]]--;
		}

		for (int i = 0; i < arrayEntrada.length; i++) {
			arrayEntrada[i] = resposta[i];
		}

		return arrayEntrada;
	}

	public int getIndiceDoMaiorValor(Integer[] v) {
		int m = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > v[m]) {
				m = i;
			}
		}

		return m;

	}// Metodo para achar o indice de maior valor
}