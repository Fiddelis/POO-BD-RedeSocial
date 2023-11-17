package br.com.inatel;

import br.com.inatel.controllers.PostagemController;
import br.com.inatel.models.Postagem;
import br.com.inatel.models.Usuario;
import br.com.inatel.controllers.DAO.UsuarioDAO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------REDE SOCIAL-------");
        System.out.println("1 - REGISTRE-SE");
        System.out.println("2 - ENTRAR");
        System.out.println("-------------------------");



        System.out.println("1 - Ultimas Postagens");
        System.out.println("2 - Fazer uma Publicação");
        System.out.println("3 - Lista de Usuarios");
        System.out.println("4 - Adicionar Amigo");

        Usuario usuario = new Usuario("Lucas", "lucas.ruan@ges.inatel.br", "2023-11-16", "40028922");


        PostagemController postagem = new PostagemController();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ArrayList<Postagem> postagens = postagem.getPostagens();
        //usuarioDAO.insertUsuario(usuario);
        System.out.println(usuarioDAO.selectUsuario("lucas.ruan@ges.inatel.br"));


        for(Postagem p : postagens) {
            System.out.println(p);
        }
    }
}