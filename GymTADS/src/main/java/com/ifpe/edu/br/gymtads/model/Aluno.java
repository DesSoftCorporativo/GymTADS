package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ALUNO")
@DiscriminatorValue(value = "A")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
public class Aluno extends Usuario {

    @ManyToOne
    @JoinColumn(name = "ID_PERSONAL", referencedColumnName = "ID_USUARIO")
    private Personal personal;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ID_TREINO", referencedColumnName = "ID")
    private Treino treino;

    public Aluno() {
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
        this.personal.addAluno(this);
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
        this.treino.setAluno(this);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "personal=" + personal +
                ", treino=" + treino +
                '}';
    }
}
