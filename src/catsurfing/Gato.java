/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catsurfing;

import java.util.ArrayList;

/**
 *
 * @author GCL
 */
public class Gato {
    
    private String nomeTemporario;
    private String sexo;
    private String cor;
    private boolean castrado;
    private boolean vacinado;
    private boolean vermifugado;
    private boolean Saudavel;
    private boolean adotado;
    private ArrayList<Doenca> doencas;
    private Pessoa responsavel;

    public String getNomeTemporario() {
        return nomeTemporario;
    }

    public void setNomeTemporario(String nomeTemporario) {
        this.nomeTemporario = nomeTemporario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public boolean isVermifugado() {
        return vermifugado;
    }

    public void setVermifugado(boolean vermifugado) {
        this.vermifugado = vermifugado;
    }

    public boolean isSaudavel() {
        setSaudavel();
        return Saudavel;
    }

    public void setSaudavel() {
        if(this.doencas.size()==0){
        this.Saudavel = true;
        }
    }

    public ArrayList<Doenca> getDoencas() {
        return doencas;
    }

    public void setDoencas(ArrayList<Doenca> doencas) {
        this.doencas = doencas;
    }
    
    public void setDoenca(Doenca doenca){
        this.doencas.add(doenca);
    }

    public boolean isAdotado() {
        setAdotado();
        return adotado;
    }

    public boolean setAdotado() {
        if(this.getResponsavel()!=null){
            this.adotado = true;
            return true;
        }else{
            this.adotado = false;
            return false;
        }
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }
    
    public boolean getAdotavelPorComGatos(){
        int cont = 0;
        for (Doenca doenca : doencas) {
            if(doenca.isContagiosa()){
                cont++;
            }else{
                if(doenca.isTemCura())
                    cont++;
            }
        }
        if(cont == 0){
            return true;
        }
        return false;
    }

    public boolean setResponsavel(Pessoa responsavel) {
        if(responsavel.isPossuirGatos()){
            if(responsavel instanceof PessoaFisica){
                if(((PessoaFisica) responsavel).isCasaTelada() && this.getAdotavelPorComGatos()){
                    this.responsavel = responsavel;
                    return true;
                }return false;
            }else{
                if(responsavel instanceof PessoaJuridica){
                    if(this.isCastrado() && this.getAdotavelPorComGatos()){
                       this.responsavel = responsavel;
                       return true;
                    }
                }return false;
            }
        }else{if(responsavel instanceof PessoaFisica){
                if(((PessoaFisica) responsavel).isCasaTelada()){
                    this.responsavel = responsavel;
                    return true;
                }return false;
            }else{
                if(responsavel instanceof PessoaJuridica){
                    if(this.isCastrado()){
                        this.responsavel = responsavel;
                        return true;
                    }
                }return false;
            }
        }
    }
    
    
    
   
}
