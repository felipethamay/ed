package listasEncadeadas;

public class SucessorInexistenteException extends Exception {

	private static final long serialVersionUID = -4475007261574231027L;

	public SucessorInexistenteException() {
		super("O sucessor não existe");
	}
}
