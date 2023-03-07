package Util;

public class Calculador {
	public static final double PI = 3.141559;
	
	public static double circuferencia(double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}
