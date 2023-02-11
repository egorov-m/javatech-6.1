package com.example.demoweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_TYPE = "jdbc:mysql://";
    private static final String DB_HOSTNAME = "127.0.0.1:";
    private static final String DB_PORT = "3306/";
    private static final String DB_NAME = "filemanagerusersdb";
    private static final String DB_LOGIN = "root";
    private static final String DB_PASSWORD = "wq1LpHdCs?1R";

    public static Connection getConnection() {
        StringBuilder url = new StringBuilder();
            url.append(DB_TYPE)
                    .append(DB_HOSTNAME)
                    .append(DB_PORT)
                    .append(DB_NAME);
                    //.append(DB_LOGIN)
                    //.append(DB_PASSWORD);

        // try (Connection connection = DriverManager.getConnection(url.toString(), DB_LOGIN, DB_PASSWORD)) {
        //     Class.forName(DB_DRIVER);
        //     return connection;
        // } catch (ClassNotFoundException | SQLException e) {
        //     e.printStackTrace();
        // }

         try {
            Class.forName(DB_DRIVER);
            Connection connection = DriverManager.getConnection(url.toString(), DB_LOGIN, DB_PASSWORD);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
