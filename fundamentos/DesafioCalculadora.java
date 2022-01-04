package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();

        System.out.print("Digite o operação: ");
        operacao = entrada.next().charAt(0);

        entrada.close();

        resultado = operacao == '+' ? num1 + num2 : 0;
        resultado = operacao == '-' ? num1 - num2 : resultado;
        resultado = operacao == '*' ? num1 * num2 : resultado;
        resultado = operacao == '/' ? num1 / num2 : resultado;

        System.out.printf("%.2f %c %.2f = %.2f", num1, operacao, num2, resultado);

    }
}
