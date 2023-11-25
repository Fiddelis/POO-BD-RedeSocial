package br.com.inatel.models.DAO;

import java.sql.*;

public abstract class ConnectionDAO {
    Connection con; //connection
    PreparedStatement pst; // (query) - SQL code
    ResultSet rs; //response

    private final String database = "redesocialbd";
    private final String user = "root";
    private final String password = "admin";
    private final String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true" +
            "&serverTimezone=UTC" +
            "&useSSL=false" +
            "&allowPublicKeyRetrieval=true";

    /**
     * Método para conexão com o banco de dados
     */
    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
