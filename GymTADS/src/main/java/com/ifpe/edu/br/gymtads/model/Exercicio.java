/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "TB_EXERCICIO")
public class Exercicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "TXT_EXERCICIO")
    private String nome;
    
    @Column(name = "TXT_OBSERVACAO")
    private String observacao;
    
    @Column(name = "QNT_SERIE_REPETICAO")
    private String quantidadeSerieRepeticao;
    
    @ManyToMany(mappedBy = "exercicios")
    private List<Treino> treinos; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getQuantidadeSerieRepeticao() {
        return quantidadeSerieRepeticao;
    }

    public void setQuantidadeSerieRepeticao(String quantidadeSerieRepeticao) {
        this.quantidadeSerieRepeticao = quantidadeSerieRepeticao;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreino(Treino treino) {
        if(this.treinos == null){
            this.treinos = new ArrayList<>();
        }
        
        this.treinos.add(treino);
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Exercicio)) {
            return false;
        }

        Exercicio other = (Exercicio) object;

        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("exemplo.jpa.Exercicio[ ");
        sb.append(this.id);
        sb.append(", ");
        sb.append(this.nome);
        sb.append(", ");
        sb.append(this.observacao);
        sb.append(", ");
        sb.append(this.quantidadeSerieRepeticao);
        sb.append(", ");
        
        for (Treino treino : this.treinos) {
            sb.append(", ");
            sb.append(treino.getId());
        }
        
        sb.append(" ]");

        return sb.toString();
    }
    
}
