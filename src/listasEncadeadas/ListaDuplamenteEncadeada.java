package listasEncadeadas;

public class ListaDuplamenteEncadeada<E> implements ListaDuplamenteEncadeadaIF<E> {

	private Registro<E> cauda;
	private Registro<E> cabeca;

	public ListaDuplamenteEncadeada() {
		cabeca = new Registro<E>(null, null, null);
		cauda = new Registro<E>(null, null, null);
		cabeca.setProximo(cauda);
		cauda.setAnterior(cabeca);
	}

	public Registro<E> buscar(E x) {
		Registro<E> posterior = cabeca.getProximo();
		Integer posicao = 1;
		while (posterior.getValor() != null) {
			if (posterior.getValor().equals(x)) {
				posicao += 1;
				return posterior;
			} else {
				posterior = posterior.getProximo();
			}
		}
		return null;
	}

	public void inserir(E i) {
		Registro<E> novo_reg = new Registro<E>(i, cauda.getAnterior(), cauda);
		while (novo_reg.getValor() != null) {
			cauda.getAnterior().setProximo(novo_reg);
			cauda.setAnterior(novo_reg);
			novo_reg = novo_reg.getProximo();
		}
	}

	@Override
	public Registro<E> remover(E i) {
		Registro<E> posterior = cabeca.getProximo();

		while (posterior.getValor() != null) {
			if (posterior.getValor().equals(i)) {
				posterior.getAnterior().setProximo(posterior.getProximo());
				posterior.getProximo().setAnterior(posterior.getAnterior());
				posterior.setProximo(null);
				posterior.setAnterior(null);
				return posterior;
			}
			posterior = posterior.getProximo();
		}
		return posterior;
	}

	@Override
	public Registro<E> sucessor(E i) {
		Registro<E> temp = buscar(i);
		return temp.getProximo();
	}

	@Override
	public Registro<E> predecessor(E i) {
		Registro<E> temp = buscar(i);
		return temp.getAnterior();
	}

	@Override
	public String imprimeEmOrdem() {
		String to_return = "";
		Registro<E> temp = cabeca.getProximo();
		while (temp.getValor() != null) {
			to_return += temp.toString() + ", ";
			temp = temp.getProximo();
		}

		return (to_return.isEmpty() ? "" : to_return.substring(0, to_return.length() - 2));
	}

	@Override
	public String imprimeInverso() {
		String to_return = "";
		Registro<E> temp = cauda.getAnterior();
		while (temp.getValor() != null) {
			to_return += temp.toString() + ", ";
			temp = temp.getAnterior();
		}
		return (to_return.isEmpty() ? "" : to_return.substring(0, to_return.length() - 2));
	}

}