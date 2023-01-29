package metodosExercícios;

public class Calculadora {
	/* 
	 * Calcule as 4 operações básicas: soma subtração, multiplicação
	 * e divisão. Sempre 2 valores devem ser passados.
	 */
	
	//método soma tem dois parametros
	public static void soma(double num1, double num2) {
		//a variavel resultado vai conter o resultado da soma dos dois parâmetros
		double resultado = num1 + num2;
		//e exibirá ex: ("1 + 2 = 3") 
		System.out.println("A soma entre: "+ num1 +" + "+num2+" = "+resultado);
	}
	//método subracao tem dois parametros
	public static void subracao(double num1, double num2) {
		//a variavel resultado vai conter o resultado da subtração dos dois parâmetros
		double resultado = num1 - num2;
		//e exibirá ex: ("1 - 2 = 1") 
		System.out.println("A subtração entre: "+ num1 +" - "+num2+" = "+resultado);
	}
	//método multiplicacao tem dois parametros
	public static void multiplicacao(double num1, double num2) {
		//a variavel resultado vai conter o resultado da multiplicação dos dois parâmetros
		double resultado = num1 * num2;
		//e exibirá ex: ("1 * 2 = 2") 
		System.out.println("A multiplicação entre: "+ num1 +" * "+num2+" = "+resultado);
	}
	//método divisao tem dois parametros
	public static void divisao(double num1, double num2) {
		//a variavel resultado vai conter o resultado da divisão dos dois parâmetros
		double resultado = num1 / num2;
		//e exibirá ex: ("9 / 3  = 3") 
		System.out.println("A divisão entre: "+ num1 +" + "+num2+" = "+resultado);
	}
	
}
