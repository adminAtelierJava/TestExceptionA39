package ExceptionChecked.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
      try {
          FileWriter f = new FileWriter("f");
      }catch (IOException e)
      {
          System.out.println("test");
          System.out.println(e);
          e.printStackTrace();
      }
try {
    Connection con = DriverManager.
            getConnection("", "",
            "");
}catch (SQLException ex)
        {
            System.out.println(ex);
        }
   try {
       connect();
   }
    catch (SQLException e)
    {
        System.out.println(e);
    }
    }




    public static void connect() throws SQLException
    {
        Connection con = DriverManager.
                getConnection("", "",
                        "");
    }
}
