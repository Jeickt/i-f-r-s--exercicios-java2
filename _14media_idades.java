public class _14media_idades {
	public static void main(String[] args) {
		int idad = 0, q = 0, soma = 0;
		float media;
		System.out.print("Informe uma idade: ");
		idad = Integer.parseInt(System.console().readLine());
		while (idad > 0) {
			soma = soma + idad;
			q = q + 1;
			System.out.printf("Informe mais uma idade: ");
			idad = Integer.parseInt(System.console().readLine());
		}
		media  = soma / q;
		System.out.printf("A média das %d idades é: %.2f.\n", q, media);
		}
		}