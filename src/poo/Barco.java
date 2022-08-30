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
public class Barco {

    String tipo;
    String cor;
    String nome;
    int numMotores;
void imprimeDadosBarco(){
        System.out.println("-----------Barco----------");
        System.out.println("cor:" + cor);
        System.out.println("Nome: " + nome);
        System.out.println("tipo: " +  tipo);
        System.out.println("Numero de motores : " + numMotores);

    
    
    
    
}
    public String getTipo() {
        return tipo;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public String getCor() {
        return cor;

    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumMotores() {
        return numMotores;

    }

    public void setNumMotes(String nome) {
        this.numMotores = numMotores;

    }

}
