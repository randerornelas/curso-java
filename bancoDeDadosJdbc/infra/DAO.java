package exercicios.bancoDeDadosJdbc.infra;

import exercicios.bancoDeDadosJdbc.modelo.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    Connection con;

    public DAO() {
        this.con = Conexao.getConexao();
    }

    public List<Pessoa> mostrarTodos() {

        List<Pessoa> pessoas = new ArrayList<>();
        ResultSet resultado;
        String sql = "SELECT * FROM pessoas";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
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

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pessoas;
    }

    public List<Pessoa> buscar(Pessoa pessoa) {

        List<Pessoa> pessoas = new ArrayList<>();
        ResultSet resultado;
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + pessoa.getNome() + "%");

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

    public void adicionar(Pessoa pessoa) {
        String sql = "INSERT INTO pessoas (nome, idade, email) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getEmail());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public void excluir(Pessoa pessoa) {
        String sql = "DELETE FROM pessoas WHERE email = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, pessoa.getEmail());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
