package exercicios.bancoDeDadosJdbc;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Operacoes op = new Operacoes();

        Scanner entrada = new Scanner(System.in);

        System.out.print("""
                1 - Mostrar Todos
                2 - Buscar
                3 - Adicionar
                4 - Excluir
                5 - Sair
                Escolha uma opção:\s""");
        int opcao = entrada.nextInt();

        while(opcao != 5) {
            switch (opcao) {
                case 1 -> op.mostrarTodos();
                case 2 -> op.buscarPorNome();
                case 3 -> op.adicionar();
                case 4 -> op.excluir();
                default -> System.out.println("\nOpção inválida! Tente novamente.");
            }

            System.out.print("""

                    1 - Mostrar Todos
                    2 - Buscar
                    3 - Adicionar
                    4 - Excluir
                    5 - Sair
                    Escolha uma opção:\s""");
            opcao = entrada.nextInt();
        }

        op.fecharConexao();
        entrada.close();
    }
}
