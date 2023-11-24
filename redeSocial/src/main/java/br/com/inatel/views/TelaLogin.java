package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.UsuarioController;

public class TelaLogin extends Tela {
    public void exibir() {
        String emailLogin, senhaLogin;
        boolean verificado = false;
        UsuarioController login = new UsuarioController();

        System.out.println();
        printAmarelo("------------ENTRAR------------");
        System.out.println();
        System.out.print("Email: ");
        emailLogin = Main.sc.nextLine();
        System.out.print("Senha: ");
        senhaLogin = Main.sc.nextLine();

        verificado = login.loginUsuario(emailLogin, senhaLogin);

        if(verificado) {
            printVerde("ENTROU COM SUCESSO!");
            TelaUsuario telaUsuario = new TelaUsuario();
            emailUsuario = emailLogin;
            telaUsuario.exibir();
        } else {
            printVermelho("EMAIL OU SENHA INCORRETA.");
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.exibir();
        }
    }
}
