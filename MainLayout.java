/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author COLD
 */
public class MainLayout extends javax.swing.JFrame {

   New_student stu = new New_student();
   Stats stat = new Stats();
   Manage_student ms = new Manage_student();
   Manage_course mc = new Manage_course();
   New_course nc = new New_course();
   Marks_manage mm = new Marks_manage();
   Marks mrk = new Marks();
   Marks_show marks_show = new Marks_show();
    public MainLayout() {
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

        main_Panel = new javax.swing.JPanel();
        cover_Label2 = new javax.swing.JLabel();
        cover_Label1 = new javax.swing.JLabel();
        welcome_label = new java.awt.Label();
        new_course_btn = new javax.swing.JButton();
        manage_button = new javax.swing.JButton();
        display_btn = new javax.swing.JButton();
        new_student_button = new javax.swing.JButton();
        manage_course_btn = new javax.swing.JButton();
        add_marks_btn = new javax.swing.JButton();
        manage_marks_btn1 = new javax.swing.JButton();
        stats_button1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(715, 481));

        main_Panel.setBackground(new java.awt.Color(64, 191, 216));

        cover_Label2.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        cover_Label2.setForeground(new java.awt.Color(240, 240, 240));
        cover_Label2.setText("PAGE");

        cover_Label1.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        cover_Label1.setForeground(new java.awt.Color(240, 240, 240));
        cover_Label1.setText("Main");

        javax.swing.GroupLayout main_PanelLayout = new javax.swing.GroupLayout(main_Panel);
        main_Panel.setLayout(main_PanelLayout);
        main_PanelLayout.setHorizontalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(cover_Label2)
                .addGap(47, 47, 47))
            .addGroup(main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(main_PanelLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(cover_Label1)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );
        main_PanelLayout.setVerticalGroup(
            main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(cover_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(main_PanelLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(cover_Label1)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );

        welcome_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        welcome_label.setForeground(new java.awt.Color(64, 191, 216));
        welcome_label.setText("Welcome<######>");

        new_course_btn.setBackground(new java.awt.Color(64, 191, 216));
        new_course_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        new_course_btn.setText("Add Course");
        new_course_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_course_btnActionPerformed(evt);
            }
        });

        manage_button.setBackground(new java.awt.Color(64, 191, 216));
        manage_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manage_button.setText("Manage Students");
        manage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_buttonActionPerformed(evt);
            }
        });

        display_btn.setBackground(new java.awt.Color(64, 191, 216));
        display_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        display_btn.setText("Display Marks");
        display_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_btnActionPerformed(evt);
            }
        });

        new_student_button.setBackground(new java.awt.Color(64, 191, 216));
        new_student_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        new_student_button.setText("Add Student");
        new_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_student_buttonActionPerformed(evt);
            }
        });

        manage_course_btn.setBackground(new java.awt.Color(64, 191, 216));
        manage_course_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manage_course_btn.setText("Manage Courses");
        manage_course_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_course_btnActionPerformed(evt);
            }
        });

        add_marks_btn.setBackground(new java.awt.Color(64, 191, 216));
        add_marks_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add_marks_btn.setText("Add Marks");
        add_marks_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_marks_btnActionPerformed(evt);
            }
        });

        manage_marks_btn1.setBackground(new java.awt.Color(64, 191, 216));
        manage_marks_btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manage_marks_btn1.setText("Manage Marks");
        manage_marks_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_marks_btn1ActionPerformed(evt);
            }
        });

        stats_button1.setBackground(new java.awt.Color(64, 191, 216));
        stats_button1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stats_button1.setText("Statistics");
        stats_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stats_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(226, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(display_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stats_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(new_student_button, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(manage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(new_course_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manage_course_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_marks_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manage_marks_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_student_button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_course_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_course_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_marks_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_marks_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stats_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_course_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_course_btnActionPerformed
            nc.setVisible(true);
                nc.pack();
                nc.setLocationRelativeTo(null);
                nc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);    
    }//GEN-LAST:event_new_course_btnActionPerformed

    private void display_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_btnActionPerformed
       marks_show.setVisible(true);
                marks_show.pack();
                marks_show.setLocationRelativeTo(null);
                marks_show.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_display_btnActionPerformed

    private void manage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_buttonActionPerformed
        ms.setVisible(true);
                ms.pack();
                ms.setLocationRelativeTo(null);
                ms.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_manage_buttonActionPerformed

    private void new_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_student_buttonActionPerformed
        stu.setVisible(true);
        stu.pack();
        stu.setLocationRelativeTo(null);
        stu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_new_student_buttonActionPerformed

    private void manage_course_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_course_btnActionPerformed
        mc.setVisible(true);
                mc.pack();
                mc.setLocationRelativeTo(null);
                mc .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_manage_course_btnActionPerformed

    private void add_marks_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_marks_btnActionPerformed
                mrk.setVisible(true);
                mrk.pack();
                mrk.setLocationRelativeTo(null);
                mrk .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_add_marks_btnActionPerformed

    private void manage_marks_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_marks_btn1ActionPerformed
         mm.setVisible(true);
                mm.pack();
                mm.setLocationRelativeTo(null);
                mm .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_manage_marks_btn1ActionPerformed

    private void stats_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stats_button1ActionPerformed
        stat.setVisible(true);
                stat.pack();
                stat.setLocationRelativeTo(null);
                stat.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_stats_button1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_marks_btn;
    private javax.swing.JLabel cover_Label1;
    private javax.swing.JLabel cover_Label2;
    private javax.swing.JButton display_btn;
    private javax.swing.JPanel main_Panel;
    private javax.swing.JButton manage_button;
    private javax.swing.JButton manage_course_btn;
    private javax.swing.JButton manage_marks_btn1;
    private javax.swing.JButton new_course_btn;
    private javax.swing.JButton new_student_button;
    private javax.swing.JButton stats_button1;
    public static java.awt.Label welcome_label;
    // End of variables declaration//GEN-END:variables
}
