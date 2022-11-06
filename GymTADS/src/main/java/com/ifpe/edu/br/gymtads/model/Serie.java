package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Serie implements Serializable {

    @Column(name = "TXT_EQUIPAMENTO", nullable = false)
    private String equipamento;
    @Column(name = "TXT_REPETICOES", nullable = false)
    private String repedicoes;
    @Column(name = "TXT_OBSERVACOES")
    private String observacao;

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

    @Override
    public String toString() {
        return "Serie{" +
                "equipamento='" + equipamento + '\'' +
                ", repedicoes='" + repedicoes + '\'' +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}