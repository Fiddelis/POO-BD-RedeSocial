package br.com.inatel.controllers;

import br.com.inatel.models.DAO.PostagemDAO;
import br.com.inatel.models.entidades.Postagem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PostagemController {
        PostagemDAO postagemDAO = new PostagemDAO();
    public ArrayList<Postagem> listaPostagens() {
        ArrayList<Postagem> lista = postagemDAO.selectUltimasPostagens();
        return lista;
    }

    public void criarPostagem(String conteudo, String emailUsuario) {
        LocalDate dataAgora = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String dataFormatada = dataAgora.format(formatter);

        Postagem postagemUsuario = new Postagem(dataFormatada, conteudo, emailUsuario);
        postagemDAO.insertPostagem(postagemUsuario);
    }
}
