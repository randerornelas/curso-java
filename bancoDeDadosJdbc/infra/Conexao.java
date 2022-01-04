package exercicios.bancoDeDadosJdbc.infra;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

    public static Connection getConexao() {

        try {
            Properties prop = getProperties();

            final String urlConexao = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");

            return DriverManager.getConnection(urlConexao, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {

        Properties prop = new Properties();

        String caminho = "../resource/conexao.properties";

        prop.load(Conexao.class.getResourceAsStream(caminho));

        return prop;
    }
}
