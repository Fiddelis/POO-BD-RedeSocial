package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.PostagemController;
import br.com.inatel.models.Postagem;

import java.util.ArrayList;

public class TelaPostagem extends Tela {

    @Override
    public void exibir() {
        PostagemController postagem = new PostagemController();
        int escolha;

        System.out.println();
        printAmarelo("-----------POSTAGEM-----------");
        System.out.println();
        System.out.println("0 - Voltar");
        System.out.println("1 - Recentes");
        System.out.println("2 - Postar");
        printAmarelo("------------------------------");
        System.out.println();

        escolha = Main.sc.nextInt();
        switch (escolha) {
            case 0:
                TelaUsuario telaUsuario = new TelaUsuario();
                telaUsuario.exibir();
                break;
            case 1:
                for (Postagem p : postagem.listaPostagens()) {
                    printCiano(p.getDataPublicacao());
                    System.out.print(" - ");
                    printAzul(p.getEmailUsuario());
                    System.out.println();
                    System.out.println(p.getConteudo());
                    System.out.println();
                }
                exibir();
                break;
            case 2:
                Main.sc.nextLine();
                System.out.println("Conteudo: ");
                String conteudo = Main.sc.nextLine();
                postagem.criarPostagem(conteudo, emailUsuario);
                exibir();
            default:
                exibir();
        }
    }
}
