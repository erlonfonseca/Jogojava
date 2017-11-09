/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo1;

/**
 *
 * @author 201604940045
 */
public class Personagem {
    String nome;
    String Classe;
    int forca= 30;
    int vida=100;
    int defesa=40;

    public void lutar(Personagem X,Personagem Y){
        X.vida-= X.defesa-Y.forca;
}
}