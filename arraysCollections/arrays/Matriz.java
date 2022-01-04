package arraysCollections.arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtdeAlunos;
        int qtdeNotas;

        System.out.print("Quantos alunos? ");
        qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
                notasDaTurma[a][n] = entrada.nextDouble();

                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma: " + media);

        entrada.close();
    }
}
