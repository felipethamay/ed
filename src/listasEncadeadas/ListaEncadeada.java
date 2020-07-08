package listasEncadeadas;

public class ListaEncadeada<T> implements ListaDuplamenteEncadeadaIF<T> {

	private Registro<T> cauda;
	private Registro<T> cabeca;

	public ListaEncadeada() {
		cauda = new Registro<T>(null);
		cauda.setProximo(null);
		cabeca = new Registro<T>(null);
		cabeca.setProximo(null);
	}

	@Override
	public void inserir(T i) {
		Registro<T> posterior = cabeca.getProximo();
		while (posterior.getValor() != null) {
			posterior = posterior.getProximo();
		}
	}

	@Override
	public Registro<T> remover(T i) {
		Registro<T> anterior = cabeca;
		Registro<T> posterior = cabeca.getProximo();

		while (posterior.getValor() != i && posterior.getValor() != null) {
			anterior = posterior;
			posterior = posterior.getProximo();
		}

		if (posterior.getValor() != null) {
			anterior.setProximo(posterior.getProximo());
		}
		return null;
	}

	@Override
	public Registro<T> buscar(T i) {
		Registro<T> posterior = cabeca.getProximo();
		Integer posicao = 1;

		while (posterior.getValor() != i && posterior.getValor() != null) {
			posterior = posterior.getProximo();
			posicao += 1;
		}

		return buscar(i);
	}

	@Override
	public Registro<T> sucessor(T i) {
		Registro<T> temp = cabeca.getProximo();
		while (temp != null) {
			if (temp.getValor().equals(i)) {
				return temp.getProximo();
			}
			temp = temp.getProximo();
		}
		return null;
	}

	@Override
	public Registro<T> predecessor(T i) {
		Registro<T> temp = cabeca.getProximo();
		Registro<T> anterior = cabeca;
		while (temp != null) {
			if (temp.getValor().equals(i)) {
				return anterior;
			}
			anterior = temp;
			temp = temp.getProximo();
		}
		return null;
	}

	@Override
	public String imprimeEmOrdem() {
		String to_return = "";

		Registro<T> temp = cabeca.getProximo();
		while (temp != null) {
			to_return += temp.toString() + ", ";
			temp = temp.getProximo();
		}

		return to_return.substring(0, to_return.length() - 2);
	}

	@Override
	public String imprimeInverso() {
		String to_return = "";

		Registro<T> temp = cabeca.getProximo();
		while (temp != null) {
			to_return += temp.toString() + ", ";
			temp = temp.getProximo();
		}

		return to_return.substring(0, to_return.length() - 2);
	}

	@Override
	public boolean equals(Object i) {
		// TODO Auto-generated method stub
		return false;
	}

	public Registro<T> getCauda() {
		return cauda;
	}

	public void setCauda(Registro<T> cauda) {
		this.cauda = cauda;
	}

}