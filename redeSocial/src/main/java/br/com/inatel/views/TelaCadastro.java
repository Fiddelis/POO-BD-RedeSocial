package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.LoginController;

public class TelaCadastro extends Tela {
    public void exibir() {
        String nomeCadastro, emailCadastro, senhaCadastro, dataNascimentoCadastro;
        LoginController login = new LoginController();
        boolean verificado;

        System.out.println("------------CADASTR0------------");
        System.out.print("Nome: ");
        nomeCadastro = Main.sc.nextLine();
        System.out.print("Email: ");
        emailCadastro = Main.sc.nextLine();
        System.out.print("Senha: ");
        senhaCadastro = Main.sc.nextLine();
        System.out.print("Data de Nascimento: ");
        dataNascimentoCadastro = Main.sc.nextLine();

        verificado = login.cadastro(nomeCadastro, emailCadastro, senhaCadastro, dataNascimentoCadastro);

        if(verificado) {
            System.out.println("CONTA REGISTRADA COM SUCESSO!");
            emailUsuario = emailCadastro;
            TelaUsuario telaUsuario = new TelaUsuario();
            telaUsuario.exibir();
        } else {
            System.out.println("CONTA EXISTENTE.");
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.exibir();
        }
    }
}
