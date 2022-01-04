package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        String texto = "";
        Scanner entrada = new Scanner(System.in);

        while(!texto.equalsIgnoreCase("sair")) {
            System.out.print("Digite um comando: ");
            texto = entrada.nextLine();
        }
        entrada.close();

        System.out.println("Saindo...");
    }
}
