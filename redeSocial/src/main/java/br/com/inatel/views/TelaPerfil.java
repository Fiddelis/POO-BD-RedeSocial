package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.PerfilController;

public class TelaPerfil extends Tela {
    PerfilController perfil = new PerfilController();

    @Override
    public void exibir() {
        String descricao, localizacao;
        int escolha;

        System.out.println();
        printAmarelo("------------PERFIL------------");
        System.out.println();
        printAmarelo("0");
        System.out.println(" Voltar");
        printAmarelo("1");
        System.out.println(" Criar");
        printAmarelo("2");
        System.out.println(" Editar");
        printAmarelo("3");
        System.out.println(" Deletar");
        printAmarelo("4");
        System.out.println(" Visualizar");
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
                System.out.print("Insira uma Descricao: ");
                descricao = Main.sc.nextLine();
                System.out.print("Insira uma Localização: ");
                localizacao = Main.sc.nextLine();
                perfil.criarPerfil(emailUsuario, descricao, localizacao);
                exibir();
                break;
            case 2:
                System.out.print("Insira uma Descricao: ");
                descricao = Main.sc.nextLine();
                System.out.print("Insira uma Localização: ");
                localizacao = Main.sc.nextLine();
                perfil.atualizarPerfil(emailUsuario, descricao, localizacao);
                exibir();
                break;
            case 3:
                System.out.print("Tem certeza? (s/n): ");
                char certeza = Main.sc.nextLine().charAt(0);
                if(certeza == 's') {
                    perfil.deletarPerfil(emailUsuario);
                } else if(certeza == 'n') {
                    printVermelho("CANCELADO!");
                }
                exibir();
                break;
            case 4:
                System.out.print("Email do usuario: ");
                String email = Main.sc.nextLine();
                perfil.visualizarPerfil(email);
                exibir();
                break;
            default:
                exibir();
        }
    }
}
