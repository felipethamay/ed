package validadorCPF;

public class Validador {

	public boolean validarCpf(String temp) throws TamanhoSuperiorException {
		if (!(temp.length() == 11)) {
			throw new TamanhoSuperiorException();
		}
		String cpf[] = new String[11];

		int resultado1 = 0;
		int resultado2 = 0;
		int mult1 = 10;
		int mult2 = 11;
		int digitoVerificador1 = 0;
		int digitoVerificador2 = 0;
		cpf = temp.split("\\B");

		for (int i = 0; i < 9; i++) {
			resultado1 += Integer.parseInt(cpf[i]) * mult1;
			mult1 -= 1;
		}

		if (resultado1 % 11 == 0 || resultado1 % 11 == 1) {
			digitoVerificador1 = 0;
		} else {
			digitoVerificador1 = 11 - (resultado1 % 11);
		}

		for (int i = 0; i < 10; i++) {
			resultado2 += Integer.parseInt(cpf[i]) * mult2;
			mult2 -= 1;
		}

		if (resultado2 % 11 == 0 || resultado2 % 11 == 1) {
			digitoVerificador2 = 0;
		} else {
			digitoVerificador2 = 11 - (resultado2 % 11);
		}

		if (digitoVerificador1 == Integer.parseInt(cpf[9]) && digitoVerificador2 == Integer.parseInt(cpf[10])) {
			return true;
		}
		return false;
	}
}