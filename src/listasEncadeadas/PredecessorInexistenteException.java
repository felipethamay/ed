package listasEncadeadas;

public class PredecessorInexistenteException extends Exception {

	private static final long serialVersionUID = -1510987707557421047L;

	public PredecessorInexistenteException() {
		super("O prodecessor não existe");
	}
}
