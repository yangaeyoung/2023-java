package com.green.day24;

import javax.management.remote.JMXConnectorServer;
import java.sql.*;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            System.out.println("에러 발생!!!");
            e.printStackTrace();
        }
        System.out.println("접속 성공!!");
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps) {
        if (ps != null) {//열어준 것과 달리 close로 할 때는 먼저 열어 준 것부터 닫아줘야 함
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn, ps);
    }
}