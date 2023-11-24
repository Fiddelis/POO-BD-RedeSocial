package br.com.inatel.models;

public class Postagem {
    private String dataPublicacao;
    private String conteudo;
    private String emailUsuario;

    public Postagem(String dataPublicacao, String conteudo, String emailUsuario) {
        this.dataPublicacao = dataPublicacao;
        this.conteudo = conteudo;
        this.emailUsuario = emailUsuario;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    @Override
    public String toString() {
        return dataPublicacao + " | " + emailUsuario + '\n' +
                "     " + conteudo;
    }
}
