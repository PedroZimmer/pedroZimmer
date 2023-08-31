package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = java.sql.DriverManager.getConnection(url, props);
            }
            catch (java.sql.SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        System.out.println("Conectado!");
        return conn;
    }

    public static void closeConnection(){
        if(conn != null){
            try{
                conn.close();
            }
            catch(java.sql.SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    public static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("src/db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch (IOException e) {
            throw new DbException(e.getMessage());
        }

    }

    public static void closeStatement(java.sql.Statement st){
        if(st != null){
            try{
                st.close();
            }
            catch(java.sql.SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(java.sql.ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }
            catch(java.sql.SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }



}
