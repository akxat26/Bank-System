
import java.sql.*;

import javax.swing.JOptionPane;
public class conn {
    Connection c;
    Statement  s;
    public conn(){
    
        try{
            c= DriverManager.getConnection("jdbc:mysql:/// bankingmanagementsystem", "root", "1812");
            s= c.createStatement();
        }
         catch(Exception e)
         {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"check your details");
              
        }
    }
}
