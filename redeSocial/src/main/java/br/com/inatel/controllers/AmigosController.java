package br.com.inatel.controllers;

import br.com.inatel.models.DAO.AmigosDAO;
import br.com.inatel.models.entidades.Amigos;

import java.util.ArrayList;

public class AmigosController {
    Amigos amigos;
    AmigosDAO amigosDAO = new AmigosDAO();
    UsuarioController usuarioController = new UsuarioController();

    public void fazerAmigo(String emailUsuario, String emailAmigo) {
        Amigos amigos = new Amigos(emailUsuario, emailAmigo);

        if(emailUsuario.equals(emailAmigo)) {
            System.out.println("Não pode ser amigo de si mesmo!");
        } else if (!usuarioController.existe(emailAmigo)) {
            System.out.println("Usuario não existe!");
        } else if (!existe(emailUsuario, emailAmigo)) {
            amigosDAO.insertAmigos(amigos);
            System.out.println("Amizade feita com Sucesso!");
        } else {
            System.out.println("Amizade ja feita!");
        }
    }

    public void exibirAmigos(String email) {
        ArrayList<Amigos> lista = amigosDAO.listaAmigos(email);
        System.out.println("Qtd. Amigos: " + lista.size());
        if (lista.size() > 0) {
            for (Amigos a : lista) {
                System.out.println(a);
            }
        } else {
            System.out.println("Você não tem amigos!");
        }
    }

    public void deleteAmigo(String emailUsuario, String emailAmigo) {
        if(!usuarioController.existe(emailAmigo)) {
            System.out.println("Usuario não existe!");
        } else if(existe(emailUsuario, emailAmigo)) {
            amigosDAO.deleteAmigo(emailUsuario, emailAmigo);
            System.out.println("Amigo deletado com Sucesso!");
        } else {
            System.out.println("Amigo não existe!");
        }
    }

    private boolean existe(String emailUsuario, String emailAmigo) {
        for(Amigos a : amigosDAO.listaAmigos(emailUsuario)) {
            if(a.getUsuarioEmail1().equals(emailAmigo)) {
                amigos = amigosDAO.selectAmigos(emailUsuario);
            }
        }
        return amigos != null;
    }
}
