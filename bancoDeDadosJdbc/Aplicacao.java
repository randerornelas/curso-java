package exercicios.bancoDeDadosJdbc;

import exercicios.bancoDeDadosJdbc.modelo.Operacoes;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Operacoes op = new Operacoes();

        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.print("""
                1 - Mostrar Todos
                2 - Buscar
                3 - Adicionar
                4 - Excluir
                5 - Sair
                Escolha uma opção:\s""");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> op.mostrarTodos();
                case 2 -> op.buscar();
                case 3 -> op.adicionar();
                case 4 -> op.excluir();
            }

            System.out.println();

        } while(opcao != 5);

        op.fecharConexao();
        entrada.close();
    }
}
