/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ifpe.edu.br.gymtads;

import com.ifpe.edu.br.gymtads.model.Administrador;
import com.ifpe.edu.br.gymtads.model.Aluno;
import com.ifpe.edu.br.gymtads.model.Endereco;
import com.ifpe.edu.br.gymtads.model.Exercicio;
import com.ifpe.edu.br.gymtads.model.Personal;
import com.ifpe.edu.br.gymtads.model.Treino;
import com.ifpe.edu.br.gymtads.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author angel
 */
public class GymTADS {

private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gymtadsPU");
    
    public static void main(String[] args) throws IOException {
        preencher();
//        consultaAluno();
//        consultaPersonal();
//        consultaTreino();
//        consultaExercicio();
//        consultaAdministrador();
    }

    private static void persistir(Personal p, Exercicio e1, Exercicio e2, Exercicio e3, Treino t3, Treino t2, Treino t1, Aluno a1, Aluno a2, Aluno a3, Administrador d) throws IOException {
        EntityManager em = null;
        EntityTransaction et;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(d);
            em.persist(p);
            em.persist(e1);
            em.persist(e2);
            em.persist(e3);
            em.persist(t3);
            em.persist(t2);
            em.persist(t1);
            em.persist(a1);
            em.persist(a2);
            em.persist(a3);
            et.commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    private static void consultaAluno() {
        
    }

    private static void consultaPersonal() {
        
    }

    private static void consultaTreino() {
        
    }

    private static void consultaExercicio() {
        
    }
    
    private static void consultaAdministrador() {
        
    }
    
    private static void preencher() throws IOException {
        Aluno a1 = new Aluno();
        a1.setNome("Miguel");
        a1.setSobrenome("Angelo");
        a1.setCpf("31232132132");
        a1.addTelefone("081955667788");
        preencherEndereco(a1);
        
        Aluno a2 = new Aluno();
        a2.setNome("Raphael");
        a2.setSobrenome("Alcantara");
        a2.setCpf("78978978978");
        a2.addTelefone("081933445566");
        preencherEndereco(a2);
        
        Aluno a3 = new Aluno();
        a3.setNome("Willian");
        a3.setSobrenome("Santos");
        a3.setCpf("34534534534");
        a3.addTelefone("081933445566");
        preencherEndereco(a3);
        
        Personal p = new Personal();
        p.setNome("Joao");
        p.setSobrenome("Gabriel");
        p.setCpf("12312312312");
        p.addTelefone("081911223344");
        p.setMatricula("123123");
        p.setSenha("111222333");
        preencherEndereco(p);
        
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
        
        Treino t1 = new Treino();
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
        t1.setDescricao("Treino iniciante Miguel");
        t1.setPersonal(p);
        t1.setExercicio(e1);
        t1.setExercicio(e2);
        t1.setExercicio(e3);
        
        Treino t2 = new Treino();
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
        t2.setDescricao("Treino iniciante Raphael");
        t2.setPersonal(p);
        t2.setExercicio(e1);
        t2.setExercicio(e2);
        t2.setExercicio(e3);
        
        Treino t3 = new Treino();
        Calendar it3 = Calendar.getInstance();
        it3.set(Calendar.YEAR, 2022);
        it3.set(Calendar.MONTH, Calendar.OCTOBER);
        it3.set(Calendar.DAY_OF_MONTH, 25);
        t3.setInicio(it2.getTime());
        
        Calendar ft3 = Calendar.getInstance();
        ft3.set(Calendar.YEAR, 2022);
        ft3.set(Calendar.MONTH, Calendar.NOVEMBER);
        ft3.set(Calendar.DAY_OF_MONTH, 25);
        t3.setFim(ft2.getTime());
        t3.setDescricao("Treino iniciante Willian");
        t3.setPersonal(p);
        t3.setExercicio(e1);
        t3.setExercicio(e2);
        t3.setExercicio(e3);
        
        a1.setTreino(t1);
        a2.setTreino(t2);
        a3.setTreino(t3);
        
        Administrador d = new Administrador();
        d.setNome("Marcos");
        d.setSobrenome("André");
        d.setCpf("76576576565");
        d.addTelefone("081911223344");
        d.setMatricula("528528");
        d.setSenha("111222333");
        preencherEndereco(d);
        
        persistir(p, e1, e2, e3, t3, t2, t1, a1, a2, a3, d);
    }
    
    public static void preencherEndereco(Usuario u){
        Endereco e = new Endereco();
        e.setCep("12123123");
        e.setCidade("Recife");
        e.setBairro("Varzea");
        e.setnCasa("142");
        u.setEndereco(e);
    }

}
