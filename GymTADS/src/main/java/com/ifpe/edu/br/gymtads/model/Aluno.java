/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.Entity;

/**
 *
 * @author gabri
 */

@Entity

public class Aluno extends Usuario{
    private Personal personal;
    private Treino treino;   

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }
    
}
