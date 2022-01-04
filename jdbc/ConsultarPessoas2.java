package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConexao();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        System.out.print("Informe o valor para consulta: ");
        String valor = entrada.next();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + valor + "%");

        ResultSet resultado = stmt.executeQuery();

        while(resultado.next()) {
            System.out.println(resultado.getInt("codigo")
                    + " -> " + resultado.getString("nome"));
        }

        conexao.close();
        entrada.close();
    }
}
