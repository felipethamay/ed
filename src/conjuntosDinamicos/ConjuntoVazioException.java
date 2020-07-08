package conjuntosDinamicos;

public class ConjuntoVazioException extends Exception {

	private static final long serialVersionUID = -6911470652853056825L;

	public ConjuntoVazioException() {
		super("O conjunto é vazio");
	}
}
