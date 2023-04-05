package com.vitorcamara.projetos;

import java.util.Scanner;

public class QuantidadeParImparMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] M = new int[3][3];
		int qtdPares = 0;
		int qtdImpares = 0;

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println("Entre com o valor da linha " + i + ", coluna " + j + ":");
				M[i][j] = scan.nextInt(); // armazenando cada valor em cada posição da matriz

				if (M[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("Quantidade de números pares: " + qtdPares);
		System.out.println("Quantidade de números ímpares: " + qtdImpares);

	}

}
