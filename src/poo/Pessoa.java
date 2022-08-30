/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author caio.collet
 */
public class Pessoa {

    String nome;
    String corDoCabelo;
    String bioTipo;
    int idade;

    void imprimeDadosPessoa(){
        System.out.println("-----------Pessoa----------");
        System.out.println("cor:" + corDoCabelo);
        System.out.println("Nome: " + nome);
        System.out.println("Biotipo: " + bioTipo);
        System.out.println("idade: " + idade);

    }
    
    
    
    
    
    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getCorDoCabelo() {
        return corDoCabelo;

    }

    public void setCorDoCabelo(String CorDoCabelo) {
        this.corDoCabelo = corDoCabelo;

    }

    public String getBioTipo() {
        return bioTipo;

    }

    public void setCor(String cor) {
        this.bioTipo = bioTipo;

    }

    public int getIdade() {
        return idade;

    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

}
