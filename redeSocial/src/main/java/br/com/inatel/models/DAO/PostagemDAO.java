package br.com.inatel.models.DAO;

import br.com.inatel.models.Postagem;

import java.sql.SQLException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PostagemDAO extends ConnectionDAO {

    public void insertPostagem(Postagem postagem) {
        connectToDB();
        String sql = "INSERT INTO postagem(data_publicacao, conteudo, usuario_email) VALUES(?,?,?)";
        try {
            LocalDate dataPostagem = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            dataPostagem.format(formatter);

            pst = con.prepareStatement(sql);
            pst.setDate(1, java.sql.Date.valueOf(dataPostagem));
            pst.setString(2, postagem.getConteudo());
            pst.setString(3, postagem.getEmailUsuario());
            pst.execute();

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
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
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return postagem;
    }

    public ArrayList<Postagem> selectUltimasPostagens() {
        connectToDB();
        String sql = "SELECT * FROM `postagem` ORDER BY id DESC LIMIT 10;";
        ArrayList<Postagem> postagem = new ArrayList<>();
        Postagem postagemAux;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                postagemAux = new Postagem(rs.getString("data_publicacao"),rs.getString("conteudo"),rs.getString("usuario_email"));
                postagem.add(postagemAux);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
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
