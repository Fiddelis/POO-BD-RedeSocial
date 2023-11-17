package br.com.inatel.views;

import br.com.inatel.Main;
import br.com.inatel.controllers.DAO.LoginController;
import br.com.inatel.controllers.PostagemController;
import br.com.inatel.models.Postagem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {
    PostagemController postagem = new PostagemController();

    public void entrar() {

        System.out.println("-------REDE SOCIAL-------");
        System.out.println("1 - REGISTRE-SE");
        System.out.println("2 - ENTRAR");
        System.out.println("-------------------------");

        LoginController login = new LoginController();
        switch (Main.sc.nextInt()) {
            case 1:
                String nomeLogin = Main.sc.nextLine();
                String senhaLogin = Main.sc.nextLine();
                login.registro(nomeLogin, senhaLogin);
                break;
            case 2:
                login.entrar();
        }

        Main.sc.close();
    }

    public void inicial() {
        System.out.println("1 - Ultimas Postagens");
        System.out.println("2 - Fazer uma Publicação");
        System.out.println("3 - Lista de Usuarios");
        System.out.println("4 - Adicionar Amigo");

        switch (Main.sc.nextInt()) {
            case 1:
                ArrayList<Postagem> listaPostagem = new ArrayList<>();
                for(Postagem p : postagem.getPostagens()) {
                    System.out.println(p);
                }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
