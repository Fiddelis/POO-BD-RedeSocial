package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.LoginController;

public class TelaLogin extends Tela {
    public void exibir() {
        String emailLogin, senhaLogin;
        boolean verificado = false;
        LoginController login = new LoginController();

        System.out.println("------------ENTRAR------------");
        System.out.print("Email: ");
        emailLogin = Main.sc.nextLine();
        System.out.print("Senha: ");
        senhaLogin = Main.sc.nextLine();

        verificado = login.entrar(emailLogin, senhaLogin);

        if(verificado) {
            System.out.println("ENTROU COM SUCESSO!");
            TelaUsuario telaUsuario = new TelaUsuario();
            emailUsuario = emailLogin;
            telaUsuario.exibir();
        } else {
            System.out.println("EMAIL OU SENHA INCORRETA.");
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.exibir();
        }
    }
}
