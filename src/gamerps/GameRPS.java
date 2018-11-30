
package gamerps;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import sun.audio.*;    
import java.io.*;
import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class GameRPS extends javax.swing.JFrame implements ActionListener{   
    ImageIcon Rock = new ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\makuy.jpg");
    ImageIcon Paper = new ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\800px_COLOURBOX8093027.jpg");
    ImageIcon Scissor = new ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\515.jpg");    
    int x = 0 ;    
    JButton rock , paper , scissor ;
    JButton Com;
    JLabel Result,minigame;
    int compChoice ;
    public GameRPS(){
        initComponents();
        
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new GameRPS().setVisible(true);
            }
        });
    }       
    private void initComponents() {

        minigame = new javax.swing.JLabel();
        scissor = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        rock = new javax.swing.JButton();
        Com = new javax.swing.JButton();
        Result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        minigame.setText("Minigame RockPaperScissor ");

        scissor.setBackground(new java.awt.Color(255, 255, 255));
        scissor.setForeground(new java.awt.Color(255, 255, 255));
        scissor.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\800px_COLOURBOX8093027.jpg")); // NOI18N
        scissor.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorActionPerformed(evt);
            }
        });

        paper.setBackground(new java.awt.Color(255, 255, 255));
        paper.setForeground(new java.awt.Color(255, 255, 255));
        paper.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\515.jpg")); // NOI18N
        paper.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });

        rock.setBackground(new java.awt.Color(255, 255, 255));
        rock.setForeground(new java.awt.Color(255, 255, 255));
        rock.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\makuy.jpg")); // NOI18N
        rock.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });

        Com.setBackground(new java.awt.Color(255, 255, 255));
        Com.setForeground(new java.awt.Color(255, 255, 255));
        

        Result.setText("Please Select Paper Scissor Rock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(paper, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scissor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Com, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(minigame, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minigame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scissor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Com, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        

        pack();
    }// </editor-fold>                        

    private void scissorActionPerformed(java.awt.event.ActionEvent evt) {                                        
        x = 3 ;
        Scanner scan = new Scanner(System.in);
        Random computer = new Random();
        compChoice = computer.nextInt(3)+1; 
        System.out.println("player :"+x);
        System.out.println("com :"+compChoice);
        if( compChoice == 3) //player: Scissors, comp: Scissors
        { 
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\800px_COLOURBOX8093027.jpg"));
            Result.setText("Computer : Scissor");
            JOptionPane.showMessageDialog(scissor, "You Draw");
          
        }

        else if( compChoice == 2) //player: Scissors, comp: Paper
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\515.jpg"));
            Result.setText("Computer : Paper");
            JOptionPane.showMessageDialog(scissor, "You Win");
        }

        else if( compChoice == 1) //player: Scissors, comp: Rock
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\makuy.jpg"));
            Result.setText("Computer : Rock");
            JOptionPane.showMessageDialog(scissor, "You Lost");
        }
        //scissor
    }                                       

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {                                      
        x = 2 ;
        Scanner scan = new Scanner(System.in);
        Random computer = new Random();
        int compChoice = computer.nextInt(3)+1;
        System.out.println("com :"+compChoice);
        System.out.println("player :"+x);
        if(compChoice == 3) //player: Paper, comp: Scissors
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\800px_COLOURBOX8093027.jpg")); 
            Result.setText("Computer : Scissor");
            JOptionPane.showMessageDialog(paper, "You Lost");
          
        }

        else if(compChoice == 2) //player: Paper, comp: Paper
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\515.jpg"));
            Result.setText("Computer : Paper");
            JOptionPane.showMessageDialog(paper, "You Draw");
          
        }

        else if(compChoice == 1) //player: Paper, comp: Rock
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\makuy.jpg"));
            Result.setText("Computer : Rock");
            JOptionPane.showMessageDialog(paper, "You Win");
        }
        //paper
    }                                     

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {  
        
        x = 1 ;
        Scanner scan = new Scanner(System.in);
        Random computer = new Random();
        int compChoice = computer.nextInt(3)+1;
        System.out.println("com :"+compChoice);
        System.out.println("player :"+x);
        if( compChoice == 3 ) //player: Rock, comp: Scissors
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\800px_COLOURBOX8093027.jpg")); 
            Result.setText("Computer : Scissor");
            JOptionPane.showMessageDialog(rock, "You Win");
        }

        else if(compChoice == 2 ) //player:Rock, comp: Paper
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\515.jpg"));
            Result.setText("Computer : Paper");
            JOptionPane.showMessageDialog(rock, "You Lost");
        }

        else if( compChoice == 1 ) //player:Rock, comp: Rock
        {
            Com.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuiT4l2\\Desktop\\oop\\Originals\\makuy.jpg"));
            Result.setText("Computer : Rock");
            JOptionPane.showMessageDialog(rock, "You Draw");      
        }
        
        //rock
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}  
    

