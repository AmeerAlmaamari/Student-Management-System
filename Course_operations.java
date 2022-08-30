
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Course_operations {
    
    public void operations(int operation, Integer id, String course_name, Integer hours_number){
    
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    // 1 : insert
    // 2 : update
    // 3 : delete
    if(operation == 1){
    
        try {
            ps = con.prepareStatement("INSERT INTO [dbo].[course]([course_name],[course_hours]) VALUES (?,?)");
            ps.setString(1, course_name);
            ps.setInt(2, hours_number);
            
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,course_name+" has been added !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    if(operation == 2){
    
        try {
            ps = con.prepareStatement("UPDATE [dbo].[course] SET course_name = ?, course_hours = ? WHERE course_id = ?");
            ps.setString(1, course_name);
            ps.setInt(2, hours_number);
            ps.setInt(3, id);
            
            if(ps.executeUpdate() > 0){
//                JOptionPane.showMessageDialog(null,course_name+" has been updated !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    if(operation == 3){
        
        int delete_op = JOptionPane.showConfirmDialog(null,"The marks of this student will be also deleted","Delete Marks", JOptionPane.OK_CANCEL_OPTION,0);
       
       if(delete_op == JOptionPane.OK_OPTION){
    
        try {
            ps = con.prepareStatement("DELETE FROM [dbo].[course] WHERE course_id = ?");
            ps.setInt(1, id);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"has been Deleted !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
}
   public boolean course_existed(String courseName){
       
       boolean existed = false;
       Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM course WHERE [course_name] = ?");
            ps.setString(1,courseName);
            
            ResultSet rs = ps.executeQuery();
           
            if(rs.next()){
                
                existed = true;
            } 
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
   return existed;
   
   } 
   
   public void fill_course_table(JTable table){
    
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM course");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
            row = new Object[3];
            row[0] = rs.getInt(1);
            row[1] = rs.getString(2);
            row[2] = rs.getInt(3);

            
            model.addRow(row);
 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public int get_course_id(String course_name){
   
   int course_id = 0;
   
   Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM course WHERE [course_name] = ?");
            ps.setString(1,course_name);
            
            ResultSet rs = ps.executeQuery();
           
            if(rs.next()){
                
                course_id = rs.getInt("course_id");
            } 
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   return course_id;
   
   }
   
   public void fill_course_box(JComboBox course_box){
    
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM course");
            
            ResultSet rs = ps.executeQuery();
         
            while(rs.next()){
          
                course_box.addItem(rs.getString(2));
            
           
 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
   }

