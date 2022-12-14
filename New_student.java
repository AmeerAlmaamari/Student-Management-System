
import javax.swing.ButtonGroup;
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
public class New_student extends javax.swing.JFrame {

    Student_operations std_op = new Student_operations();
    public New_student() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(male_button);
        bg.add(female_button);
        male_button.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_Panel = new javax.swing.JPanel();
        cover_Label2 = new javax.swing.JLabel();
        cover_Label1 = new javax.swing.JLabel();
        stu_first_name1 = new javax.swing.JLabel();
        first_name_field = new javax.swing.JTextField();
        last_name_label = new javax.swing.JLabel();
        last_name_field = new javax.swing.JTextField();
        gender_label = new javax.swing.JLabel();
        male_button = new javax.swing.JRadioButton();
        female_button = new javax.swing.JRadioButton();
        phone_label = new javax.swing.JLabel();
        phone_field = new javax.swing.JTextField();
        close_btn = new javax.swing.JButton();
        add_student_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(715, 418));

        main_Panel.setBackground(new java.awt.Color(64, 191, 216));

        cover_Label2.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        cover_Label2.setForeground(new java.awt.Color(240, 240, 240));
        cover_Label2.setText("STUDENT");

        cover_Label1.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        cover_Label1.setForeground(new java.awt.Color(240, 240, 240));
        cover_Label1.setText("ADD");

        javax.swing.GroupLayout main_PanelLayout = new javax.swing.GroupLayout(main_Panel);
        main_Panel.setLayout(main_PanelLayout);
        main_PanelLayout.setHorizontalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(cover_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(cover_Label1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_PanelLayout.setVerticalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cover_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cover_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stu_first_name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stu_first_name1.setText("First Name");

        first_name_field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        first_name_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        first_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_fieldActionPerformed(evt);
            }
        });
        first_name_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                first_name_fieldKeyTyped(evt);
            }
        });

        last_name_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        last_name_label.setText("Last Name");

        last_name_field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        last_name_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        last_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_name_fieldActionPerformed(evt);
            }
        });
        last_name_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                last_name_fieldKeyTyped(evt);
            }
        });

        gender_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gender_label.setText("Gender");

        male_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        male_button.setText("Male");

        female_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        female_button.setText("Female");

        phone_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phone_label.setText("Phone");

        phone_field.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        phone_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        phone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_fieldActionPerformed(evt);
            }
        });
        phone_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_fieldKeyTyped(evt);
            }
        });

        close_btn.setBackground(new java.awt.Color(64, 191, 216));
        close_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        close_btn.setText("Close");
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });

        add_student_btn1.setBackground(new java.awt.Color(64, 191, 216));
        add_student_btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add_student_btn1.setText("Add Student");
        add_student_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_student_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(stu_first_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(gender_label, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(male_button)
                            .addGap(18, 18, 18)
                            .addComponent(female_button))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(phone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_student_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stu_first_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(male_button)
                    .addComponent(female_button))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_student_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void first_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name_fieldActionPerformed

    private void last_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_name_fieldActionPerformed

    private void phone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_fieldActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        this.dispose();
        first_name_field.setText("");
        last_name_field.setText("");
        phone_field.setText("");
        male_button.setSelected(true);
    }//GEN-LAST:event_close_btnActionPerformed

    public boolean student_verify(){
    
        if(first_name_field.getText().equals("") ||
           last_name_field.getText().equals("") ||
           phone_field.getText().equals("")){
            JOptionPane.showMessageDialog(null,"There are empty fields","Empty Fields",JOptionPane.ERROR_MESSAGE);
            
            
        return false;}
        
        else{return true;}
    
    }
    
    private void add_student_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_student_btn1ActionPerformed

     
        String f_name = first_name_field.getText();
        String l_name = last_name_field.getText();
        String phone = phone_field.getText();
        String gender = "Male";
        if(female_button.isSelected()){
        gender = "Female";
        }
        if(student_verify()){
        Student_operations std_op = new Student_operations();
        std_op.operations(1, null, f_name, l_name, gender, phone);
        
        Manage_student.manage_table.setModel(new DefaultTableModel(null, new Object[]{"ID","First Name", "Last Name", "Gender", "Phone"}));
      
        std_op.fill_stu_table(Manage_student.manage_table, "");
        
        Stats.n_stu.setText(Integer.toString(MyFunction.data_count("student")));
        }
       
        
        
    }//GEN-LAST:event_add_student_btn1ActionPerformed

    private void phone_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_fieldKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_phone_fieldKeyTyped

    private void first_name_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_first_name_fieldKeyTyped
           if(!Character.isSpaceChar(evt.getKeyChar()) && !Character.isAlphabetic(evt.getKeyChar()) ){
            evt.consume();     // TODO add your handling code here:
    }//GEN-LAST:event_first_name_fieldKeyTyped
    }
    private void last_name_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_last_name_fieldKeyTyped
        if(!Character.isSpaceChar(evt.getKeyChar()) && !Character.isAlphabetic(evt.getKeyChar()) ){
            evt.consume();
    }//GEN-LAST:event_last_name_fieldKeyTyped
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
            java.util.logging.Logger.getLogger(New_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_student_btn1;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel cover_Label1;
    private javax.swing.JLabel cover_Label2;
    private javax.swing.JRadioButton female_button;
    private javax.swing.JTextField first_name_field;
    private javax.swing.JLabel gender_label;
    private javax.swing.JTextField last_name_field;
    private javax.swing.JLabel last_name_label;
    private javax.swing.JPanel main_Panel;
    private javax.swing.JRadioButton male_button;
    private javax.swing.JTextField phone_field;
    private javax.swing.JLabel phone_label;
    private javax.swing.JLabel stu_first_name1;
    // End of variables declaration//GEN-END:variables
}
