public class _12somat {
	public static void main(String[] args) {
		int n = 0, num = 0, somatorio = 0, quadrados = 0;
		float media;
		System.out.print("Informe um n�mero: ");
		num = Integer.parseInt(System.console().readLine());
		while (num >= 0) {
			somatorio = somatorio + num;
			quadrados = quadrados + (num * num);
			n = n + 1;
			System.out.printf("Informe mais um n�mero: ");
			num = Integer.parseInt(System.console().readLine());
		}
		media = somatorio / n;
		System.out.printf("O somat�rio dos %d n�meros �: %d.\n", n, somatorio);
		System.out.printf("A soma dos quadrados dos %d n�meros �: %d.\n", n, quadrados);
		System.out.printf("A m�dia dos %d n�meros �: %.2f", n, media);
		}
	}