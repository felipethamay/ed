package tabelaHash;

public class Registro {

	private Object valor;
	private Registro proximo;
	private Registro anterior;

	public Registro(Object valor, Registro proximo, Registro anterior) {
		this.valor = valor;
		this.proximo = proximo;
		this.anterior = anterior;
	}

	public Registro getAnterior() {
		return anterior;
	}

	public void setAnterior(Registro anterior) {
		this.anterior = anterior;
	}

	public void setProximo(Registro proximo) {
		this.proximo = proximo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public Registro getProximo() {
		return proximo;
	}

	public String toString() {
		return (valor + "");
	}
}
