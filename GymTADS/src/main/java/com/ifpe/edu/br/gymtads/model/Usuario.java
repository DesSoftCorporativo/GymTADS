package com.ifpe.edu.br.gymtads.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TB_USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DISC_USUARIO",
        discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @Column(name = "TXT_NAME")
    protected String nome;
    @Column(name = "TXT_SOBRENOME")
    protected String sobrenome;
    @Column(name = "TXT_CPF")
    protected String cpf;
    @Column(name = "TXT_ENDERECO")
    protected String endereco;
    @ElementCollection
    @CollectionTable(name = "TB_TELEFONE", joinColumns = @JoinColumn(name = "ID_USUARIO"))
    @Column(name = "TXT_NUM_TELEFONE")
    protected Collection<String> telefones;
    @Column(name = "DT_NAME")
    protected Date nascimento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Collection<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(Collection<String> telefones) {
        this.telefones = telefones;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefones=" + telefones +
                ", nascimento=" + nascimento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nome, usuario.nome) && Objects.equals(sobrenome, usuario.sobrenome) && Objects.equals(cpf, usuario.cpf) && Objects.equals(endereco, usuario.endereco) && Objects.equals(telefones, usuario.telefones) && Objects.equals(nascimento, usuario.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sobrenome, cpf, endereco, telefones, nascimento);
    }
}
