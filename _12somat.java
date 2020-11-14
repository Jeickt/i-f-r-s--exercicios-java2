public class _12somat {
	public static void main(String[] args) {
		int n = 0, num = 0, somatorio = 0, quadrados = 0;
		float media;
		System.out.print("Informe um número: ");
		num = Integer.parseInt(System.console().readLine());
		while (num >= 0) {
			somatorio = somatorio + num;
			quadrados = quadrados + (num * num);
			n = n + 1;
			System.out.printf("Informe mais um número: ");
			num = Integer.parseInt(System.console().readLine());
		}
		media = somatorio / n;
		System.out.printf("O somatório dos %d números é: %d.\n", n, somatorio);
		System.out.printf("A soma dos quadrados dos %d números é: %d.\n", n, quadrados);
		System.out.printf("A média dos %d números é: %.2f", n, media);
		}
	}