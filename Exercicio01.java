package listaExerciciosMatriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamMatriz;
		int soma = 0;
		double media = 0;
		int maior = 0;
		int menor = 0;
		int contImpar = 0;
		int contPar = 0;
		int contDiaPrinc = 0;
		int contDiaSecun = 0;
 		System.out.println("Informe o tamanho da matriz: ");
		tamMatriz = ler.nextInt();
		while(((tamMatriz < 3) || (tamMatriz >= 12)) && (tamMatriz % 2 != 0)) {
			
			System.out.println("Informe o tamanho da matriz: ");
			tamMatriz = ler.nextInt();
			
			
		}
		
		int[][] matriz = new int[tamMatriz][tamMatriz];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Informe um numero ("+i+" , "+j +"): ");
				matriz[i][j] = ler.nextInt();
				soma += matriz[i][j];
				if(i == 0 && j == 0) {
					maior = matriz[i][j];
					menor = matriz[i][j];
				} 
				if( matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
				if(matriz[i][j] % 2 == 0) {
					contPar++;
				}else {
					contImpar++;
				}
				if(i == j) {
					contDiaPrinc += matriz[i][j];
				}
				if(j + i == tamMatriz - 1) {
					contDiaSecun+= matriz[i][j];
				}
				
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
		}
		media = soma /(tamMatriz * tamMatriz);
		System.out.println("\nmedia: "+ media);
		System.out.println("soma: "+ soma);
		System.out.println("maior: "+ maior);
		System.out.println("menor: "+ menor);
		System.out.println("pares: "+ contPar);
		System.out.println("impar: "+ contImpar);
		System.out.println("Diagonal principal: "+ contDiaPrinc);
		System.out.println("Diagonal secundaria: "+ contDiaSecun);
	}

}
