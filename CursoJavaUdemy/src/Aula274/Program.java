package Aula274;

import db.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection(); // get the connection
            st = conn.createStatement(); // create the statement

            int rows1 = st.executeUpdate( // execute the statement
                    "UPDATE seller " +
                    "SET BaseSalary = 2090 " +
                    "WHERE " +
                    "DepartmentId = 1");

            int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error");
            }

            int rows2 = st.executeUpdate( // execute the statement
                    "UPDATE seller " +
                    "SET BaseSalary = 3090 " +
                    "WHERE " +
                    "DepartmentId = 2");



            System.out.println("Done! Rows affected: " + rows1);
            System.out.println("Done! Rows affected: " + rows2);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}