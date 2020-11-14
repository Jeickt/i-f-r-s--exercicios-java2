public class _18binario {
	public static void main(String[] args) {
		int numero, numero_copia, resto;
		String binario;
		numero = 0;
		System.out.printf("O binário de %d é: %s\n", numero, "0");
		numero += 1;
		binario = "";
		while (numero <= 100) {
			numero_copia = numero;
			while (numero_copia > 0) {
				resto = numero_copia % 2;
				binario = resto + binario;
				numero_copia /= 2;
				}
			System.out.printf("O binário de %d é: %s\n", numero, binario);
			numero += 1;
			binario = "";
		}
		}
	}