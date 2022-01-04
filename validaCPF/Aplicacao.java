package exercicios.validaCPF;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        ValidarCPF v = new ValidarCPF();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = entrada.nextLine();

        String novoCPF = v.validar(cpf);

        entrada.close();

        if(novoCPF.equals(cpf)) {
            System.out.println("CPF Válido!");
        } else {
            System.out.println("CPF Inválido!");
        }
    }
}
