package br.com.inatel.views;

import br.com.inatel.Main;

public class TelaInicial extends Tela {
    public void exibir() {
        System.out.println();
        printAmarelo("------------REDE SOCIAL------------");
        System.out.println();
        printAmarelo("1");
        System.out.println(" CADASTRAR");
        printAmarelo("2");
        System.out.println(" ENTRAR");
        printAmarelo("-----------------------------------");
        System.out.println();

        switch (Main.sc.nextInt()) {
            case 1:
                Main.sc.nextLine();
                TelaCadastro telaCadastro = new TelaCadastro();
                telaCadastro.exibir();
                break;
            case 2:
                Main.sc.nextLine();
                TelaLogin telaLogin = new TelaLogin();
                telaLogin.exibir();
                break;
            default:
                exibir();
        }
    }
}
