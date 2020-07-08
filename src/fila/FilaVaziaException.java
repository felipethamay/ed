package fila;

public class FilaVaziaException extends Exception {

	private static final long serialVersionUID = 4422542337123642272L;

	public FilaVaziaException() {
		super("Fila Vazia");
	}
}
