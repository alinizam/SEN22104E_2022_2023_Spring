/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory02;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ali.nizam
 */
public class Example2 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.add(new JTextField("Hello",2));
        f.add(new JTextField("World",3));
        f.add(new JButton("Press me"));
        f.getContentPane().setLayout(new FlowLayout());
        f.setSize(300,400);
        f.setVisible(true);
        f.pack();
    }
}
