package tabelaHash;

public class TabelaHash {

	ListaDuplamenteEncadeada[] lista = new ListaDuplamenteEncadeada[10];

	public TabelaHash() {
		for (int i = 0; i < 10; i++) {
			lista[i] = new ListaDuplamenteEncadeada();
		}
	}

	public Integer funcaoHash(Integer rg) {
		String aux = rg.toString();
		int k = Integer.parseInt(aux.substring(aux.length() - 1), (aux.length()));
		k = k / 10;
		return k;
	}

	public void Inserir(Pessoa p) {
		lista[funcaoHash(p.getRg())].inserir(p);
	}

	public void Deletar(Pessoa p) {
		lista[funcaoHash(p.getRg())].remover(p);
	}

	public Object Procurar(Pessoa p) {
		return lista[funcaoHash(p.getRg())];
	}

}
