package programacao2;

import java.sql.*;
import java.util.Properties;

public class DB {

    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/trabalho";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection conexao;
    private Properties propriedades;

    public DB() {
        this.connect();
    }

    private Properties getPropriedades() {
        if (propriedades == null) {
            propriedades = new Properties();
            propriedades.setProperty("user", USERNAME);
            propriedades.setProperty("password", PASSWORD);
        }
        return propriedades;
    }

    private void connect() {
        if (conexao == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                this.conexao = DriverManager.getConnection(DATABASE_URL, getPropriedades());
            } catch (ClassNotFoundException | SQLException e) {
                this.conexao = null;
                e.printStackTrace();
            }
        }
    }

    public void disconnect() {
        if (conexao != null) {
            try {
                this.conexao.close();
                this.conexao = null;
            } catch (SQLException e) {
                this.conexao = null;
                e.printStackTrace();
            }
        }
    }

    public ResultSet select(String query) throws SQLException {
        Statement stmt = this.conexao.createStatement();
        return stmt.executeQuery(query);
    }

    public PreparedStatement createUpdateDelete(String query) throws SQLException {
        return this.conexao.prepareStatement(query);
    }
}