package Bank.Management.System;

import java.sql.*;

public class Con {
    Connection connection;          //for connecting database
    Statement statement;

    public Con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","1654");
            statement = connection.createStatement();
            //above two lines r for connecting the project with mysql



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
