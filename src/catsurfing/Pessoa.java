/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catsurfing;

/**
 *
 * @author GCL
 */
public abstract class Pessoa {
    
    protected String nome;
    protected String endereco;
    protected boolean possuirGatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPossuirGatos() {
        return possuirGatos;
    }

    public void setPossuirGatos(boolean possuirGatos) {
        this.possuirGatos = possuirGatos;
    }
    
    
    
}
