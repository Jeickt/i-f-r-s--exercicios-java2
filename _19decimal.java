public class _19decimal {
	public static void main(String[] args) {
		int decimal, contador, binario, guardabinario;
		
		System.out.print("Digite um n�mero bin�rio: ");
		binario = Integer.parseInt(System.console().readLine());
		guardabinario = binario;
		decimal = 0;
		contador = 0;
		while (binario > 0) {
			decimal += binario % 10 * Math.pow(2, contador);
			binario /= 10;
			contador += 1;
			}
		System.out.printf("A convers�o do bin�rio %d para decimal corresponde a: %d.", guardabinario, decimal);
		}
		}