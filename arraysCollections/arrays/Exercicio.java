package arraysCollections.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        double media = total / notasAlunoA.length;

        System.out.printf("Média: %.2f", media);
    }
}
