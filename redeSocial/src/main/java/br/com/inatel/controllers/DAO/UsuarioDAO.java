package br.com.inatel.controllers.DAO;

import br.com.inatel.models.Usuario;

import java.sql.SQLException;

public class UsuarioDAO extends ConnectionDAO {
    boolean sucesso;

    public boolean insertUsuario(Usuario usuario) { //CREATE
        connectToDB();
        String sql = "INSERT INTO usuario() values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getEmail());
            pst.setString(2, usuario.getDataNascimento());
            pst.setString(3, usuario.getSenha());
            pst.setString(4, usuario.getNome());
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

    public Usuario selectUsuario(String email) { //Read
        connectToDB();
        String sql = "SELECT * FROM `usuario` WHERE `email`=?";
        Usuario usuario = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            if(rs != null && rs.next()){
                usuario = new Usuario(rs.getString("nome"),rs.getString("email"),rs.getString("data_nascimento"),"*****");
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                //st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return usuario;
    }
}
