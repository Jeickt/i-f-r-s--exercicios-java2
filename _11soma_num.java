public class _11soma_num {
	public static void main(String[] args) {
		int i = 0, soma = 0;
		while (i < 10) {
			System.out.printf("Informe o %d� n�mero: ", (i + 1));
			soma = soma + Integer.parseInt(System.console().readLine());
			i = i + 1;
		System.out.printf("A soma dos 10 n�meros �: %d", soma);
		}
	}
}