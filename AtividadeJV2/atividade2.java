package atividade2_java;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		
		int n1, n2, n3, resultado;
		System.out.println("digite o primeiro numero ");
		n1 = leitura.nextInt();
		
		System.out.println("digite o segundo numero ");
		
		n2 = leitura.nextInt();
		System.out.println("digite o terceiro numero ");
		
		n3 = leitura.nextInt();
		resultado = n1 + n2 + n3;
		System.out.println("A soma dos 3 valores solicitados é " + resultado);	
		
		
		
		
		/*int n1, n2, resultado, resultado_mult , resultado_sub;
		
		System.out.println("Digite um numero");
		n1 = leitura.nextInt();
		System.out.println("Digite o segundo numero");
		
		n2 = leitura.nextInt();
		resultado = n1 + n2;
		resultado_mult = n1 * n2;
		resultado_sub = n1  - n2;
		
		System.out.println("O resultado da soma das duas variaveis é =" + resultado);
		System.out.println("O resultado da multplicação das duas variaveis é =" + resultado_mult);
		System.out.println("O resultado da subtração das duas variaveis é =" + resultado_sub);
		
		
		
		
		
		
		resultado++;
		System.out.println("o incremento da variavel resultado é = "+ resultado);
		
		resultado--;
		
		System.out.println("o decremento da variavem resultado é = " + resultado);*/

	}

}