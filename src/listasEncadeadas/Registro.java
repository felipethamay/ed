package listasEncadeadas;

public class Registro<E> {

	private E valor;
	private Registro<E> proximo;
	private Registro<E> anterior;

	public Registro(E i) {
		this.valor = i;

	}

	public Registro(E i, Registro<E> anterior, Registro<E> proximo) {
		this.valor = i;
		this.setAnterior(anterior);
		this.setProximo(proximo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Registro))
			return false;
		return this.getValor().equals(((Registro<E>) obj).getValor());
	}

	public E getValor() {
		return valor;
	}

	public void setValor(E valor) {
		this.valor = valor;
	}

	public Registro<E> getProximo() {
		return proximo;
	}

	public void setProximo(Registro<E> proximo) {
		this.proximo = proximo;
	}

	public void setAnterior(Registro<E> anterior) {
		this.anterior = anterior;
	}

	public Registro<E> getAnterior() {
		return anterior;
	}

	@Override
	public String toString() {
		return this.getValor().toString();
	}

}