public class _23operacoes {
	public static void main(String[] args) {
		int numero1, numero2, operacao; 
		double res, res1, res2;
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o segundo n�mero: ");
		numero2 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite 1 para potencia��o, 2 para raiz quadrada e 3 para raiz c�bica: ");
		operacao = Integer.parseInt(System.console().readLine());
		
		if (operacao == 1) {
			res = (double)Math.pow(numero1, numero2);
			System.out.printf("O resultado �: %.2f", res);
		}
		if ( operacao == 2 || operacao == 3) {
			if (numero1 < 0 || numero2 < 0) {
				System.out.printf("N�meros inv�lidos para a opera��o");
			} else {
				if (operacao == 2) {
					res1 = (double)Math.sqrt(numero1);
					res2 = (double)Math.sqrt(numero2);
					System.out.printf("As ra�zes quadradas s�o: %.2f e %.2f", res1, res2);
				}
				if (operacao == 3) {
					res1 = (double)Math.cbrt(numero1);
					res2 = (double)Math.cbrt(numero2);
					System.out.printf("As ra�zes c�bicas s�o: %.2f e %.2f", res1, res2);
				}			
		}
		}
	}
}