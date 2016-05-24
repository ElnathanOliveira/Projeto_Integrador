/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academico.view;

import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author vinicius
 */
public class splash extends JWindow {
    
    AbsoluteLayout absoluto;
    AbsoluteConstraints absimage, absbarra;
    ImageIcon image;
    JLabel jlabel;
    JProgressBar barra;
    
    public splash(){
        
    absoluto = new AbsoluteLayout();    
    absimage = new AbsoluteConstraints(0,0);
    absbarra = new AbsoluteConstraints(0,209);
    jlabel = new JLabel();
    image = new ImageIcon(this.getClass().getResource("logo.png"));
    jlabel.setIcon(image);
    barra = new JProgressBar();
    barra.setPreferredSize(new Dimension(310,10));
    this.getContentPane().setLayout(absoluto);
    this.getContentPane().add(jlabel,absimage);
    this.getContentPane().add(barra,absbarra);
    
    new Thread(){
        public void run(){
            int i=0;
            while (i<101)
            {
                barra.setValue(i);
                i++;
                try {
                    sleep(30);
                } catch (InterruptedException ex) {
                    Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.exit(0); //Mandar para o FormLogin
        }
    }.start();
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
        
    }
    
    public static void main(String args[]){
        
        new splash();
    }
    
}
