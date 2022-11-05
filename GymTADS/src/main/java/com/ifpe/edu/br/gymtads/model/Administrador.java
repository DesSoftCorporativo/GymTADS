package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ADMINISTRADOR")
@DiscriminatorValue(value = "A")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
public class Administrador extends Usuario{

    @Column(name = "TXT_MATRICULA")
    private String matricula;
    @Column(name = "TXT_SENHA")
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

    @Override
    public String toString() {
        return "Administrador{" +
                "matricula='" + matricula + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
