/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory01;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ali.nizam
 */
public class Example1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b=new JButton();
        f.setSize(500,500);
        f.add(b);
        b.setText("Hello");
        b.setSize(20, 50);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
     // f.getContentPane().add();
        
        for (int i = 0; i < 10; i++) {
             JButton b1=new JButton();
             f.add(b1);
             b1.setText(i+"");
        }
    }
    
}
