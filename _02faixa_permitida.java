public class _02faixa_permitida {
	public static void main(String[] args) {
		int n1;
		System.out.print("Informe um número inteiro: ");
		n1 = Integer.parseInt(System.console().readLine());
				
		if ((n1 > 0) && (n1 < 10)) {
			System.out.printf("O valor está na faixa permitida");
		}
		else {
			System.out.printf("O valor está fora da faixa permitida");
		}
	}
}