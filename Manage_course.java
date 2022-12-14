
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author COLD
 */
public class Manage_course extends javax.swing.JFrame {

  Course_operations co = new Course_operations();
  New_course nc = new New_course();
    public Manage_course() {
        initComponents();
        
        co.fill_course_table(course_table);
        course_table.setRowHeight(30);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        course_name_lbl = new javax.swing.JLabel();
        course_name_field = new javax.swing.JTextField();
        course_hours_lbl = new javax.swing.JLabel();
        course_spinner = new javax.swing.JSpinner();
        course_name_lbl1 = new javax.swing.JLabel();
        course_id_field = new javax.swing.JTextField();
        course_delete = new javax.swing.JButton();
        course_add = new javax.swing.JButton();
        course_edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        course_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        course_name_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        course_name_lbl.setText("Course Name");

        course_name_field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        course_name_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        course_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_name_fieldActionPerformed(evt);
            }
        });
        course_name_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                course_name_fieldKeyTyped(evt);
            }
        });

        course_hours_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        course_hours_lbl.setText("Course Hours");

        course_spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        course_name_lbl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        course_name_lbl1.setText("Course ID");

        course_id_field.setEditable(false);
        course_id_field.setBackground(new java.awt.Color(255, 255, 255));
        course_id_field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        course_id_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        course_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_id_fieldActionPerformed(evt);
            }
        });
        course_id_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                course_id_fieldKeyTyped(evt);
            }
        });

        course_delete.setBackground(new java.awt.Color(64, 191, 216));
        course_delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        course_delete.setText("Delete");
        course_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_deleteActionPerformed(evt);
            }
        });

        course_add.setBackground(new java.awt.Color(64, 191, 216));
        course_add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        course_add.setText("Add");
        course_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_addActionPerformed(evt);
            }
        });

        course_edit.setBackground(new java.awt.Color(64, 191, 216));
        course_edit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        course_edit.setText("Edit");
        course_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_editActionPerformed(evt);
            }
        });

        course_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Course hours"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        course_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                course_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(course_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(course_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_add, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(course_name_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(course_hours_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(course_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(course_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(course_name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_name_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_hours_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void course_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_name_fieldActionPerformed

    private void course_name_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_name_fieldKeyTyped
        //        if(!Character.isSpaceChar(evt.getKeyChar()) && !Character.isAlphabetic(evt.getKeyChar()) ){
            //            evt.consume();     // TODO add your handling code here:
    }//GEN-LAST:event_course_name_fieldKeyTyped

    private void course_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_id_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_id_fieldActionPerformed

    private void course_id_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_id_fieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_course_id_fieldKeyTyped

    private void course_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_deleteActionPerformed
        if(!course_id_field.getText().equals("")){
        int id = Integer.valueOf(course_id_field.getText());
        co.operations(3,id, null,null);
        Manage_course.course_table.setModel(new DefaultTableModel(null,new Object[]{"Course ID","Course Name","Course hours"}));
        co.fill_course_table(Manage_course.course_table);
        
        course_id_field.setText("");
        course_name_field.setText("");
        course_id_field.setText("");
        course_spinner.setValue(1);
        }
    }//GEN-LAST:event_course_deleteActionPerformed

    private void course_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_addActionPerformed
        nc.setVisible(true);
        nc.pack();
        nc.setLocationRelativeTo(null);
        nc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_course_addActionPerformed

    private void course_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_editActionPerformed

String course_name = course_name_field.getText();
      if(!co.course_existed(course_name_field.getText())){
        int id = Integer.valueOf(course_id_field.getText());
        int hours = Integer.valueOf(course_spinner.getValue().toString());
        co.operations(2,id, course_name, hours);
        Manage_course.course_table.setModel(new DefaultTableModel(null,new Object[]{"Course ID","Course Name","Course hours"}));
        co.fill_course_table(Manage_course.course_table);
        JOptionPane.showMessageDialog(null,course_name+" has been edited");
      }
      else{
          JOptionPane.showMessageDialog(null,course_name+" is already existed ","Course Existed",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_course_editActionPerformed

    private void course_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_tableMouseClicked
//
        int table_index = course_table.getSelectedRow();

        course_id_field.setText(course_table.getValueAt(table_index, 0).toString());
        course_name_field.setText(course_table.getValueAt(table_index, 1).toString());
        course_spinner.setValue(Integer.valueOf(course_table.getValueAt(table_index, 2).toString()));
        
    }//GEN-LAST:event_course_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Manage_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton course_add;
    private javax.swing.JButton course_delete;
    private javax.swing.JButton course_edit;
    private javax.swing.JLabel course_hours_lbl;
    private javax.swing.JTextField course_id_field;
    private javax.swing.JTextField course_name_field;
    private javax.swing.JLabel course_name_lbl;
    private javax.swing.JLabel course_name_lbl1;
    private javax.swing.JSpinner course_spinner;
    public static javax.swing.JTable course_table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
