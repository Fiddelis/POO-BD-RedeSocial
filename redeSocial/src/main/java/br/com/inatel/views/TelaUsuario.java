package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.AmigosController;
import br.com.inatel.controllers.PerfilController;
import br.com.inatel.controllers.PostagemController;

public class TelaUsuario extends Tela {
    int escolha;
    public void exibir() {
        System.out.println();
        printAmarelo("-------------MENU-------------");
        System.out.println();
        printAmarelo("0");
        System.out.println(" Sair");
        printAmarelo("1");
        System.out.println(" Postagem");
        printAmarelo("2");
        System.out.println(" Perfil");
        printAmarelo("3");
        System.out.println(" Amigos");
        printAmarelo("------------------------------");
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
