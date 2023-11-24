package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.AmigosController;

public class TelaAmigo extends Tela {
    AmigosController amigo = new AmigosController();
    @Override
    public void exibir() {
        String emailAmigo;
        int escolha;
        System.out.println();
        printAmarelo("------------AMIGOS------------");
        System.out.println();
        System.out.println("0 - Voltar");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Lista de Amigos");
        System.out.println("3 - Deletar Amigo");
        printAmarelo("------------------------------");
        System.out.println();

        escolha = Main.sc.nextInt();
        Main.sc.nextLine();
        switch (escolha) {
            case 0:
                TelaUsuario telaUsuario = new TelaUsuario();
                telaUsuario.exibir();
                break;
            case 1:
                System.out.print("Insira o email do usuario: ");
                emailAmigo = Main.sc.nextLine();
                amigo.fazerAmigo(emailUsuario, emailAmigo);
                exibir();
                break;
            case 2:
                System.out.println("Lista de Amigos: ");
                amigo.exibirAmigos(emailUsuario);
                exibir();
                break;
            case 3:
                System.out.print("Insira o email do usuario: ");
                emailAmigo = Main.sc.nextLine();
                amigo.deleteAmigo(emailUsuario, emailAmigo);
                exibir();
                break;
            default:
                exibir();
                break;
        }
    }
}
