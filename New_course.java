
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
public class New_course extends javax.swing.JFrame {

  Course_operations co = new Course_operations();
    public New_course() {
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
        jPanel1 = new javax.swing.JPanel();
        main_Panel1 = new javax.swing.JPanel();
        cover_Label3 = new javax.swing.JLabel();
        cover_Label4 = new javax.swing.JLabel();
        course_name_lbl = new javax.swing.JLabel();
        course_name_field = new javax.swing.JTextField();
        course_hours_lbl = new javax.swing.JLabel();
        course_spinner = new javax.swing.JSpinner();
        add_course_btn = new javax.swing.JButton();
        course_close_btn = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_Panel1.setBackground(new java.awt.Color(64, 191, 216));

        cover_Label3.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        cover_Label3.setForeground(new java.awt.Color(240, 240, 240));
        cover_Label3.setText("Course");

        cover_Label4.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        cover_Label4.setForeground(new java.awt.Color(240, 240, 240));
        cover_Label4.setText("ADD");

        javax.swing.GroupLayout main_Panel1Layout = new javax.swing.GroupLayout(main_Panel1);
        main_Panel1.setLayout(main_Panel1Layout);
        main_Panel1Layout.setHorizontalGroup(
            main_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_Panel1Layout.createSequentialGroup()
                .addGroup(main_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_Panel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(cover_Label4))
                    .addGroup(main_Panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cover_Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        main_Panel1Layout.setVerticalGroup(
            main_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_Panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cover_Label4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cover_Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        add_course_btn.setBackground(new java.awt.Color(64, 191, 216));
        add_course_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add_course_btn.setText("Add Course");
        add_course_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_course_btnActionPerformed(evt);
            }
        });

        course_close_btn.setBackground(new java.awt.Color(64, 191, 216));
        course_close_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        course_close_btn.setText("Close");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(main_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(course_name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(course_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(course_hours_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(course_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(add_course_btn)
                        .addGap(18, 18, 18)
                        .addComponent(course_close_btn)))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_hours_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_course_btn)
                    .addComponent(course_close_btn))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void add_course_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_course_btnActionPerformed
      String course_name = course_name_field.getText();
      if(!co.course_existed(course_name_field.getText())){
        
        int hours = Integer.valueOf(course_spinner.getValue().toString());
        co.operations(1,null, course_name, hours);
        Manage_course.course_table.setModel(new DefaultTableModel(null,new Object[]{"Course ID","Course Name","Course hours"}));
        co.fill_course_table(Manage_course.course_table);
        
        Stats.n_courses.setText(Integer.toString(MyFunction.data_count("course")));
      }
      else{
          JOptionPane.showMessageDialog(null,course_name+" is already existed ","Course Existed",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_add_course_btnActionPerformed
    
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
            java.util.logging.Logger.getLogger(New_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_course_btn;
    private javax.swing.JButton course_close_btn;
    private javax.swing.JLabel course_hours_lbl;
    private javax.swing.JTextField course_name_field;
    private javax.swing.JLabel course_name_lbl;
    private javax.swing.JSpinner course_spinner;
    private javax.swing.JLabel cover_Label1;
    private javax.swing.JLabel cover_Label2;
    private javax.swing.JLabel cover_Label3;
    private javax.swing.JLabel cover_Label4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main_Panel;
    private javax.swing.JPanel main_Panel1;
    // End of variables declaration//GEN-END:variables
}