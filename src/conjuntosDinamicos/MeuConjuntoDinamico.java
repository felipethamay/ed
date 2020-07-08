package conjuntosDinamicos;

import listasEncadeadas.PredecessorInexistenteException;
import listasEncadeadas.SucessorInexistenteException;

public class MeuConjuntoDinamico implements ConjuntoDinamico {

	private Integer[] valores = new Integer[999];
	private int posVazia = 0;

	@Override
	public int tamanho() {
		return posVazia;
	}

	@Override
	public void inserir(Integer i) {
		if (posVazia == valores.length - 1) {
			aumentarArray(valores);
		}
		valores[posVazia] = i;
		posVazia++;
	}

	private void aumentarArray(Integer[] valoresAntigos) {
		Integer[] valoresNovos = new Integer[valoresAntigos.length * 2];
		for (int i = 0; i < valoresAntigos.length; i++) {
			valoresNovos[i] = valoresAntigos[i];
		}
		this.valores = valoresNovos;
	}

	@Override
	public Integer remover(Integer i) throws ValorInexistenteException {
		int idx = buscarIndex(i);
		if (idx < 0) {
			throw new ValorInexistenteException();
		}
		Integer toReturn = valores[idx];
		valores[idx] = null;
		posVazia--;
		return toReturn;
	}

	@Override
	public Integer buscar(Integer i) throws ValorInexistenteException {
		for (int j = 0; j < valores.length; j++) {
			if (valores[j] != null && valores[j].equals(i)) {
				return valores[j];
			}
		}
		throw new ValorInexistenteException();
	}

	private int buscarIndex(Integer i) {
		for (int j = 0; j < valores.length; j++) {
			if (valores[j] != null && valores[j].equals(i)) {
				return j;
			}
		}
		return -1;
	}

	@Override
	public Integer minimum() throws ConjuntoVazioException {
		Integer menor = null;
		for (int i = 0; i < posVazia; i++) {
			if (menor == null || (valores[i] != null && valores[i].compareTo(menor) < 0))
				menor = valores[i];
		}

		if (menor == null)
			throw new ConjuntoVazioException();

		return menor;
	}

	@Override
	public Integer maximum() throws ConjuntoVazioException {
		Integer maior = null;
		for (int i = 0; i < posVazia; i++) {
			if (maior == null || (valores[i] != null && valores[i].compareTo(maior) > 0))
				maior = valores[i];
		}
		if (maior == null)
			throw new ConjuntoVazioException();
		return maior;
	}

	@Override
	public Integer sucessor(Integer i) throws SucessorInexistenteException {
		int pos = buscarIndex(i);
		if (pos == valores.length || pos < 0)
			throw new SucessorInexistenteException();
		return valores[pos + 1];
	}

	@Override
	public Integer predecessor(Integer i) throws PredecessorInexistenteException {
		if (posVazia == 0) {
			throw new PredecessorInexistenteException();
		}

		int pos = buscarIndex(i);

		if (pos == 0)
			return null;

		if (pos < 0)
			throw new PredecessorInexistenteException();

		return valores[pos - 1];
	}

}