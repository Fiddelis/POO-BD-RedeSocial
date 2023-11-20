package br.com.inatel.views;

import br.com.inatel.Main;

public class TelaInicial extends Tela {
    public void exibir() {
        System.out.println("------------REDE SOCIAL------------");
        System.out.println("1 - CADASTRO");
        System.out.println("2 - ENTRAR");
        System.out.println("-----------------------------------");

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
        }
    }
}
