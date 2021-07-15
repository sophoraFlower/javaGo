package com.example.webdemo11;
import com.example.webdemo11.dao.UsersDao;
import com.example.webdemo11.domain.User;

public class FindUserByIdTest {
	public static void main(String[] args) {
		UsersDao usersDao = new UsersDao();
		User user = usersDao.find(1);
		System.out.println("id为1的User对象的name值为：" + user.getUsername());
	}
}
