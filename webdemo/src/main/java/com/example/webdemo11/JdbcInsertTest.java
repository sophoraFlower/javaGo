package com.example.webdemo11;
import java.util.Date;
import com.example.webdemo11.dao.UsersDao;
import com.example.webdemo11.domain.User;

public class JdbcInsertTest{
	public static void main(String[] args) {
         // 向users表插入一个用户信息
		UsersDao ud = new UsersDao();
		User user=new User();
			user.setId(6);
			user.setUsername("hl");
			user.setPassword("123");
			user.setBirthday(new Date());
			boolean b=ud.insert(user);
			System.out.println(b);
		}
}
