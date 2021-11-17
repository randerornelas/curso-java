package exercicios.bancoDeDadosJdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Queries {

    private static final Connection CONEXAO = Conexao.getConexao();
    PreparedStatement stmt;

    public List<Pessoa> mostrarTodos() {

        List<Pessoa> pessoas = new ArrayList<>();
        ResultSet resultado;

        try {
            stmt = CONEXAO.prepareStatement("SELECT * FROM pessoas");
            resultado = stmt.executeQuery();

            ResultSetMetaData metaData = resultado.getMetaData();
            int colunas = metaData.getColumnCount();

            for(int i = 2; i <= colunas; i++) {
                System.out.printf("%-8s\t\t", metaData.getColumnName(i).toUpperCase());
            }

            System.out.println();

            while(resultado.next()) {
                pessoas.add(new Pessoa(resultado.getString("nome"),
                        resultado.getInt("idade"),
                        resultado.getString("email")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pessoas;
    }

    public List<Pessoa> buscarPorNome(String nome) {

        List<Pessoa> pessoas = new ArrayList<>();
        ResultSet resultado;

        try {
            stmt = CONEXAO.prepareStatement("SELECT * FROM pessoas WHERE nome LIKE ?");

            stmt.setString(1, "%" + nome + "%");

            resultado = stmt.executeQuery();

            ResultSetMetaData metaData = resultado.getMetaData();
            int colunas = metaData.getColumnCount();

            for(int i = 2; i <= colunas; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i).toUpperCase());
            }

            System.out.println();

            while(resultado.next()) {
                pessoas.add(new Pessoa(resultado.getString("nome"),
                        resultado.getInt("idade"),
                        resultado.getString("email")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pessoas;
    }

    public void adicionarPessoa(String nome, int idade, String email) {

        try{
            stmt = CONEXAO.prepareStatement(
                    "INSERT INTO pessoas (nome, idade, email) VALUES (?, ?, ?)");

            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, email);

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirPessoa(String email) {

        try {
            stmt = CONEXAO.prepareStatement("DELETE FROM pessoas WHERE email = ?");

            stmt.setString(1, email);

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            CONEXAO.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
