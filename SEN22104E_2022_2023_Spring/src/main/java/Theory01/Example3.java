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
public class Example3 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b=new JButton();
        f.setSize(500,500);
        f.add(b);
        f.getContentPane().setLayout(new FlowLayout());
        System.out.println(f.getContentPane().getLayout());
        f.setVisible(true);
    }
}
