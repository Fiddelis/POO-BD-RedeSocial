package br.com.inatel.controllers;

import br.com.inatel.controllers.DAO.PerfilDAO;
import br.com.inatel.models.Perfil;

public class PerfilController {
    PerfilDAO perfilDAO = new PerfilDAO();
    Perfil perfil;
    public void criarPerfil(String emailUsuario, String descricao, String localizacao) {
        Perfil perfil = new Perfil(descricao, localizacao);
        perfilDAO.insertPerfil(perfil, emailUsuario);
    }

    public void visualizarPerfil(String email) {
        System.out.println(perfilDAO.selectPerfil(email));
    }
}
