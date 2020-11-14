public class _21arredondar {
	public static void main(String[] args) {
		double numero, casas, casas_decimais, arredondado;
		
		System.out.print("Digite um número real: ");
		numero = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o número de casas decimais requerido: ");
		casas = Double.parseDouble(System.console().readLine());
		casas_decimais = Math.pow(10, casas);
		arredondado = Math.rint(numero * casas_decimais)/casas_decimais;
		System.out.printf("O número ajustado é %f.", arredondado);
		}
		}