package validadorCPF;

public class TamanhoSuperiorException extends Exception {
	private static final long serialVersionUID = 1L;

	public TamanhoSuperiorException() {
		super("CPF inválido!");
	}
}
