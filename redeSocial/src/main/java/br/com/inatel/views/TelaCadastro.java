package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.UsuarioController;

public class TelaCadastro extends Tela {
    public void exibir() {
        String nomeCadastro, emailCadastro, senhaCadastro, dataNascimentoCadastro;
        UsuarioController login = new UsuarioController();
        boolean verificado;

        System.out.println();
        printAmarelo("------------CADASTR0------------");
        System.out.println();
        System.out.print("Nome: ");
        nomeCadastro = Main.sc.nextLine();
        System.out.print("Email: ");
        emailCadastro = Main.sc.nextLine();
        System.out.print("Senha: ");
        senhaCadastro = Main.sc.nextLine();
        System.out.print("Data de Nascimento: ");
        dataNascimentoCadastro = Main.sc.nextLine();

        verificado = login.criarUsuario(nomeCadastro, emailCadastro, senhaCadastro, dataNascimentoCadastro);

        if(verificado) {
            printVerde("CONTA REGISTRADA COM SUCESSO!");
            emailUsuario = emailCadastro;
            TelaUsuario telaUsuario = new TelaUsuario();
            telaUsuario.exibir();
        } else {
            printVermelho("CONTA EXISTENTE.");
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.exibir();
        }
    }
}
