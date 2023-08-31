package Aula273;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DB;
import db.DbIntegrityException;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection(); // get the connection

            st = conn.prepareStatement( // prepare the statement
                            "DELETE FROM department " +
                            "WHERE " +
                            "Id = ?");

            st.setInt(1, 2); // set the first placeholder


            int rowsAffected = st.executeUpdate(); // execute the statement

            System.out.println("Done! Rows affected: " + rowsAffected);

            System.out.println("Done! Rows affected: " + st.getUpdateCount());
        }
        catch (Exception e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }



    }
}
