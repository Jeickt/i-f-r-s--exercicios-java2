public class _01diferenca {
	public static void main(String[] args) {
		int n1, n2;
		int result1, result2;
		System.out.print("Informe o primeiro n�mero inteiro: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o segundo n�mero inteiro: ");
		n2 = Integer.parseInt(System.console().readLine());
		result1 = n1 - n2;
		result2 = n2 - n1;
		
		if (n1 >= n2) {
			System.out.printf("A diferen�a entre os n�mero � = %d\n", result1);
		}
		if (n2 > n1) {
			System.out.printf("A diferen�a entre os n�mero � = %d\n", result2);
		}
	}
}