package metodosExercícios;

public class ChamadaClasses {
	
	public static void main(String[] args) {
		
		System.out.println("Classe Calculadora:");
		
		Calculadora calc = new Calculadora();
		calc.soma(2,2);
		calc.subracao(6, 4);
		calc.divisao(2, 3);
		calc.multiplicacao(5, 5);
		
		System.out.print("\n");
		
		System.out.println("Classe HoraDoDia:");
		
		PeriodoDia horario = new PeriodoDia();
		horario.Hora(5);
		horario.Hora(17);
		horario.Hora(21);

		System.out.print("\n");
		
		System.out.println("Classe ValorDeEmprestimo:");
		
		ValorDeEmprestimo emprestimo = new ValorDeEmprestimo();
		
		emprestimo.calcular(1000, 2);
		emprestimo.calcular(1000, 3);
		emprestimo.calcular(1000, 5);
		
		
	}
	
}
