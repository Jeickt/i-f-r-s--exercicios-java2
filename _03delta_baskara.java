public class _03delta_baskara {
	public static void main(String[] args) {
		int a, b, c;
		int delta, o;
		System.out.print("Informe o valor de a: ");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de b: ");
		b = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de c: ");
		c = Integer.parseInt(System.console().readLine());
		
		delta = (b * b) - (4 * a * c);
		
		if (delta > 0) {
			System.out.printf("A equa��o possui duas ra�zes reais");
		}
		else {
			if (delta < 0) {
				System.out.printf("A equa��o n�o possui ra�zes reais");
		}
			else {
				System.out.printf("A equa��o possui uma �nica raiz real");
		}
	}
	}
}