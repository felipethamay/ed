package tabelaHash;

public class TabelaDeAcessoDireto {

	public void Inserir(Object[] array, Pessoa u) {
		array[u.getIdade()] = u;
	}

	public void Deletar(Object[] array, Pessoa p) {
		array[p.getIdade()] = p;
	}

	public Object Procurar(Object[] array, Integer idade) {
		return array[idade];
	}
}
