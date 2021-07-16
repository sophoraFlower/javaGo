package com.example.webdemo13.demo;;

import java.sql.SQLException;
import java.util.Date;

import com.example.webdemo12.User;

public class DBUtilsDaoTest1 {
	private static DBUtilsDao dao = new DBUtilsDao();
	public static void testInsert() throws SQLException {
		User user = new User();
		user.setId(7);
		user.setName("zhaoliu");
		user.setPassword("666666");
		user.setBirthday(new Date());
		boolean b = dao.insert(user);
		System.out.println(b);
	}
	public static void main(String[] args) throws SQLException {
		testInsert();
	}
}
