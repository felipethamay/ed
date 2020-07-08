package tabelaHash;

public class TabelaAcessoDireto {

	public void DirectAddressInsert(Object[] array, Pessoa p) {
		array[p.getIdade()] = p;
	}

	public void DirectAddressDelete(Object[] array, Pessoa p) {
		array[p.getIdade()] = null;
	}

	public Object DirectAddressSearch(Object[] array, int idade) {
		return array[idade];
	}

}
