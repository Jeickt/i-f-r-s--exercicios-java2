public class _13quadrados {
	public static void main(String[] args) {
		int num = 0;
		System.out.print("Informe um n�mero positivo: ");
		num = Integer.parseInt(System.console().readLine());
		while (num >= 0) {
			System.out.printf("O quadrado de %d �: %d.\n", num, (num * num));
			System.out.printf("Informe mais um n�mero: ");
			num = Integer.parseInt(System.console().readLine());
		System.out.printf("O n�mero %d n�o � positivo.\n", num);
		}
		}
	}