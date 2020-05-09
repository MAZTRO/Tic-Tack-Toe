/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JFrame;

/**
 *
 * @author Jonatan Mazo
 * @author Giovanni Perez
 * @author Yulieth Zuluaga
 * @author Diego Alarcon
 * @author Cristian Gomez
 *
 */
public class Triky_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tricky game = new Tricky();
        
        game.setVisible(true);
        game.setTitle("Tic Tac Toe");
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
