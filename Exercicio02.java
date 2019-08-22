package listaExerciciosMatriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TAM = 3;
		double[] produto = new double[TAM]; 
		double[][] matriz = new double[TAM][TAM];
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Mercado "+i+" \n");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(j+"° item R$ ");
				matriz[i][j] = ler.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				produto[i] += matriz[j][i];				
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Mercado "+i+" \n");
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(j+" Item R$ "+matriz[i][j]+" ");
				
			}
			System.out.println();
		}
		for (int i = 0; i < produto.length; i++) {
			System.out.println("Mercado"+i+" Soma "+produto[i]+" Media "+ produto[i]/TAM );
		}
		ler.close();
	}

}
