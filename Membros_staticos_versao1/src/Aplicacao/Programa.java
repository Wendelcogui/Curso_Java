package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculador;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
				
		double c = Calculador.circuferencia(raio);
		
		double v = Calculador.volume(raio);
		
        System.out.printf("circuferencia: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculador.PI);
		sc.close();
	}
}
