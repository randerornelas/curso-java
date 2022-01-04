package jdbc;

import java.sql.*;
import java.util.Scanner;

public class AtualizarPessoa {

    public static void main(String[] args) throws SQLException {
        String urlConexao = "jdbc:mysql://localhost:3306/curso_java";
        String usuario = "root";
        String senha = "123456";

        Connection conexao = DriverManager.getConnection(urlConexao, usuario, senha);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o código a ser pesquisado: ");
        int codigo = entrada.nextInt();

        String sql = "SELECT * FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()) {
            System.out.println(resultado.getInt("codigo") +
                    " -> " + resultado.getString("nome"));
            entrada.nextLine();

            System.out.print("\nInforme o novo nome: ");
            String novoNome = entrada.nextLine();

            sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

            stmt.close();

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);

            stmt.execute();

            System.out.println("\nNome alterado com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
