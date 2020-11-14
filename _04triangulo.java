public class _04triangulo {
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		System.out.print("Informe o valor do primeiro número inteiro: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do segundo número inteiro: ");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do terceiro número inteiro: ");
		n3 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do quarto número inteiro: ");
		n4 = Integer.parseInt(System.console().readLine());
		
		if ((n1 % 2 == 0) && (n1 % 3 == 0)) {
			System.out.print(n1);
		}
		if ((n2 % 2 == 0) && (n2 % 3 == 0)) {
			System.out.print(n1);
		}
		if ((n3 % 2 == 0) && (n3 % 3 == 0)) {
			System.out.print(n1);
		}
		if ((n4 % 2 == 0) && (n4 % 3 == 0)) {
			System.out.print(n1);
		}
	}
}