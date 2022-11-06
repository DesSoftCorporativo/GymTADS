package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_PERSONAL")
@DiscriminatorValue(value = "P")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
public class Personal extends Usuario {

    @OneToMany //todo precisa rever esse ponto
    @Column(name = "LIST_ALUNOS")
    private List<Aluno> alunos = new ArrayList<>();
    @Column(name = "TXT_SENHA", nullable = false)
    private String senha;

    @Column(name = "TXT_MATRICULA", nullable = false)
    private String matricula;

    @OneToMany //todo precisa rever esse ponto
    @Column(name = "LIST_TREINOS")
    private List<Treino> treinos = new ArrayList<>();

    public Personal() {
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "alunos=" + alunos +
                ", senha='" + senha + '\'' +
                ", matricula='" + matricula + '\'' +
                ", treinos=" + treinos +
                '}';
    }
}
