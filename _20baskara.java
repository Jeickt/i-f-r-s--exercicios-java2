public class _20baskara {
	public static void main(String[] args) {
		double A, B, C, delta, resultado, resultado1, resultado2;
		
		System.out.print("Digite o valor de A: ");
		A = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o valor de B: ");
		B = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o valor de C: ");
		C = Double.parseDouble(System.console().readLine());
		delta = Math.pow(B, 2) - (4 * A * C);
		
		if (delta >= 0) {
			if (delta > 0) {
				resultado1 = (-B + Math.sqrt(delta))/(2 * A);
				resultado2 = (-B - Math.sqrt(delta))/(2 * A);
				if (resultado1 < resultado2) {
					System.out.printf("As raízes da equação são %.05f e %.05f.", resultado1, resultado2);
			}	else {
					System.out.printf("As raízes da equação são %.05f e %.05f.", resultado2, resultado1);
				}
			}	else {
				resultado = (-B)/(2 * A);
				System.out.printf("A raíz desta equação é %.05f.", resultado);
			}
		}	else {
			System.out.printf("Esta equação não possui raízes reais");
		}
		}
}