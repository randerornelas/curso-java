package exercicios.bancoDeDadosJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() {

        final String urlConexao = "jdbc:mysql://localhost:3306/curso_java";
        final String usuario = "rander";
        final String senha = "12345678";

        try {
            return DriverManager.getConnection(urlConexao, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
