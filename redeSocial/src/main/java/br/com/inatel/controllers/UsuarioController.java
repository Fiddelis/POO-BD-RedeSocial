package br.com.inatel.controllers;

import br.com.inatel.models.DAO.UsuarioDAO;
import br.com.inatel.models.entidades.Usuario;

import java.util.Objects;

public class UsuarioController {
    private String emailLogin;
    private String senhaLogin;

    UsuarioDAO usuarioDAO = new UsuarioDAO();
    public boolean criarUsuario(String nome, String email, String senha, String dataNascimento) {
        if(usuarioDAO.selectUsuario(email) == null) {
            Usuario usuarioCadastro = new Usuario(nome, email, dataNascimento, senha);
            usuarioDAO.insertUsuario(usuarioCadastro);
            return true;
        } else {
            System.out.println("Email de usuario existente.");
            return false;
        }
    }

    public boolean loginUsuario(String email, String senha) {
        Usuario usuarioLogin = usuarioDAO.selectUsuario(email);
        return usuarioLogin != null && Objects.equals(usuarioLogin.getSenha(), senha);
    }

    public boolean existe(String emailAmigo) {
        Usuario usuario = usuarioDAO.selectUsuario(emailAmigo);
        return usuario != null;
    }
}
