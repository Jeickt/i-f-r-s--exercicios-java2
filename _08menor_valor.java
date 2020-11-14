public class menor_valor08 {
	public static void main(String[] args) {
		int n1, n2, n3;
		System.out.print("Informe o valor do primeiro número inteiro: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do segundo número inteiro: ");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor do terceiro número inteiro: ");
		n3 = Integer.parseInt(System.console().readLine());
		
		if ((n1 <= n2) && (n1 <= n3)) {
			System.out.println(n1);
		}
		if ((n2 < n1) && (n2 <= n3)) {
			System.out.println(n2);
		}
		if ((n3 < n1) && (n3 < n2)) {
			System.out.println(n3);
		}
	}
}