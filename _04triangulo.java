public class _04triangulo {
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		System.out.print("Informe o valor do primeiro n�mero inteiro: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do segundo n�mero inteiro: ");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do terceiro n�mero inteiro: ");
		n3 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do quarto n�mero inteiro: ");
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