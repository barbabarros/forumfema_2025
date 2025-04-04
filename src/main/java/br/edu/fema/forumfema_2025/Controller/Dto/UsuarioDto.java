package br.edu.fema.forumfema_2025.Controller.Dto;

public class UsuarioDto {

    private String nome;
    private String email;

    public UsuarioDto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public UsuarioDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
