package bank.management.system;

import java.sql.*;

public class Connections {

    Connection connection;

    Statement statement;

    public Connections(){


        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Arpittak@02");

            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
