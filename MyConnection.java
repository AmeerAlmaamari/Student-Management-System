import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyConnection {
    
    public static Connection getConnection(){
    
    
    Connection con = null;
 
        try {
 
            String dbURL = "jdbc:sqlserver://DESKTOP-8LAE7JK;DatabaseName=StudentDB;IntegratedSecurity=true"; 
           
            con = DriverManager.getConnection(dbURL);}
    
//    try{
//         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//         String connectionString = 
//    "jdbc:sqlserver://DDESKTOP-8LAE7JK;DatabaseName=StudentDB;IntegratedSecurity=true";
//         System.out.println("IT IS WORKING");
//         
//        con = DriverManager.getConnection(connectionString);
//    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
         System.out.println("no connection");
            ex.printStackTrace();
    }
    return con;
    } 

}
