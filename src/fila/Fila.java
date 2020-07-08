package fila;

public interface Fila {

	public void enqueue(Integer i) throws FilaCheiaException;

	public Integer front();

	public Integer dequeue() throws FilaVaziaException;

	public boolean isEmpty();

}
