package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.AmigosController;
import br.com.inatel.controllers.PerfilController;
import br.com.inatel.controllers.PostagemController;

public class TelaUsuario extends Tela {
    int escolha;
    PostagemController postagem = new PostagemController();
    AmigosController amigo = new AmigosController();
    PerfilController perfil = new PerfilController();
    public void exibir() {
        System.out.println();
        printAmarelo("-------------MENU-------------");
        System.out.println();
        System.out.println("0 - Sair");
        System.out.println("1 - Postagem");
        System.out.println("2 - Perfil");
        System.out.println("3 - Amigos");
        printAmarelo("------------------------------");
        System.out.println();
        System.out.println();
        escolha = Main.sc.nextInt();
        Main.sc.nextLine();
        switch (escolha) {
            case 0:
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.exibir();
                break;
            case 1:
                TelaPostagem telaPostagem = new TelaPostagem();
                telaPostagem.exibir();
                break;
            case 2:
                TelaPerfil telaPerfil = new TelaPerfil();
                telaPerfil.exibir();
                break;
            case 3:
                TelaAmigo telaAmigo = new TelaAmigo();
                telaAmigo.exibir();
                break;
            default:
                exibir();
        }
    }
}
