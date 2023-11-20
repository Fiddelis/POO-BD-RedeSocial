package br.com.inatel.controllers;

import br.com.inatel.controllers.DAO.UsuarioDAO;
import br.com.inatel.models.Usuario;

import java.util.Objects;

public class LoginController {
    private String emailLogin;
    private String senhaLogin;

    UsuarioDAO usuarios = new UsuarioDAO();
    public boolean cadastro(String nome, String email, String senha, String dataNascimento) {
        if(usuarios.selectUsuario(email) == null) {
            Usuario usuarioCadastro = new Usuario(nome, email, dataNascimento, senha);
            usuarios.insertUsuario(usuarioCadastro);
            System.out.println("Usuario Cadastrado!");
            return true;
        } else {
            System.out.println("Email de usuario existente.");
            return false;
        }
    }

    public boolean entrar(String email, String senha) {
        Usuario usuarioLogin = usuarios.selectUsuario(email);
        return usuarioLogin != null && Objects.equals(usuarioLogin.getSenha(), senha);
    }
}
