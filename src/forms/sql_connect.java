package forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class sql_connect {
    static Connection con = null;
    public static Connection connect() throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:sec.db");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

}
