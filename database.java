import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * @author www.codejava.net
 *
 */
public class database {
 
    public static void main(String[] args) {
 
        Connection conn = null;
 
        try {
 
            String dbURL = "jdbc:sqlserver://DESKTOP-8LAE7JK;DatabaseName=StudentDB;IntegratedSecurity=true"; 
           
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}