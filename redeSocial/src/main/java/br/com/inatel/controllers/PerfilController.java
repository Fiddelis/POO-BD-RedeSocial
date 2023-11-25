package br.com.inatel.controllers;

import br.com.inatel.models.DAO.PerfilDAO;
import br.com.inatel.models.entidades.Perfil;

public class PerfilController {
    PerfilDAO perfilDAO = new PerfilDAO();

    public void criarPerfil(String emailUsuario, String descricao, String localizacao) {
            if (!existe(emailUsuario)) {
                Perfil perfil = new Perfil(descricao, localizacao);
                perfilDAO.insertPerfil(perfil, emailUsuario);
                System.out.println("Perfil criado com Sucesso!");
            } else {
                System.out.println("Perfil ja criado!");
            }
    }

    public void visualizarPerfil(String emailUsuario) {
        if (existe(emailUsuario)) {
            System.out.println(perfilDAO.selectPerfil(emailUsuario));
        }
    }

    public void atualizarPerfil(String emailUsuario, String descricao, String localizacao) {
        if (existe(emailUsuario)) {
            Perfil perfil = new Perfil(descricao, localizacao);
            perfilDAO.updatePerfil(perfil, emailUsuario);
            System.out.println("Perfil atualizado com Sucesso!");
        } else {
            System.out.println("Perfil não existe");
        }
    }

    public void deletarPerfil(String emailUsuario) {
        if (existe(emailUsuario)) {
            perfilDAO.deletePerfil(emailUsuario);
            System.out.println("Perfil deletado com Sucesso!");
        }
    }
    private boolean existe(String emailUsuario) {
        Perfil perfil = perfilDAO.selectPerfil(emailUsuario);
        return perfil != null;
    }
}
