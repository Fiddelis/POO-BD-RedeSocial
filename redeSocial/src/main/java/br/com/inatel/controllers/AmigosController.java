package br.com.inatel.controllers;

import br.com.inatel.controllers.DAO.AmigosDAO;
import br.com.inatel.models.Amigos;

public class AmigosController {
        AmigosDAO amigosDAO = new AmigosDAO();
    public void fazerAmigo(String emailUsuario, String emailAmigo) {
        Amigos amigos = new Amigos(emailUsuario, emailAmigo);
        amigosDAO.insertAmigos(amigos);
    }

    public void exibirAmigos(String email) {
        for (Amigos a : amigosDAO.listaAmigos(email)) {
            System.out.println(a);
        }
    }
}
