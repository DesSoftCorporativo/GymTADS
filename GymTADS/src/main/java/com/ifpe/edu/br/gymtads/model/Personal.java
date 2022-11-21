/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "TB_PERSONAL")
@DiscriminatorValue(value = "p")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
public class Personal extends Usuario implements Serializable {
    
    @OneToMany(mappedBy = "personal")
    private List<Treino> treinos;
    
    @Column(name = "TXT_SENHA", nullable = false)
    private String senha;

    @Column(name = "TXT_MATRICULA", nullable = false)
    private String matricula;

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreino(Treino treino) {
        if(this.treinos == null){
            this.treinos = new ArrayList<>();
        }
        
        this.treinos.add(treino);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("exemplo.jpa.Personal[ ");
        sb.append(this.id);
        sb.append(", ");
        sb.append(super.toString());
        sb.append(", ");
        sb.append(matricula);        
        sb.append(" ]");
        
        return sb.toString();
    }
    
}
