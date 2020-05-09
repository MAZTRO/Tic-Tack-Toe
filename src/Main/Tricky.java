/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author Jonatan
 */
public class Tricky extends javax.swing.JFrame{
    String RUTE_SOUND = "audio/sounclick.wav";
    Player new_player_1 = new Player();
    Player new_player_2 = new Player();
    int turn = 1;
    int matrix[][] = new int[3][3];
    int status_id = 1;

    /**
     * Creates new form Tricky
     */
    public Tricky() {
        initComponents();
        setSize(910, 542);
        setLocationRelativeTo(null);
        setVisible(true);
        Btn_restart.setEnabled(false);
        play("audio/ambient.wav");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Btn_bot = new javax.swing.JButton();
        Btn_mult = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Btn_new = new javax.swing.JButton();
        Btn_restart = new javax.swing.JButton();
        grid_01 = new javax.swing.JButton();
        grid_00 = new javax.swing.JButton();
        grid_02 = new javax.swing.JButton();
        grid_11 = new javax.swing.JButton();
        grid_10 = new javax.swing.JButton();
        grid_12 = new javax.swing.JButton();
        grid_21 = new javax.swing.JButton();
        grid_20 = new javax.swing.JButton();
        grid_22 = new javax.swing.JButton();
        display_text = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        display_P1 = new javax.swing.JLabel();
        display_P2 = new javax.swing.JLabel();
        display_turn1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(220, 220, 220));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 3, 0, new java.awt.Color(240, 240, 240)));
        jPanel2.setForeground(java.awt.Color.white);
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 100));
        jPanel2.setLayout(null);

        Btn_bot.setBackground(new java.awt.Color(255, 234, 222));
        Btn_bot.setForeground(new java.awt.Color(50, 50, 50));
        Btn_bot.setText("Bot");
        Btn_bot.setToolTipText("Play with bots");
        Btn_bot.setBorder(null);
        Btn_bot.setMaximumSize(new java.awt.Dimension(60, 32));
        Btn_bot.setMinimumSize(new java.awt.Dimension(60, 32));
        Btn_bot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_botActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_bot);
        Btn_bot.setBounds(150, 15, 150, 35);

        Btn_mult.setBackground(new java.awt.Color(255, 234, 222));
        Btn_mult.setForeground(new java.awt.Color(50, 50, 50));
        Btn_mult.setText("Multiplayer");
        Btn_mult.setToolTipText("Play with other peer");
        Btn_mult.setBorder(null);
        jPanel2.add(Btn_mult);
        Btn_mult.setBounds(600, 15, 150, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Holby.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(410, 2, 60, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 65);

        jPanel4.setBackground(new java.awt.Color(50, 50, 50));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(230, 230, 230)));
        jPanel4.setPreferredSize(new java.awt.Dimension(900, 60));
        jPanel4.setLayout(null);

        Btn_new.setBackground(new java.awt.Color(255, 234, 222));
        Btn_new.setForeground(new java.awt.Color(50, 50, 50));
        Btn_new.setText("New game");
        Btn_new.setBorder(null);
        Btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_newActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_new);
        Btn_new.setBounds(290, 10, 150, 35);

        Btn_restart.setBackground(new java.awt.Color(255, 234, 222));
        Btn_restart.setForeground(new java.awt.Color(50, 50, 50));
        Btn_restart.setText("Restart");
        Btn_restart.setBorder(null);
        Btn_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_restartActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_restart);
        Btn_restart.setBounds(470, 10, 150, 35);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 440, 900, 65);

        grid_01.setBackground(new java.awt.Color(220, 220, 220));
        grid_01.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_01.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/O.png"))); // NOI18N
        grid_01.setEnabled(false);
        grid_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_01ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_01);
        grid_01.setBounds(400, 100, 110, 90);

        grid_00.setBackground(new java.awt.Color(220, 220, 220));
        grid_00.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_00.setEnabled(false);
        grid_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_00ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_00);
        grid_00.setBounds(290, 100, 110, 90);

        grid_02.setBackground(new java.awt.Color(220, 220, 220));
        grid_02.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_02.setEnabled(false);
        grid_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_02ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_02);
        grid_02.setBounds(510, 100, 110, 90);

        grid_11.setBackground(new java.awt.Color(220, 220, 220));
        grid_11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_11.setEnabled(false);
        grid_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_11ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_11);
        grid_11.setBounds(400, 190, 110, 90);

        grid_10.setBackground(new java.awt.Color(220, 220, 220));
        grid_10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_10.setEnabled(false);
        grid_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_10ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_10);
        grid_10.setBounds(290, 190, 110, 90);

        grid_12.setBackground(new java.awt.Color(220, 220, 220));
        grid_12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_12.setEnabled(false);
        grid_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_12ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_12);
        grid_12.setBounds(510, 190, 110, 90);

        grid_21.setBackground(new java.awt.Color(220, 220, 220));
        grid_21.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_21.setEnabled(false);
        grid_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_21ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_21);
        grid_21.setBounds(400, 280, 110, 90);

        grid_20.setBackground(new java.awt.Color(220, 220, 220));
        grid_20.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_20.setEnabled(false);
        grid_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_20ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_20);
        grid_20.setBounds(290, 280, 110, 90);

        grid_22.setBackground(new java.awt.Color(220, 220, 220));
        grid_22.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(219, 204, 204)));
        grid_22.setEnabled(false);
        grid_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid_22ActionPerformed(evt);
            }
        });
        getContentPane().add(grid_22);
        grid_22.setBounds(510, 280, 110, 90);

        display_text.setBackground(new java.awt.Color(227, 227, 227));
        display_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display_text.setText("Next player");
        display_text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(display_text);
        display_text.setBounds(290, 400, 330, 30);

        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player 2:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 220, 190, 30);

        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player 1:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 220, 180, 30);

        display_P1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display_P1.setText(" ");
        display_P1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(50, 50, 50)));
        getContentPane().add(display_P1);
        display_P1.setBounds(50, 190, 180, 30);

        display_P2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display_P2.setText(" ");
        display_P2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(50, 50, 50)));
        getContentPane().add(display_P2);
        display_P2.setBounds(660, 190, 190, 30);

        display_turn1.setBackground(new java.awt.Color(227, 227, 227));
        display_turn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display_turn1.setText("Turn");
        display_turn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(display_turn1);
        display_turn1.setBounds(290, 380, 330, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void grid_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_02ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_02, 0, 2);
        print_array();
        logic_win();
        
    }//GEN-LAST:event_grid_02ActionPerformed

    private void Btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_newActionPerformed
        // TODO add your handling code here:
        String name_player_1 = JOptionPane.showInputDialog("Enter the first name");
        String name_player_2 = JOptionPane.showInputDialog("Enter the second name");
        
        System.out.println(name_player_1);
        System.out.println(name_player_2);
        
        if (name_player_1 == null || name_player_2 == null) {
            enable_grid(false);
            JOptionPane.showMessageDialog(null, "Please enter a name");
        }
        else {
            if (name_player_1.equals("")){
                name_player_1 = "Player 1";
            }
            if (name_player_2.equals("")){
                name_player_2 = "Player 2";
            }
        
            new_player_1.setName(name_player_1);
            new_player_2.setName(name_player_2);
            display_P1.setText(new_player_1.getName());
            display_P2.setText(new_player_2.getName());
        
            boolean active = true;
            clean_grid(true);
            clean_array();
            clean_grid(active);
            enable_grid(active);
            turn_player();
            Btn_restart.setEnabled(true);
        }
    }//GEN-LAST:event_Btn_newActionPerformed

    private void grid_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_00ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_00, 0, 0);
        print_array();
        logic_win();
    }//GEN-LAST:event_grid_00ActionPerformed

    private void grid_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_01ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_01, 0, 1);
        print_array();
        logic_win();
    }//GEN-LAST:event_grid_01ActionPerformed

    private void grid_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_10ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_10, 1, 0);
        print_array();
        logic_win();
        
    }//GEN-LAST:event_grid_10ActionPerformed

    private void grid_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_11ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_11, 1, 1);
        print_array();
        logic_win();
    }//GEN-LAST:event_grid_11ActionPerformed

    private void grid_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_12ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_12, 1, 2);
        print_array();
        logic_win();
    }//GEN-LAST:event_grid_12ActionPerformed

    private void grid_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_20ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_20, 2, 0);
        print_array();
        logic_win();
    }//GEN-LAST:event_grid_20ActionPerformed

    private void grid_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_21ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_21, 2, 1);
        print_array();
        logic_win();
        
    }//GEN-LAST:event_grid_21ActionPerformed

    private void grid_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid_22ActionPerformed
        // TODO add your handling code here:
        func_btn(grid_22, 2, 2);
        print_array();
        logic_win();
    }//GEN-LAST:event_grid_22ActionPerformed

    private void Btn_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_restartActionPerformed
        // TODO add your handling code here:
        clean_grid(true);
        turn = 1;
        turn_player();
        Arrays.fill(matrix[0], 0);
        Arrays.fill(matrix[1], 0);
        Arrays.fill(matrix[2], 0);
        print_array();
    }//GEN-LAST:event_Btn_restartActionPerformed

    private void Btn_botActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_botActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Coming soon!!!");
    }//GEN-LAST:event_Btn_botActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_bot;
    private javax.swing.JButton Btn_mult;
    private javax.swing.JButton Btn_new;
    private javax.swing.JButton Btn_restart;
    private javax.swing.JLabel display_P1;
    private javax.swing.JLabel display_P2;
    private javax.swing.JLabel display_text;
    private javax.swing.JLabel display_turn1;
    private javax.swing.JButton grid_00;
    private javax.swing.JButton grid_01;
    private javax.swing.JButton grid_02;
    private javax.swing.JButton grid_10;
    private javax.swing.JButton grid_11;
    private javax.swing.JButton grid_12;
    private javax.swing.JButton grid_20;
    private javax.swing.JButton grid_21;
    private javax.swing.JButton grid_22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    
    public void clean_grid (boolean active){
        grid_00.setEnabled(active);
        grid_00.setIcon(null);
        grid_00.setBackground(new Color(220, 220, 220));
        
        grid_01.setEnabled(active);
        grid_01.setIcon(null);
        grid_01.setBackground(new Color(220, 220, 220));
        
        grid_02.setEnabled(active);
        grid_02.setIcon(null);
        grid_02.setBackground(new Color(220, 220, 220));
        
        grid_10.setEnabled(active);
        grid_10.setIcon(null);
        grid_10.setBackground(new Color(220, 220, 220));
        
        grid_11.setEnabled(active);
        grid_11.setIcon(null);
        grid_11.setBackground(new Color(220, 220, 220));
        
        grid_12.setEnabled(active);
        grid_12.setIcon(null);
        grid_12.setBackground(new Color(220, 220, 220));
        
        grid_20.setEnabled(active);
        grid_20.setIcon(null);
        grid_20.setBackground(new Color(220, 220, 220));
        
        grid_21.setEnabled(active);
        grid_21.setIcon(null);
        grid_21.setBackground(new Color(220, 220, 220));
        
        grid_22.setEnabled(active);
        grid_22.setIcon(null);
        grid_22.setBackground(new Color(220, 220, 220));
    }
    
    
    public void enable_grid (boolean active){
        grid_00.setEnabled(active);
        
        grid_01.setEnabled(active);
        
        grid_02.setEnabled(active);
        
        grid_10.setEnabled(active);
        
        grid_11.setEnabled(active);
        
        grid_12.setEnabled(active);
        
        grid_20.setEnabled(active);
        
        grid_21.setEnabled(active);
        
        grid_22.setEnabled(active);
    }
    
    public void func_btn (JButton btn, int pos_a, int pos_b) {
        Image check = null;
        play("");
        
        if (matrix[pos_a][pos_b] == 0) {
            if (turn == 1){
                try {
                    check = ImageIO.read(getClass().getResource("O.png"));
                } catch (IOException ex) {
                    System.out.println("Img not found");
                }
                // btn.setBackground(Color.blue);
                btn.setIcon(new ImageIcon(check));
                turn = 2;
                turn_player();
                status_id = 1;
                matrix[pos_a][pos_b] = status_id;
            }
            else if (turn == 2) {
                try {
                    check = ImageIO.read(getClass().getResource("X.png"));
                } catch (IOException ex) {
                    System.out.println("Img not found");
                }
                btn.setIcon(new ImageIcon(check));
                // btn.setBackground(Color.red);
                turn = 1;
                turn_player();
                status_id = 2;
                matrix[pos_a][pos_b] = status_id;
            }
        }
    }
    
    public void print_array () {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("---");
    }
    
    public void clean_array () {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
            System.out.println("");
        }
        
        System.out.println("---");
    }
    
    /** ================================================================= */
    /** ================================================================= */
    /** ============================== Main ============================= */
 
    public void logic_win () {
        String name_winner = "";
        
        // ====================== Horizontal ==================================
        // <editor-fold defaultstate="collapsed" desc="Horizontal">
        if (matrix[0][0] == status_id && matrix[0][1] == status_id && matrix[0][2] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        
        else if (matrix[1][0] == status_id && matrix[1][1] == status_id && matrix[1][2] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        
        else if (matrix[2][0] == status_id && matrix[2][1] == status_id && matrix[2][2] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        // </editor-fold>
        
        // ====================== vertical ==================================
        // <editor-fold defaultstate="collapsed" desc="vertical">
        if (matrix[0][0] == status_id && matrix[1][0] == status_id && matrix[2][0] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        
        else if (matrix[0][1] == status_id && matrix[1][1] == status_id && matrix[2][1] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        
        else if (matrix[0][2] == status_id && matrix[1][2] == status_id && matrix[2][2] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        // </editor-fold>
        
        // ====================== Diagonal ==================================
        // <editor-fold defaultstate="collapsed" desc="Diagonal">
        else if (matrix[0][0] == status_id && matrix[1][1] == status_id && matrix[2][2] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        
        else if (matrix[0][2] == status_id && matrix[1][1] == status_id && matrix[2][0] == status_id) {
            if (status_id == 1) {
                name_winner = new_player_1.getName();
            }
            else {
                name_winner = new_player_2.getName();
            }
        }
        // </editor-fold>
        if (!name_winner.equals("")) {
            JOptionPane.showMessageDialog(null, "The winner is: " + name_winner);
            display_text.setText("The winner is: " + name_winner);
            enable_grid(false);
        }
        else if (is_full()) {
            JOptionPane.showMessageDialog(null, "It's a draw!\nYou need to restart");
        }
    }
    
    public boolean is_full () {
        boolean status = false;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    count -= -1;
                }
            }
        }
        if (count == 9) {
            status = true;
        }
        
        return status;
    }
    
    public void turn_player () {
        if (turn == 1) {
            display_text.setText(new_player_1.getName());
        }
        else {
            display_text.setText(new_player_2.getName());
        }
    }
    
    public void play(String path) {
        InputStream music;
        AudioData ambient;
        try {
            if (path.isEmpty())
            {
                music = new FileInputStream(new File(RUTE_SOUND));
                AudioStream audio = new AudioStream(music);
                AudioPlayer.player.start(audio);
            }
            else{
                
                ambient = new AudioStream(new FileInputStream(path)).getData();
                ContinuousAudioDataStream sound = new ContinuousAudioDataStream(ambient);
                AudioPlayer.player.start(sound);
            }
            
        } catch (Exception e) {
            System.out.println("Error to play sound");
        }
    }
}

