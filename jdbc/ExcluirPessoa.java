package jdbc;

import java.sql.*;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        String urlConexao = "jdbc:mysql://localhost:3306/curso_java";
        String usuario = "root";
        String senha = "123456";

        Connection conexao = DriverManager.getConnection(urlConexao, usuario, senha);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o código: ");
        int codigo = entrada.nextInt();

        String sqlSelect = "SELECT * FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
        stmt.setInt(1, codigo);

        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()) {
            System.out.println(resultado.getInt("codigo") +
                    " -> " + resultado.getString("nome"));
            entrada.nextLine();

            String sqlDelete = "DELETE FROM pessoas WHERE codigo = ?";

            System.out.print("\nDeseja excluir? 's' ou 'n': ");
            String strExcluir = entrada.nextLine();

            if (strExcluir.equalsIgnoreCase("s")) {

                stmt.close();

                stmt = conexao.prepareStatement(sqlDelete);
                stmt.setInt(1, codigo);

                stmt.executeUpdate();

                System.out.println("\nPessoa excluída com sucesso!");
            } else if (strExcluir.equalsIgnoreCase("n")) {
                System.out.println("\nNada feito.");
            } else {
                System.out.println("\nOpção inválida!");
            }
        } else {
            System.out.println("\nPessoa não encontrada.");
        }

        entrada.close();
        conexao.close();
    }
}
