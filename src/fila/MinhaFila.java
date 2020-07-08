package fila;

public class MinhaFila implements Fila {

	Integer[] fila1;
	Integer n = 0;

	public MinhaFila() {
		fila1 = new Integer[10];
	}

	public MinhaFila(int i) {
		fila1 = new Integer[i];
	}

	@Override
	public void enqueue(Integer i) throws FilaCheiaException {
		for (int a = 0; a < fila1.length; a++) {
			if (fila1[a] == (Integer) null) {
				fila1[a] = i;
				n++;
				break;
			}
		}
		if (n == 0) {
			throw new FilaCheiaException();
		}
		n = 0;
	}

	@Override
	public Integer front() {
		Integer temp;
		if (fila1[0] != null)
			temp = fila1[0];
		else
			temp = null;
		return temp;
	}

	@Override
	public Integer dequeue() throws FilaVaziaException {
		boolean a = this.isEmpty();
		Integer retorno = 0;
		if (a == false) {
			retorno = fila1[0];
			for (int i = 0; i < fila1.length - 1; i++) {
				fila1[i] = fila1[i + 1];
			}
			fila1[fila1.length - 1] = null;
		} else {
			throw new FilaVaziaException();
		}
		return retorno;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < fila1.length; i++) {
			if (fila1[i] != null) {
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

}