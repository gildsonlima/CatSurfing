/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catsurfing;

import java.util.ArrayList;

/**
 *
 * @author GCL
 */
public class CatSurfing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Doenca doenca = new Doenca();
        doenca.setNome("PIF");
        doenca.setContagiosa(true);
        doenca.setTemCura(true);
        
        Doenca doenca1 = new Doenca();
        doenca1.setNome("FILV/FELV");
        doenca1.setContagiosa(true);
        doenca1.setTemCura(false);
        
        Doenca doenca2 = new Doenca();
        doenca2.setNome("Obesidade");
        doenca2.setContagiosa(false);
        doenca2.setTemCura(true);
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("João");
        pessoaFisica.setCpf("254.254.698-55");
        pessoaFisica.setEndereco("Casa Dele");
        pessoaFisica.setCasaTelada(true);
        pessoaFisica.setIdade(25);
        pessoaFisica.setPossuirGatos(true);
        
        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.setNome("Maria");
        pessoaFisica1.setCpf("254.111.698-55");
        pessoaFisica1.setEndereco("Casa Dela");
        pessoaFisica1.setCasaTelada(false);
        pessoaFisica1.setIdade(19);
        pessoaFisica1.setPossuirGatos(false);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj("15544.5844.5884-0001");
        pessoaJuridica.setEndereco("loja da rua tal");
        pessoaJuridica.setNome("Loja Tal");
        pessoaJuridica.setPossuirGatos(true);
        
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.setCnpj("15544.5844.5884-0001");
        pessoaJuridica1.setEndereco("loja da rua tal");
        pessoaJuridica1.setNome("Loja Tal");
        pessoaJuridica1.setPossuirGatos(false);
        
        ArrayList<Doenca> doencas = new ArrayList<>();
        ArrayList<Doenca> doencas1 = new ArrayList<>();
        ArrayList<Doenca> doencas2 = new ArrayList<>();
        ArrayList<Doenca> doencas3 = new ArrayList<>();
        
        Gato gato = new Gato();
        gato.setNomeTemporario("cat1");
        gato.setCor("Branco e preto");
        gato.setCastrado(false);
        gato.setSexo("M");
        gato.setVacinado(true);
        gato.setVermifugado(true);
        gato.setDoencas(doencas);
        gato.setResponsavel(pessoaFisica);
        
        gato.setDoenca(doenca);
        
        Gato gato1 = new Gato();
        gato1.setNomeTemporario("cat2");
        gato1.setCor("Branco e preto");
        gato1.setCastrado(true);
        gato1.setSexo("M");
        gato1.setVacinado(true);
        gato1.setVermifugado(true);
        gato1.setDoencas(doencas1);
        gato1.setResponsavel(pessoaFisica1);
        
        gato1.setDoenca(doenca1);
        
        Gato gato2 = new Gato();
        gato2.setNomeTemporario("cat3");
        gato2.setCor("Branco e preto");
        gato2.setCastrado(true);
        gato2.setSexo("M");
        gato2.setVacinado(true);
        gato2.setVermifugado(true);
        gato2.setDoencas(doencas1);
        gato2.setResponsavel(pessoaJuridica);
        
        gato2.setDoenca(doenca2);
        
        Gato gato3 = new Gato();
        gato3.setNomeTemporario("cat4");
        gato3.setCor("Branco e preto");
        gato3.setCastrado(true);
        gato3.setSexo("M");
        gato3.setVacinado(true);
        gato3.setVermifugado(true);
        gato3.setDoencas(doencas3);
        gato3.setResponsavel(pessoaJuridica1);
        
        ArrayList<Gato> gatos  = new ArrayList<>();
        
        gatos.add(gato);
        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);
        
        for (Gato gato4 : gatos) {
            System.out.println("Nome temporario do gato "+gato4.getNomeTemporario());
            System.out.println("Gato adotado "+gato4.isAdotado());
            System.out.println("Sexo Gato "+gato4.getSexo());
            System.out.println("Cor do gato "+gato4.getCor());
            if(gato4.isAdotado()){
                System.out.println("Responsavel pelo gato "+gato4.getResponsavel().getNome());
            }else{
                System.out.println("Gato disponivel para adoção");
            }
            System.out.println("Gato castrado "+gato4.isCastrado());
            System.out.println("Gato saudavel "+gato4.isSaudavel());
            System.out.println("Gato vacinado "+gato4.isVacinado());
            System.out.println("Gato vermifugado "+gato4.isVermifugado());
            System.out.println(" ");
            
        }
        
        
    
    }
    
}
