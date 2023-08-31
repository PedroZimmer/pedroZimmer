package Aula271;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import db.DB;


public class Program {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection(); // get the connection
            st = conn.prepareStatement( // prepare the statement
                    "INSERT INTO seller " +
                        "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                        "VALUES " +
                        "(?, ?, ?, ?, ?)", // ? is a placeholder
                        Statement.RETURN_GENERATED_KEYS); // Statement.RETURN_GENERATED_KEYS is a constant that tells the database to return the generated keys
            st.setString(1, "Pedro Gameplays");
            st.setString(2, "pedrinhogameplays@email.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys(); // getGeneratedKeys() returns a ResultSet
                while (rs.next()) { // ResultSet is an iterator
                    int id = rs.getInt(1); // get the first column of the ResultSet
                    System.out.println("Done! Id = " + id); // print the id
                }
            }
            else { // if no rows were affected, print this
                System.out.println("No rows affected!"); // if no rows were affected, print this
            }


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
