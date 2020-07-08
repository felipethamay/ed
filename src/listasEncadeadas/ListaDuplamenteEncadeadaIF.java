package listasEncadeadas;

public interface ListaDuplamenteEncadeadaIF<E> {

	public void inserir(E i);

	public Registro<E> remover(E i);

	public Registro<E> buscar(E i);

	public Registro<E> sucessor(E i);

	public Registro<E> predecessor(E i);

	public String imprimeEmOrdem();

	public String imprimeInverso();

	/**
	 * Este método deve comparar dois registros através apenas do seu valor
	 * 
	 * @param i um registro
	 * @return true se os valores forem iguais e false se os valores forem
	 *         diferentes
	 */
	public boolean equals(Object i);

}