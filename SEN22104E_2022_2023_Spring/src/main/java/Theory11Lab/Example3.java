/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory11Lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alinizam
 */
public class Example3 extends javax.swing.JFrame {

    /**
     * Creates new form Ornek2
     */
    Connection con;

    public Example3() {
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            fillJobsCombo();
            

        } catch (SQLException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dtm.setColumnIdentifiers(new Object[]{"Id","First Name","Last Name","Salary"});
        tbEmployee.setModel(dtm);

    }

    class Job {

        int jobId;
        String jobTitle;

        public Job(int jobId, String jobTitle) {
            this.jobId = jobId;
            this.jobTitle = jobTitle;
        }

        @Override
        public String toString() {
            return jobTitle; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

    }

    void fillJobsCombo() {
        try {
            Statement s = con.createStatement();
            String sql = "SELECT * FROM jobs";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                cbJob.addItem(new Job(rs.getInt("job_id"), rs.getString("job_title")));
            }
            cbJob.setSelectedIndex(-1);

        } catch (SQLException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbJob = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmployee = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Jobs");

        cbJob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbJob.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbJobItemStateChanged(evt);
            }
        });

        tbEmployee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee_Id", "FirstName", "LastName", "Salary"
            }
        ));
        jScrollPane1.setViewportView(tbEmployee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbJob, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel dtm = new DefaultTableModel();
    private void cbJobItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbJobItemStateChanged
         fillTableWithPrepararedStatement();
    }//GEN-LAST:event_cbJobItemStateChanged
    
    void fillTableWithPrepararedStatement(){
    // TODO add your handling code here:
        if (cbJob.getSelectedIndex()==-1) return;
        Job j = (Job) cbJob.getSelectedItem();
        dtm.setRowCount(0);
        System.out.println(j.jobId);
        String sql = "SELECT * FROM employee WHERE job_id=?";
        try (PreparedStatement s = con.prepareStatement(sql)){
            s.setInt(1, j.jobId);
            System.out.println(sql);
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("employee_id"),
                                        rs.getString("first_name"),
                                        rs.getString("last_name"),
                                        rs.getInt("salary")});
            } 
        }catch (SQLException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    void fillTableWithStatement(){
    // TODO add your handling code here:
        Job j = (Job) cbJob.getSelectedItem();
        dtm.setRowCount(0);
      
        try (Statement s = con.createStatement()){
            
            String sql = "SELECT * FROM employee WHERE job_id=" + j.jobId;
            System.out.println(sql);
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("employee_id"),
                                        rs.getString("first_name"),
                                        rs.getString("last_name"),
                                        rs.getInt("salary")});
            } 
        }catch (SQLException ex) {
            Logger.getLogger(Example3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Example3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEmployee;
    // End of variables declaration//GEN-END:variables
}