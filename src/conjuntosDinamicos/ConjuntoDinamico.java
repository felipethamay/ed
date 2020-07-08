package conjuntosDinamicos;

import listasEncadeadas.PredecessorInexistenteException;
import listasEncadeadas.SucessorInexistenteException;

public interface ConjuntoDinamico {

	public int tamanho();

	public void inserir(Integer i);

	public Integer remover(Integer i) throws ValorInexistenteException;

	public Integer buscar(Integer i) throws ValorInexistenteException;

	public Integer minimum() throws ConjuntoVazioException;

	public Integer maximum() throws ConjuntoVazioException;

	public Integer sucessor(Integer i) throws SucessorInexistenteException;

	public Integer predecessor(Integer i) throws PredecessorInexistenteException;

}
