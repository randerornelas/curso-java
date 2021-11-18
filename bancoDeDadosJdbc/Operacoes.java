package exercicios.bancoDeDadosJdbc;

import java.util.List;
import java.util.Scanner;

public class Operacoes {

    DAO dao = new DAO();

    public void mostrarTodos() {

        System.out.println();

        for(Pessoa p: dao.mostrarTodos()) {
            System.out.printf("%-8s\t\t%-8d\t\t%-8s", p.getNome(), p.getIdade(), p.getEmail());
            System.out.println();
        }
    }

    public void buscarPorNome() {

        List<Pessoa> listaPorNome;

        Scanner entrada = new Scanner(System.in);

        System.out.println();

        System.out.print("Digite um nome para pesquisar: ");
        String nome = entrada.nextLine();

        listaPorNome = dao.buscarPorNome(nome);

        for(Pessoa p: listaPorNome) {
            System.out.printf("%s\t\t%d\t\t%s", p.getNome(), p.getIdade(), p.getEmail());
            System.out.println();
        }
    }

    public void adicionar() {

        Pessoa pessoa;
        Scanner entrada = new Scanner(System.in);

        System.out.println();

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Digite o e-mail: ");
        String email = entrada.nextLine();

        pessoa = new Pessoa(nome, idade, email);

        dao.adicionar(pessoa);

        System.out.println("\nPessoa adicionada com sucesso!");
    }

    public void excluir() {

        Scanner entrada = new Scanner(System.in);

        buscarPorNome();

        System.out.print("\nDigite o e-mail para excluir: ");
        String email = entrada.nextLine();

        dao.excluir(email);

        System.out.println("\nPessoa excluída com sucesso!");
    }

    public void fecharConexao() {
        dao.close();
    }
}
