public class _15consumo_medio {
	public static void main(String[] args) {
		int mercadorias, i = 0, j = 0, preco, quantidade, faturamento = 0;
		
		System.out.print("Informe o total de mercadorias comercializadas: ");
		mercadorias = Integer.parseInt(System.console().readLine());
		while (i < mercadorias) {
			System.out.printf("Informe o preco unitario da %dª mercadoria: ", (j + 1));
			preco = Integer.parseInt(System.console().readLine());
			System.out.printf("Informe a quantidade vendida da %dª mercadoria: ", (j + 1));
			quantidade = Integer.parseInt(System.console().readLine());
			faturamento = faturamento + (preco * quantidade);
			i = i + 1;
			j = j + 1;
		}
		System.out.printf("O montante faturado foi de: %d.\n", faturamento);
		}
		}