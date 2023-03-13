/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory01Lab;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;*/

import javax.swing.*;

/**
 *
 * @author ali.nizam
 */
public class Example4 {
    static int x,y;
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JTextField t=new JTextField("Text");
        JLabel l=new JLabel("Label");
        JButton b=new JButton("Click me");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText(t.getText());
                x=500;
                y=600;
                f.setSize(x, y);
                f.setVisible(true);
            }
        });
        
        f.add(t);
        f.add(l);
        f.add(b);
        
        f.setLayout(new FlowLayout());
        f.pack();
        f.setSize(200, 300);
        f.setVisible(true);
        
        
        
        
        
    }
}
