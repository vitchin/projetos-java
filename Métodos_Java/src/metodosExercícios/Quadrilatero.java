package metodosExercícios;

public class Quadrilatero {
	//método Área do quadrado com um parâmetro
	//poderia ser também: lado**2
	public static void area(double ladoquad) {
		System.out.println("Área do quadrado: "+ladoquad * ladoquad);
	}
	//método Área do retângulo com dois parâmetros
	public static void area(double lado1, double lado2) {
		System.out.println("Área do retângulo: "+lado1 * lado2);
	}
	//método Área do trapézio com três parâmetros
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Área do trapézio: "+((baseMaior+baseMenor)*altura)/2);
	}
}
