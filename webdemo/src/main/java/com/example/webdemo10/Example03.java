package com.example.webdemo10;

import java.sql.*;

public class Example03 {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "2021@Tokyo";
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql = "select * from users";
            stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("id  |  name  | password  |  birthday");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String psw = rs.getString("password");
                Date birthday = rs.getDate("birthday");
                System.out.println(id + "  |   " + name + "  |  " + password + "  |  " + birthday);
            }
            System.out.println("第2条数据的name值：");
            rs.absolute(2);
            System.out.println(rs.getString("name"));
            rs.beforeFirst();
            rs.next();
            System.out.println(rs.getString("name"));
            rs.afterLast();
            rs.previous();
            System.out.println(rs.getString("name"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
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
