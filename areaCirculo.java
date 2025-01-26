package proGitHub;

import java.util.Scanner;

public class areaCirculo{

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = dados.nextInt();
		
		double pi = 3.14159;
		
		double raio = pi * (numero*numero);
		
		System.out.println("o raio é = " + raio);
		
		
		dados.close();

	}

}