package Aula268_teste;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection conn = db.DB.getConnection();
        db.DB.closeConnection();


    }
}
