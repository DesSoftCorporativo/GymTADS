/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ifpe.edu.br.gymtads;

import com.ifpe.edu.br.gymtads.model.Aluno;
import com.ifpe.edu.br.gymtads.model.Endereco;
import com.ifpe.edu.br.gymtads.model.Exercicio;
import com.ifpe.edu.br.gymtads.model.Personal;
import com.ifpe.edu.br.gymtads.model.Treino;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.Calendar;

/**
 *
 * @author angel
 */
public class GymTADS {

    public static void main(String[] args) {
        
        //endereços
        Endereco eHugo = new Endereco();
        eHugo.setCep("12123123");
        eHugo.setCidade("Paulista");
        eHugo.setBairro("Nobre");
        eHugo.setnCasa("142");
        
        Endereco eMiguel = new Endereco();
        eMiguel.setCep("23234234");
        eMiguel.setCidade("Paulista");
        eMiguel.setBairro("Maranguape 2");
        eMiguel.setnCasa("201");
        
        Endereco eJuan = new Endereco();
        eJuan.setCep("45456456");
        eJuan.setCidade("Paulista");
        eJuan.setBairro("Maranguape 2");
        eJuan.setnCasa("114");
        
        //personal
        Personal p = new Personal();
        p.setNome("Hugo");
        p.setSobrenome("Henrique");
        p.setCpf("12312312312");
        p.setEndereco(eHugo);
        p.addTelefone("081911223344");
        p.setMatricula("123123");
        p.setSenha("111222333");
        
        
        //alunos
        Aluno a1 = new Aluno();
        a1.setNome("Miguel");
        a1.setSobrenome("Angelo");
        a1.setCpf("31232132132");
        a1.setEndereco(eMiguel);
        a1.addTelefone("081973358131");
        
        Aluno a2 = new Aluno();
        a2.setNome("Juan");
        a2.setSobrenome("Henrique");
        a2.setCpf("78978978978");
        a2.setEndereco(eJuan);
        a2.addTelefone("081933445566");
        
        //treino 1
        Treino t1 = new Treino();
        
        //inicio e fim de treino
        Calendar it1 = Calendar.getInstance();
        it1.set(Calendar.YEAR, 2022);
        it1.set(Calendar.MONTH, Calendar.NOVEMBER);
        it1.set(Calendar.DAY_OF_MONTH, 19);
        t1.setInicio(it1.getTime());
        
        Calendar ft1 = Calendar.getInstance();
        ft1.set(Calendar.YEAR, 2022);
        ft1.set(Calendar.MONTH, Calendar.DECEMBER);
        ft1.set(Calendar.DAY_OF_MONTH, 20);
        t1.setFim(ft1.getTime());
        
        t1.setDescricao("Treino iniciante 1");
        
        //treino 2
        Treino t2 = new Treino();
        
        //inicio e fim de treino
        Calendar it2 = Calendar.getInstance();
        it2.set(Calendar.YEAR, 2022);
        it2.set(Calendar.MONTH, Calendar.OCTOBER);
        it2.set(Calendar.DAY_OF_MONTH, 28);
        t2.setInicio(it2.getTime());
        
        Calendar ft2 = Calendar.getInstance();
        ft2.set(Calendar.YEAR, 2022);
        ft2.set(Calendar.MONTH, Calendar.NOVEMBER);
        ft2.set(Calendar.DAY_OF_MONTH, 29);
        t2.setFim(ft2.getTime());
        
        t2.setDescricao("Treino iniciante 2");
        
        //exercicios
        Exercicio e1 = new Exercicio();
        e1.setNome("Supíno");
        e1.setObservacao("Exercicio feito com barra");
        e1.setQuantidadeSerieRepeticao("4x15");
        
        Exercicio e2 = new Exercicio();
        e2.setNome("Supíno Inclinado");
        e2.setObservacao("Exercicio feito com halter no banco inclinado");
        e2.setQuantidadeSerieRepeticao("4x15");
        
        Exercicio e3 = new Exercicio();
        e3.setNome("Crucifixo");
        e3.setObservacao("Exercicio feito na máquina de crucifixo");
        e3.setQuantidadeSerieRepeticao("4x15");
        
        //sets de relação
        t1.setPersonal(p);
        t2.setPersonal(p);
        t1.setExercicio(e1);
        t1.setExercicio(e2);
        t1.setExercicio(e3);
        t2.setExercicio(e1);
        t2.setExercicio(e2);
        t2.setExercicio(e3);
        a1.setTreino(t1);
        a2.setTreino(t2);
        
        //persistência
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        
        
        try {
            emf = Persistence.createEntityManagerFactory("gymtadsPU");
            em = emf.createEntityManager();
            et = em.getTransaction();
            
            et.begin();
            em.persist(p);
            em.persist(e1);
            em.persist(e2);
            em.persist(e3);
            em.persist(t2);
            em.persist(t1);
            em.persist(a1);
            em.persist(a2);
            et.commit();
        } catch (Exception e) {
        }
    }
}
