//package bank.management.system;
//
//import java.sql.PreparedStatement;
//
//public class Connn {
//    public PreparedStatement statement;
//}
package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","ranjan");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}