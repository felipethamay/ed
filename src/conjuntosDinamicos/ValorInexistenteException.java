package conjuntosDinamicos;

public class ValorInexistenteException extends Exception {

	private static final long serialVersionUID = 2659857980633746907L;

	public ValorInexistenteException() {
		super("O Valor não existe");
	}
}
