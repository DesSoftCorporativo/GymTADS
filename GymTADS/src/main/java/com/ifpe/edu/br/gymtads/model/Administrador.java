package com.ifpe.edu.br.gymtads.model;

public class Administrador extends Usuario{

    private String matricula;
    private String senha;

    public Administrador() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
