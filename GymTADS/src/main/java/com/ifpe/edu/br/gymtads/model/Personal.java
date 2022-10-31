/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.edu.br.gymtads.model;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author gabri
 */

public class Personal extends Usuario{

    List<Aluno> alunos = new ArrayList<>();
    private String senha;

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
    
    
}
