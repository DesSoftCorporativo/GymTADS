package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ID_TREINO")
public class Treino implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "DT_INICIO")
    private Date inicio;
    @Column(name = "DT_FIM")
    private Date fim;

    @ManyToOne
    private Personal personal;

    @OneToOne(mappedBy = "treino")
    private Aluno aluno;

    @ElementCollection
    @CollectionTable(name = "TB_SERIE", joinColumns = @JoinColumn(name = "ID_USUARIO"))
    @Column(name = "SERIES")
    private List<Serie> series = new ArrayList<>();

    public Treino() {
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Treino{" +
                "id=" + id +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", personal=" + personal +
                ", aluno=" + aluno +
                ", series=" + series +
                '}';
    }
}
