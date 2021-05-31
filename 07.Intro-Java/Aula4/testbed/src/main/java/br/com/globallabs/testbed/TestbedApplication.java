package br.com.globallabs.testbed;

import java.util.stream.IntStream;


public class TestbedApplication {

	public static void main(String[] args) {
		
		var teste1 = true;
		// Teste de if de uma linha
		System.out.println(teste1 ? "é verdadeiro" : " é  falso");
		// Dependendo da posição do incremento, muda-se o ponto de parada
		var x = 0;
		while (x++ < 10) {
			System.out.println(x);
		}
		x = 0;
		while (++x < 10) {
			System.out.println(x);
		}
		// Lambdas com Streams
		IntStream.of(20, 30, 40, 50).forEach(n -> {
			System.out.println(n);
		});
		IntStream.range(1, 35).forEach(n -> {
			System.out.println(n);
		});
	}

}
