
public class RomanNumeralConverter {
	public int convert(String entrada) {
		char Rom[] = { ' ', 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int valor[] = { 0, 1, 5, 10, 50, 100, 500, 1000 };
		int ant = 0;
		int suma = 0;
		char letra = ' ';

		for (int i = 0; i < entrada.length(); i++) {
			letra = entrada.charAt(i);
			for (int j = 0; j < Rom.length; j++) {
				if (letra == Rom[j]) {
					suma = suma + valor[j];
					if (ant < valor[j]) {
						suma = suma - ant * 2;
						ant = valor[j];
					} else {
						ant = valor[j];
					}
				}
			}
		}

		if (suma > 1000) {
			throw new IllegalArgumentException();
		}

		if (entrada.contains("IIII")) {
			throw new IllegalArgumentException();
		}

		if (entrada.contains("MMMM")) {
			throw new IllegalArgumentException();
		}

		if (entrada.contains("XXXX")) {
			throw new IllegalArgumentException();
		}

		if (entrada.contains("CCCC")) {
			throw new IllegalArgumentException();
		}
		if (entrada.contains("VV")) {
			throw new IllegalArgumentException();
		}

		if (entrada.contains("LL")) {
			throw new IllegalArgumentException();
		}

		if (entrada.contains("DD")) {
			throw new IllegalArgumentException();
		}

		return suma;

	}

}
