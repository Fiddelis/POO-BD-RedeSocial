package br.com.inatel.controllers.DAO;

import br.com.inatel.models.Postagem;

import java.sql.SQLException;

public class PostagemDAO extends ConnectionDAO {
    boolean sucesso;

    public boolean insertPostagem(Postagem postagem) { //CREATE
        connectToDB();
        String sql = "INSERT INTO postagem() VALUES(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, postagem.getDataPublicacao());
            pst.setString(2, postagem.getConteudo());
            pst.setString(3, postagem.getEmailUsuario());
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

    public Postagem selectPostagem(String email) { //Read
        connectToDB();
        String sql = "SELECT * FROM `Postagem` WHERE `usuario_email`=?";
        Postagem postagem = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            if(rs != null && rs.next()){
                postagem = new Postagem(rs.getString("data_publicacao"),rs.getString("conteudo"),rs.getString("usuario_email"));
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
        return postagem;
    }
}
