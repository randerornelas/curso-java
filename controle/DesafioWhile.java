package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        double nota = 0;
        double soma = 0;
        int qtde = 0;
        double media;

        Scanner entrada = new Scanner(System.in);

        while(nota != -1) {
            System.out.print("Digite a nota (ou -1 para sair): ");
            nota = entrada.nextDouble();

            if((nota >= 0) && (nota <= 10)) {
                soma += nota;
                qtde++;
            } else if(nota != -1) {
                System.out.println("Nota incorreta. Tente novamente.");
            }
        }
        entrada.close();

        media = soma / qtde;

        System.out.printf("%nNotas válidas: %d"
                + "%nSoma: %.2f"
                + "%nMédia: %.2f", qtde, soma, media);
    }
}
