package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class Serie implements Serializable {

    @Column(name = "TXT_EQUIPAMENTO", nullable = false)
    private String equipamento;
    
    @Column(name = "TXT_REPETICOES", nullable = false)
    private String repedicoes;
    
    @Column(name = "TXT_OBSERVACOES")
    private String observacao;
    
    @ManyToOne
    @JoinColumn(name = "ID_TREINO", referencedColumnName = "ID")
    private Treino treino;

    public Serie() {
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getRepedicoes() {
        return repedicoes;
    }

    public void setRepedicoes(String repedicoes) {
        this.repedicoes = repedicoes;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Treino getTreino() {
        return treino;
    }

    public void addTreino(Treino treino) {
        this.treino = treino;
        this.treino.addSerie(this);
    }

    

    @Override
    public String toString() {
        return "Serie{" +
                "equipamento='" + equipamento + '\'' +
                ", repedicoes='" + repedicoes + '\'' +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}