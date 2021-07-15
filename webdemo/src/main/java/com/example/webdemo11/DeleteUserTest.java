package com.example.webdemo11;
import com.example.webdemo11.dao.UsersDao;

public class DeleteUserTest{
public static void main(String[] args) {
	// 删除操作
	UsersDao usersDao = new UsersDao();
	boolean b = usersDao.delete(4);
	System.out.println(b);
}
}
