package br.com.inatel.models;

public class Usuario {
    private String nome;
    private String email;
    private String dataNascimento;
    private String senha;

    public Usuario(String nome, String email, String dataNascimento, String senha) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSenha() {
        return senha;
    }
}
