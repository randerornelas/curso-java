package fundamentos;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso;
        double altura;
        double imc;
        String classificacao;

        System.out.print("Digite seu peso: ");
        peso = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite sua altura: ");
        altura = Double.parseDouble(entrada.nextLine());

        entrada.close();

        imc = peso / Math.pow(altura, 2);

        if (imc > 40)
            classificacao = "Obesidade III";
        else if (imc >= 30)
            classificacao = "Obesidade II";
        else if (imc >= 25)
            classificacao = "Obesidade I";
        else if (imc >= 18.5)
            classificacao = "Normal";
        else
            classificacao = "Abaixo do Peso";

        System.out.printf("Seu IMC é %.2f. - %s", imc, classificacao);
    }
}
