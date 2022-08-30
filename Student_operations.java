
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Student_operations {
    
    //add, update, delete operations
    public void operations(int operation, Integer id, String f_name, String l_name,
                           String gender, String phone){
    
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    // 1 : insert
    // 2 : update
    // 3 : delete
    if(operation == 1){
    
        try {
            ps = con.prepareStatement("INSERT INTO [dbo].[student]([first_name],[last_name],[gender],[phone])VALUES (?,?,?,?)");
            ps.setString(1, f_name);
            ps.setString(2, l_name);
            ps.setString(3, gender);
            ps.setString(4, phone);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,f_name+" "+l_name+ " has been added !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    if(operation == 2){
    
        try {
            ps = con.prepareStatement("UPDATE [dbo].[student] SET first_name = ?, last_name = ?, gender = ?, phone = ? WHERE student_id = ?");
            ps.setString(1, f_name);
            ps.setString(2, l_name);
            ps.setString(3, gender);
            ps.setString(4, phone);
            ps.setInt(5, id);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Student has been updated !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    if(operation == 3){
    
       int delete_op = JOptionPane.showConfirmDialog(null,"The marks of this student will be also deleted","Delete", JOptionPane.OK_CANCEL_OPTION,0);
       
       if(delete_op == JOptionPane.OK_OPTION){
           
           try {
            ps = con.prepareStatement("DELETE FROM [dbo].[student] WHERE student_id = ?");
            ps.setInt(1, id);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Student has been Deleted !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       }
        
        
    }
    
}
    
    public void fill_stu_table(JTable table, String search_value){
    
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM student WHERE CONCAT(student_id,first_name,last_name,gender,phone)LIKE ?");
            ps.setString(1,"%"+search_value+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
            row = new Object[5];
            row[0] = rs.getInt(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getString(5);
            
            model.addRow(row);
 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}