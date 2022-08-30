
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyFunction {
    
    public static int data_count(String table_name){
    Connection con = MyConnection.getConnection();
    int total = 0;
        try {
            Statement stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT COUNT (*) AS 'total' FROM "+"["+table_name+"]");
            
            while(rs.next()){
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
}
