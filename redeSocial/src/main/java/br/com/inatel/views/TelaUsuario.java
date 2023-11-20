package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.AmigosController;
import br.com.inatel.controllers.PerfilController;
import br.com.inatel.controllers.PostagemController;

public class TelaUsuario extends Tela {
    PostagemController postagem = new PostagemController();
    AmigosController amigo = new AmigosController();
    PerfilController perfil = new PerfilController();
    public void exibir() {
        System.out.println();
        System.out.println("1 - Ultimas Postagens");
        System.out.println("2 - Postar Conteudo");
        System.out.println("3 - Criar Perfil");
        System.out.println("4 - Perfil de Usuario");
        System.out.println("5 - Adicionar Amigo");
        System.out.println("6 - Exibir Amigos");
        System.out.println("7 - Sair");
        System.out.println();

        switch (Main.sc.nextInt()) {
            case 1:
                postagem.exibirPostagens();
                exibir();
                break;
            case 2:
                System.out.print("Conteudo: ");
                Main.sc.nextLine();
                String conteudo = Main.sc.nextLine();
                postagem.setPostagem(conteudo, emailUsuario);
                exibir();
                break;
            case 3:
                System.out.println("Insira uma Descricao: ");
                Main.sc.nextLine();
                String descricao = Main.sc.nextLine();
                System.out.println("Insira uma Localização: ");
                String localizacao = Main.sc.nextLine();
                perfil.criarPerfil(emailUsuario, descricao, localizacao);
                exibir();
                break;
            case 4:
                System.out.println("Email do usuario: ");
                Main.sc.nextLine();
                String email = Main.sc.nextLine();
                perfil.visualizarPerfil(email);
                exibir();
                break;
            case 5:
                System.out.print("Insira o email do usuario: ");
                Main.sc.nextLine();
                String emailAmigo = Main.sc.nextLine();
                amigo.fazerAmigo(emailUsuario, emailAmigo);
                exibir();
                break;
            case 6:
                System.out.println("Amigos: ");
                amigo.exibirAmigos(emailUsuario);
                exibir();
                break;
            case 7:
                break;
        }
    }
}
