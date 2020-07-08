package pilha;

public class PilhaVaziaException extends Exception {

	private static final long serialVersionUID = -8190333625950568941L;

	public PilhaVaziaException() {
		super("Pilha Vazia");
	}
}
