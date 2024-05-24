package Aula274;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection(); // get the connection

            conn.setAutoCommit(false); // set the auto commit to false

            st = conn.createStatement(); // create the statement

            int rows1 = st.executeUpdate( // execute the statement
                    "UPDATE seller " +
                    "SET BaseSalary = 2090 " +
                    "WHERE " +
                    "DepartmentId = 1");

            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Fake error");
//            }

            int rows2 = st.executeUpdate( // execute the statement
                    "UPDATE seller " +
                    "SET BaseSalary = 3090 " +
                    "WHERE " +
                    "DepartmentId = 2");

            conn.commit(); // commit the changes



            System.out.println("Done! Rows affected: " + rows1);
            System.out.println("Done! Rows affected: " + rows2);


        } catch (SQLException e) {
            try {
                conn.rollback(); // rollback the changes
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + e.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}