package br.com.inatel.controllers.DAO;


import br.com.inatel.models.Amigos;

import java.sql.SQLException;

public class AmigosDAO extends ConnectionDAO {

    public boolean insertAmigos(Amigos amigos) { //CREATE
        boolean sucesso;

        connectToDB();
        String sql = "INSERT INTO Amigos() values(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, amigos.getUsuarioEmail());
            pst.setString(2, amigos.getUsuarioEmail1());
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

//    public Amigos selectAmigos(Amigos amigos) { //Read
//        connectToDB();
//        String sql = "SELECT * FROM `amigos` WHERE `usuario_email`=? AND `usuario_email1`=?";
//
//        try {
//            pst = con.prepareStatement(sql);
//            pst.setInt(1, CRM);
//            pst.setString(2, SENHA);
//            rs = pst.executeQuery();
//            if(rs != null && rs.next()){
//                medico = new Medico(rs.getInt("crm"),rs.getString("nome"),rs.getString("telefone"), rs.getString("especialidade"), rs.getString("senha"));
//            }
//            sucesso = true;
//        } catch (SQLException e) {
//            System.out.println("Erro: " + e.getMessage());
//            sucesso = false;
//        } finally {
//            try {
//                con.close();
//                //st.close();
//            } catch (SQLException e) {
//                System.out.println("Erro: " + e.getMessage());
//            }
//        }
//        return medico;
//    }
}
