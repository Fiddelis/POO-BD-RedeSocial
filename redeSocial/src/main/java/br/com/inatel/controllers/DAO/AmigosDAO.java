package br.com.inatel.controllers.DAO;


import br.com.inatel.models.Amigos;

import java.sql.SQLException;
import java.util.ArrayList;

public class AmigosDAO extends ConnectionDAO {

    public void insertAmigos(Amigos amigos) { //CREATE
        connectToDB();
        String sql = "INSERT INTO Amigos() values(?,?)";

        if (selectAmigos(amigos.getUsuarioEmail1()) != null) {
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, amigos.getUsuarioEmail());
                pst.setString(2, amigos.getUsuarioEmail1());
                pst.execute();
                System.out.println("Amizade feita com Sucesso!");
            } catch (SQLException exc) {
                System.out.println("Email de Usuario incorreto.");
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException exc) {
                    System.out.println("Erro: " + exc.getMessage());
                }
            }
        } else {

        }
    }

    public Amigos selectAmigos(String email) { //Read
        connectToDB();
        String sql = "SELECT * FROM `Amigos` WHERE `usuario_email`=?";
        Amigos amigos = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            if(rs != null && rs.next()){
                amigos = new Amigos(email, rs.getString("usuario_email1"));
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
        return amigos;
    }

    public ArrayList<Amigos> listaAmigos(String email) {
        connectToDB();
        String sql = "SELECT usuario_email1 FROM `amigos` WHERE usuario_email =?;";
        ArrayList<Amigos> amigos = new ArrayList<>();
        Amigos amigosAux;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            while(rs.next()){
                amigosAux = new Amigos(email, rs.getString("usuario_email1"));
                amigos.add(amigosAux);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }  finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return amigos;
    }
}
