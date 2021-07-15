package com.example.webdemo10;

import java.sql.*;

public class Example02 {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement preStmt = null;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "******";
            conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO users(name,password,birthday) VALUES(?,?,?)";
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, "tonny");
            preStmt.setString(2, "123456");
            preStmt.setString(3, "1992-02-28");
            preStmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (preStmt != null) {
                try {
                    preStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                preStmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }

}
