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

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
}
