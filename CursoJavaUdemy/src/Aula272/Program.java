package Aula272;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DB;
public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection(); // get the connection

            st = conn.prepareStatement( // prepare the statement
                    "UPDATE seller " +
                        "SET BaseSalary = BaseSalary + ? " + // ? is a placeholder, the + ? is a concatenation
                        "WHERE " +
                        "(DepartmentId = ?)");
            st.setDouble(1, 200.0); // set the first placeholder
            st.setInt(2, 2); // set the second placeholder


            int rowsAffected = st.executeUpdate(); // execute the statement

            System.out.println("Done! Rows affected: " + rowsAffected);

            System.out.println("Done! Rows affected: " + st.getUpdateCount());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }



    }
}
