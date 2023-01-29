package metodosExercícios;

public class ValorDeEmprestimo {
	/*
	 * Calcule o valor final do empréstimo, a 
	 * partir do valor solicitado. taxas e 
	 * parcelas influênciam. Defina 
	 * arbitrareamente as faixas que influenciam
	 * nos valores
	 * 
	 * */
	public static int pegarDuasParcelas() {
		return 2;
	}
	public static int pegarTresParcelas() {
		return 3;
	}
	public static double pegarTaxaDuasParcelas() {
		return 0.3;
	}
	public static double pegarTaxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) {
		
		if(parcelas == 2) {
			
			double valorFinal = valor + (valor*pegarTaxaDuasParcelas());
			System.out.println("Valor final do empréstimo para 2 parcelas: R$ "+valorFinal);;
		}
		else if(parcelas == 3) {
		
			double valorFinal = valor + (valor*pegarTaxaTresParcelas());
			System.out.println("Valor final do empréstimo para 3 parcelas: R$ "+valorFinal);
		}
		else {
			
			System.out.println("Quantidade de parcelas não aceitas.");
		}
		
	}
	
}
