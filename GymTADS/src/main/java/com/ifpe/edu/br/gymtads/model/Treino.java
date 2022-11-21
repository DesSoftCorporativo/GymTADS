    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "TB_TREINO")
public class Treino implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DT_INICIO", nullable = true)
    protected Date inicio;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DT_fim", nullable = true)
    protected Date fim;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PERSONAL", referencedColumnName = "ID")
    private Personal personal;

    @OneToOne(mappedBy = "treino", optional = false, fetch = FetchType.LAZY)
    private Aluno aluno;
    
    @Column(name = "TXT_DESCRICAO")
    private String descricao;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TB_TREINO_EXERCICIOS", joinColumns = {
        @JoinColumn(name = "ID_TREINO")}, inverseJoinColumns = {
            @JoinColumn(name = "ID_EXERCICIO")})
    private List<Exercicio> exercicios;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        this.personal.setTreino(this);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicio(Exercicio exercicio) {
        if(this.exercicios == null){
            this.exercicios = new ArrayList<>();
        }
        
        this.exercicios.add(exercicio);
        exercicio.setTreino(this);
    }
    
}
