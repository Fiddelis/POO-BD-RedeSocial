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


    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return "Descricao: " + descricao + '\n' +
                "Localizacao: " + localizacao;
    }
}
