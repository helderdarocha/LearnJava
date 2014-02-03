/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argonavis.serializationexamples;

import java.io.ObjectStreamException;

/**
 *
 * @author helderdarocha
 */
public class Pessoa implements java.io.Serializable {
    private String nome;
    private long idade;
    private Endereco endereco;
    private Ingresso ingresso;
    private String dadosIngresso;
    private String profissao;
    
    private static final long serialVersionUID = 1;

    public Pessoa() {}
    
    public Pessoa(String nome, long idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", ingresso=" + ingresso + ", profissao=" + profissao +'}';
    }
    
    
}
