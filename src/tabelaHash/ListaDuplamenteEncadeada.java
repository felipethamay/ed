package tabelaHash;

public class ListaDuplamenteEncadeada {

	private Registro cauda;
	private Registro cabeca;

	public ListaDuplamenteEncadeada() {
		this.cauda = new Registro(null, null, cabeca);
		this.cabeca = new Registro(null, cauda, null);
	}

	public void inserir(Object o) {
		Registro anterior = cabeca;
		Registro posterior = cabeca.getProximo();
		Registro novo = new Registro(o, null, anterior);

		novo.setAnterior(anterior);
		novo.setProximo(posterior);
		posterior.setAnterior(novo);
		anterior.setProximo(novo);
	}

	public void remover(Object o) {
		Registro anterior = cabeca;
		Registro posterior = cabeca.getProximo();

		while (posterior.getValor() != o && posterior.getValor() != null) {
			anterior = posterior;
			posterior = posterior.getProximo();
		}

		if (posterior.getValor() != null) {
			anterior.setProximo(posterior.getProximo());
			posterior.getProximo().setAnterior(anterior);
			posterior.setProximo(null);
			posterior.setAnterior(null);
		} else {
			System.out.println("Registro nao pertence a lista !!");
		}
	}

	public boolean existe(Object o) {
		Registro posterior = cabeca.getProximo();

		while (posterior.getValor() != o && posterior.getValor() != null) {
			posterior = posterior.getProximo();
		}
		if (posterior.getValor() != null) {
			return true;
		} else {
			return false;
		}
	}

	public Integer pesquisar(Object o) {
		Registro posterior = cabeca.getProximo();
		Integer posicao = 1;

		while (posterior.getValor() != o && posterior.getValor() != null) {
			posterior = posterior.getProximo();
			posicao += 1;
		}

		return posicao;
	}

	public String toString() {
		String valor = "";
		Registro atual = cabeca.getProximo();

		while (verificaSeEhcauda(atual) && verificaSeEhcauda(atual.getProximo())) {
			valor += atual.toString() + ",";
			atual = atual.getProximo();
		}
		if (atual.getValor() != null) {
			valor += atual.toString();
		}

		return valor;
	}

	private boolean verificaSeEhcauda(Registro atual) {
		return atual.getValor() != null && atual.getProximo() != null;
	}

}
