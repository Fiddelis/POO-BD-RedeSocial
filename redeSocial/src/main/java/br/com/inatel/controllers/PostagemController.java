package br.com.inatel.controllers;

import br.com.inatel.controllers.DAO.PostagemDAO;
import br.com.inatel.models.Postagem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PostagemController {
        PostagemDAO postagemDAO = new PostagemDAO();
    public void exibirPostagens() {
        for (Postagem p : postagemDAO.selectUltimasPostagens()) {
            System.out.println(p);
        }
    }

    public void setPostagem(String conteudo, String emailUsuario) {
        LocalDate dataAgora = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String dataFormatada = dataAgora.format(formatter);

        Postagem postagemUsuario = new Postagem(dataFormatada, conteudo, emailUsuario);
        postagemDAO.insertPostagem(postagemUsuario);
    }
}
