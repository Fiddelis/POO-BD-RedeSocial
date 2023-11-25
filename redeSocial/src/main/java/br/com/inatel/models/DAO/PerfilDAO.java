package br.com.inatel.models.DAO;

import br.com.inatel.models.entidades.Perfil;

import java.sql.SQLException;

public class PerfilDAO extends ConnectionDAO {

    public void insertPerfil(Perfil perfil, String emailUsuario) { //CREATE
        connectToDB();
        String sql = "INSERT INTO perfil() values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emailUsuario);
            pst.setString(2, perfil.getDescricao());
            pst.setString(3, perfil.getLocalizacao());
            pst.execute();
        } catch (SQLException exc) {
            System.out.println("Erro: Perfil já cadastrado para o Email: " + emailUsuario);
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
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
        } catch (SQLException ignored) {

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return perfil;
    }

    public void updatePerfil(Perfil novoPerfil, String emailUsuario) { // UPDATE
        connectToDB();
        String sql = "UPDATE `perfil` SET `descricao`=?, `localizacao`=? WHERE `usuario_email`=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, novoPerfil.getDescricao());
            pst.setString(2, novoPerfil.getLocalizacao());
            pst.setString(3, emailUsuario);
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public void deletePerfil(String emailUsuario) { // DELETE
        connectToDB();
        String sql = "DELETE FROM `perfil` WHERE `usuario_email`=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emailUsuario);
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Erro: Perfil não existe.");
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

}
