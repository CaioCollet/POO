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
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Carro meuCarro = new Carro();

        meuCarro.setCor("Preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("Aja-4307");
        meuCarro.setTipo("gol");

        Pessoa umaPessoa = new Pessoa();
        umaPessoa.setNome("caio");
        umaPessoa.setCorDoCabelo("preto");
        umaPessoa.setBioTipo("magro");
        umaPessoa.setIdade(27);

        