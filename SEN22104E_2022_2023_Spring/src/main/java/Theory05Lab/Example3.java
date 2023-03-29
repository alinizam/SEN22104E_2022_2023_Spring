/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Theory05Lab;

import javax.swing.JOptionPane;

/**
 *
 * @author ali.nizam
 */
public class Example3 extends javax.swing.JFrame {

    /**
     * Creates new form Example3
     */
    public Example3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_searchWord = new javax.swing.JTextField();
        txt_sentence = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_searchWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 150, -1));

        txt_sentence.setText("fatih sultan mehmet vakif üniversity");
        getContentPane().add(txt_sentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 590, -1));

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel1.setText("Word");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setText("Sentence");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean FindWordInsideSentence(String word, String sentence) {
        boolean isFound = false;
        int subIndex=0;
        for (int index = 0; index < sentence.length(); index++) {
          
            for (subIndex = 0; subIndex < word.length(); subIndex++) {
                if (sentence.charAt(index+subIndex) != word.charAt(subIndex)) {
                    
                    break;
                }
            }
            if (subIndex==word.length()) {
                isFound=true;
                break;
            }
        }
        
        return isFound;

    }
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        String word= txt_searchWord.getText();
        String sentence= txt_sentence.getText();
        boolean isFound= FindWordInsideSentence(word, sentence);
        if (isFound) {
            JOptionPane.showMessageDialog(rootPane, "Word is found!","Dialog",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Word is not found!","Dialog",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Example3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Example3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_searchWord;
    private javax.swing.JTextField txt_sentence;
    // End of variables declaration//GEN-END:variables
}
