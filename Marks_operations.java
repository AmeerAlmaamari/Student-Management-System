
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Marks_operations {
    
    public void operations(int operation, Integer student_id, Integer course_id, Integer marks){
    
    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    // 1 : insert
    // 2 : update
    // 3 : delete
    if(operation == 1){
    
        try {
            ps = con.prepareStatement("INSERT INTO [dbo].[marks]([stu_id],[crs_id],[marks]) VALUES (?,?,?)");
            ps.setInt(1, student_id);
            ps.setInt(2, course_id);
            ps.setInt(3, marks);
           
            
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Marks has been added !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Marks_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    if(operation == 2){
    
        try {
            ps = con.prepareStatement("UPDATE [dbo].[marks] SET marks = ? WHERE stu_id = ? AND crs_id = ?");
            ps.setInt(1, marks);
            ps.setInt(2, student_id);
            ps.setInt(3, course_id);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Marks has been updated !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Marks_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    if(operation == 3){
    
        try {
            ps = con.prepareStatement("DELETE FROM [dbo].[marks] WHERE stu_id = ? AND crs_id = ? ");
            ps.setInt(1, student_id);
            ps.setInt(2, course_id);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Marks has been Deleted !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Marks_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
    public void fill_marks_table(JTable table){
    
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM marks");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
            row = new Object[3];
            row[0] = rs.getInt(1);
            row[1] = rs.getInt(2);
            row[2] = rs.getInt(3);

            
            model.addRow(row);
 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Marks_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fill_show_table(JTable table){
    
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT student_id, first_name, last_name, course_name, marks\n" +
"  FROM [marks] INNER JOIN [student] as stab on stab.student_id = stu_id \n" +
"  INNER JOIN [course] as ctab on ctab.course_id = crs_id");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            
            while(rs.next()){
            row = new Object[5];
            row[0] = rs.getInt(1); //stu id
            row[1] = rs.getString(2); // fst name
            row[2] = rs.getString(3); // lst name
            row[3] = rs.getString(4); // crs name
            row[4] = rs.getInt(5); // marks

            
            model.addRow(row);
 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

