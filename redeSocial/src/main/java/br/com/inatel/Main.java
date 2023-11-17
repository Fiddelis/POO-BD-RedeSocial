package br.com.inatel;

import br.com.inatel.models.Usuario;
import br.com.inatel.controllers.DAO.UsuarioDAO;
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Lucas", "lucas.ruan@ges.inatel.br", "2023-11-16", "40028922");

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //usuarioDAO.insertUsuario(usuario);
        System.out.println(usuarioDAO.selectUsuario("lucas.ruan@ges.inatel.br"));
    }
}