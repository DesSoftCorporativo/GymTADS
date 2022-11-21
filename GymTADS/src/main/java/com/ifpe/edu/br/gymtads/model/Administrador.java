/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "TB_PERSONAL")
@DiscriminatorValue(value = "d")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
public class Administrador extends Usuario implements Serializable {
    
    @Column(name = "TXT_MATRICULA")
    private String matricula;
    
    @Column(name = "TXT_SENHA")
    private String senha;
    
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
        StringBuilder sb = new StringBuilder("exemplo.jpa.Administrador[ ");
        sb.append(this.id);
        sb.append(", ");
        sb.append(super.toString());
        sb.append(", ");
        sb.append(matricula);        
        sb.append(" ]");
        
        return sb.toString();
    }
    
}
