package br.com.inatel.models;

public class Amigos {
    private String usuarioEmail;
    private String usuarioEmail1;

    public Amigos(String usuarioEmail, String usuarioEmail1) {
        this.usuarioEmail = usuarioEmail;
        this.usuarioEmail1 = usuarioEmail1;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public String getUsuarioEmail1() {
        return usuarioEmail1;
    }
}
