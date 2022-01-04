package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        String usuario = "rander";
        String senha = "12345678";
        String stringDeConexao = "jdbc:mysql://localhost:3306/curso_java";
                //"jdbc:sqlserver://localhost\\SQLEXPRESS:1433;user=" + usuario + ";password=" + senha + ";";

        Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
