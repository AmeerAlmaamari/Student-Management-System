

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author COLD
 */
public class Marks extends javax.swing.JFrame {

   Student_operations so = new Student_operations();
    Course_operations co = new Course_operations();
    Marks_operations mo = new Marks_operations();
    DefaultTableModel model;
    public Marks() {
        initComponents();
       co.fill_course_box(course_box);
       so.fill_stu_table(marks_table, "");
       
       hideColumn(3);
       hideColumn(4);
       
        marks_table.setRowHeight(40);
        model = (DefaultTableModel)marks_table.getModel();
        
//       so.fill_stu_table(marks_table, "");
        
      
    }

    private void hideColumn(int colIndex){
    
    TableColumn col = marks_table.getColumnModel().getColumn(colIndex);
    col.setMaxWidth(0);
    col.setMinWidth(0);
    col.setPreferredWidth(0);
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        marks_lbl = new javax.swing.JLabel();
        stu_lbl = new javax.swing.JLabel();
        marks_stu_id = new javax.swing.JTextField();
        marks_cancel = new javax.swing.JButton();
        marks_add = new javax.swing.JButton();
        course_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        marks_table = new javax.swing.JTable();
        marks_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        course_box = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marks_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        marks_lbl.setText("Marks");

        stu_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stu_lbl.setText("Student ID");

        marks_stu_id.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        marks_stu_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        marks_stu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks_stu_idActionPerformed(evt);
            }
        });
        marks_stu_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marks_stu_idKeyTyped(evt);
            }
        });

        marks_cancel.setBackground(new java.awt.Color(64, 191, 216));
        marks_cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marks_cancel.setText("Cancel");
        marks_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks_cancelActionPerformed(evt);
            }
        });

        marks_add.setBackground(new java.awt.Color(64, 191, 216));
        marks_add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marks_add.setText("Add");
        marks_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks_addActionPerformed(evt);
            }
        });

        course_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        course_lbl.setText("Course ");

        marks_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        marks_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marks_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(marks_table);

        marks_field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        marks_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        marks_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks_fieldActionPerformed(evt);
            }
        });
        marks_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marks_fieldKeyTyped(evt);
            }
        });

        course_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stu_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(course_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(course_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(marks_stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(marks_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(marks_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(marks_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(marks_field, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stu_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks_stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_box, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks_add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marks_stu_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks_stu_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks_stu_idActionPerformed

    private void marks_stu_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marks_stu_idKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_marks_stu_idKeyTyped

    private void marks_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks_cancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_marks_cancelActionPerformed

    private void marks_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks_addActionPerformed
    int marks_score = Integer.valueOf(marks_field.getText());
    int stu_id = Integer.valueOf(marks_stu_id.getText());
     int course_id = co.get_course_id(course_box.getSelectedItem().toString());
        if(marks_score>=0 && marks_score<=100){
        mo.operations(1, stu_id, course_id, marks_score);
        Marks_manage.marks_manage_table.setModel(new DefaultTableModel(null,new Object[]{"Student ID", "Course ID", "Marks"}));
        mo.fill_marks_table(Marks_manage.marks_manage_table);
        }
        else{
        
        JOptionPane.showMessageDialog(null,"Marks have to be between 0 and 100","Invalid marks", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_marks_addActionPerformed

    private void marks_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marks_tableMouseClicked

        int table_index = marks_table.getSelectedRow();
        marks_stu_id.setText(marks_table.getValueAt(table_index, 0).toString());

//        marks_stu_id.setText(marks_table.getValueAt(table_index, 0).toString());
//        mid_field.setText(marks_table.getValueAt(table_index, 1).toString());
//        course_spinner.setValue(Integer.valueOf(marks_table.getValueAt(table_index, 2).toString()));

    }//GEN-LAST:event_marks_tableMouseClicked

    private void marks_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks_fieldActionPerformed

    private void marks_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marks_fieldKeyTyped
        //        if(!Character.isSpaceChar(evt.getKeyChar()) && !Character.isAlphabetic(evt.getKeyChar()) ){
            //            evt.consume();     // TODO add your handling code here:
    }//GEN-LAST:event_marks_fieldKeyTyped

    private void course_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_boxActionPerformed

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
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> course_box;
    private javax.swing.JLabel course_lbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton marks_add;
    private javax.swing.JButton marks_cancel;
    private javax.swing.JTextField marks_field;
    private javax.swing.JLabel marks_lbl;
    private javax.swing.JTextField marks_stu_id;
    public static javax.swing.JTable marks_table;
    private javax.swing.JLabel stu_lbl;
    // End of variables declaration//GEN-END:variables

   
}
