package arraysCollections.arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdeNotas;
        double[] notas;
        double soma = 0;
        double media;

        System.out.print("Quantas notas você quer informar? ");
        qtdeNotas = entrada.nextInt();

        notas = new double[qtdeNotas];

        for (int i = 0; i < qtdeNotas; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        entrada.close();

        for(double nota: notas) {
            soma += nota;
        }

        media = soma / notas.length;

        System.out.printf("Média: %.2f", media);
    }
}
