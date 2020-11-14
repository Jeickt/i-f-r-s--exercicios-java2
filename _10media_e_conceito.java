public class _10media_e_conceito {
	public static void main(String[] args) {
		float trabalho, avaliacao, exame;
		float media_ponderada;
		System.out.print("Informe a nota do Trabalho de laboratório: ");
		trabalho = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a nota da Avaliação semestral: ");
		avaliacao = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a nota do Exame final: ");
		exame = Float.parseFloat(System.console().readLine());
		
		media_ponderada = ((trabalho * 2) + (avaliacao * 3) + (exame * 5)) / 10;
		
		if ((media_ponderada >= 8) && (media_ponderada <= 10)) {
			System.out.printf("A média ponderada é = %.1f e o conceito é A", media_ponderada);
		}
		if ((media_ponderada >= 7) && (media_ponderada < 8)) {
			System.out.printf("A média ponderada é = %.1f e o conceito é B", media_ponderada);
		}
		if ((media_ponderada >= 6) && (media_ponderada < 7)) {
			System.out.printf("A média ponderada é = %.1f e o conceito é C", media_ponderada);
		}
		if ((media_ponderada >= 5) && (media_ponderada < 6)) {
			System.out.printf("A média ponderada é = %.1f e o conceito é D", media_ponderada);
		}
		if ((media_ponderada >= 0) && (media_ponderada < 5)) {
			System.out.printf("A média ponderada é = %.1f e o conceito é E", media_ponderada);
		}
	}
}