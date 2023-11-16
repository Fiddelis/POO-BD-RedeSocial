package br.com.inatel.models;

/**
 *
 * @author Fidelis
 */
public class Perfil {
    private String descricao;
    private String localizacao;

    public Perfil(String descricao, String localizacao) {
        this.descricao = descricao;
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
