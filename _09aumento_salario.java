public class _09aumento_salario {
	public static void main(String[] args) {
		float salario;
		System.out.print("Informe seu salário atual: ");
		salario = Float.parseFloat(System.console().readLine());
				
		if (salario < 5000) {
			System.out.printf("%.2f", salario * 1.3);
		}
		else {
			System.out.printf("%.2f", salario);
		}
	}
}