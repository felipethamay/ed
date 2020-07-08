package pilha;

public class MinhaPilha implements Pilha {

	Integer n = 0;
	Integer[] pilha;

	public MinhaPilha() {
		pilha = new Integer[10];
	}

	public MinhaPilha(int tam) {
		pilha = new Integer[tam];
	}

	@Override
	public void push(Integer num) throws PilhaCheiaException {
		if (!this.pilhaCheia()) {
			for (int i = 0; i < pilha.length; i++) {
				if (pilha[i] == null) {
					pilha[i] = num;
					break;
				}
			}
		} else {
			throw new PilhaCheiaException();
		}
	}

	@Override
	public Integer top() {
		Integer retorno = 0;
		if (this.pilhaCheia()) {
			retorno = pilha[pilha.length - 1];
		} else if (isEmpty()) {
			retorno = null;
		} else {
			for (int i = 0; i < pilha.length; i++) {
				if (pilha[i] == null) {
					retorno = pilha[i - 1];
					break;
				}
			}
		}
		return retorno;
	}

	@Override
	public Integer pop() throws PilhaVaziaException {
		Integer retorno = 0;
		if (this.pilhaCheia()) {
			retorno = pilha[pilha.length - 1];
			pilha[pilha.length - 1] = null;
		} else if (!this.isEmpty()) {
			for (int i = 0; i < pilha.length; i++) {
				if (pilha[i] == null) {
					retorno = pilha[i - 1];
					pilha[i - 1] = null;
					break;
				}
			}
		} else {
			throw new PilhaVaziaException();
		}

		return retorno;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < pilha.length; i++) {
			if (pilha[i] != null) {
				n++;
				break;
			}
		}

		if (n >= 1) {
			n = 0;
			return false;
		} else {
			return true;
		}
	}

	public boolean pilhaCheia() {
		for (int i = 0; i < pilha.length; i++) {
			if (pilha[i] == null) {
				n++;
			}
		}
		if (n == 0) {
			return true;
		} else {
			n = 0;
			return false;
		}
	}
}