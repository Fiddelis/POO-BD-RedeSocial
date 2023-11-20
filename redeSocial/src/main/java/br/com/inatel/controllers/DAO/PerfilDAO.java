package br.com.inatel.controllers.DAO;

import br.com.inatel.models.Perfil;

import java.sql.SQLException;

public class PerfilDAO extends ConnectionDAO {
        boolean sucesso;

    public boolean insertPerfil(Perfil perfil, String emailUsuario) { //CREATE
        connectToDB();
        String sql = "INSERT INTO perfil() values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emailUsuario);
            pst.setString(2, perfil.getDescricao());
            pst.setString(3, perfil.getLocalizacao());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public Perfil selectPerfil(String email) {
        connectToDB();
        String sql = "SELECT * FROM `perfil` WHERE `usuario_email`=?";
        Perfil perfil = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            if(rs != null && rs.next()){
                perfil = new Perfil(rs.getString("descricao"),rs.getString("localizacao"));
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return perfil;
    }
}
