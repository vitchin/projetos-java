package metodosExercícios;

public class PeriodoDia {
	/*
	 *A partir da hora do dia, informe a mensagem adequada: Bom dia
	 *boa tarde e boa noite.
	 */
	//método Hora contém hora como parâmetro
	public static void Hora(int hora) {
		/* O switch é uma estrutura de condição que permite fazer uma
		 * determinada escolha e dependendo da escolha ela fará uma
		 * determinada função*/
		switch (hora) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		{
		//escreva Bom dia
		System.out.println("Bom dia!!!");
		break;
		}		
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		{
		//escreva Boa tarde
		System.out.println("Boa tarde!!!");
		break;
		}
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		{
		//escreva Boa noite
		System.out.println("Boa noite!!!");
		break;	
		}
		/*
		 * Escolha padrão: caso nenhuma das escolhas apresentadas
		 * sejam escolhidas irá aparecer Hora inválida
		 * */
		default:
			System.out.println("Hora inválida!");
		}
	}
}
