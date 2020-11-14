public class _13quadrados {
	public static void main(String[] args) {
		int num = 0;
		System.out.print("Informe um número positivo: ");
		num = Integer.parseInt(System.console().readLine());
		while (num >= 0) {
			System.out.printf("O quadrado de %d é: %d.\n", num, (num * num));
			System.out.printf("Informe mais um número: ");
			num = Integer.parseInt(System.console().readLine());
		System.out.printf("O número %d não é positivo.\n", num);
		}
		}
	}