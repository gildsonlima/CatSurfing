/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catsurfing;

/**
 *
 * @author GCL
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private int idade;
    private boolean casaTelada;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isCasaTelada() {
        return casaTelada;
    }

    public void setCasaTelada(boolean casaTelada) {
        this.casaTelada = casaTelada;
    }
    
    
    
}
