package pilha;

public interface Pilha {

	public void push(Integer i) throws PilhaCheiaException;

	public Integer top();

	public Integer pop() throws PilhaVaziaException;

	public boolean isEmpty();

}
