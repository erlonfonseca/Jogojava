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
import javax.swing.JOptionPane;
public class StartGame {
    public static void main(String[] args) {
        Personagem player = new Personagem();
        Personagem inimigo= new Personagem();
        inimigo.nome= "Rafael";
        inimigo.forca= 20;
        inimigo.defesa = 50;
        inimigo.vida= 75;
        int resposta=0;
        while(resposta!= 1){
        player.nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " +player.nome + "?");
        if (resposta == JOptionPane.YES_OPTION) {
// verifica se o usuário clicou no botão YES
JOptionPane.showMessageDialog(null, "Seu nome é " + player.nome);
resposta =1;
} else {
JOptionPane.showMessageDialog(null, "Seu nome não é " + player.nome);
resposta=0;
     }
    }
        JOptionPane.showMessageDialog(null, "você possui  " + "\nforça: "
                +player.forca +"\n"+"vida: "+player.vida+"\ndefesa: "+player.defesa);
        
        player.lutar(player,inimigo);
   }
}
