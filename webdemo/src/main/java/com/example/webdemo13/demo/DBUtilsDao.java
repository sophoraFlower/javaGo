package com.example.webdemo13.demo;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.example.webdemo12.User;
import com.example.webdemo13.utils.C3p0Utils;

public class DBUtilsDao {
	// 查询所有，返回List集合
	public List findAll() throws SQLException {
		// 创建QueryRunner对象
		QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
		// 写SQL语句
		String sql = "select * from users";
		// 调用方法
		List list = (List) runner.query(sql,
                     new BeanListHandler(User.class));
		return list;
	}
	// 查询单个，返回对象
	public User find(int id) throws SQLException {
		// 创建QueryRunner对象
		QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
		// 写SQL语句
		String sql = "select * from users where id=?";
		// 调用方法
		User user = (User) runner.query(sql, 
                 new BeanHandler(User.class), new Object[] { id });
		return user;
	}
	// 添加用户的操作
	public Boolean insert(User user) throws SQLException {
		// 创建QueryRunner对象
		QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
		// 写SQL语句
		String sql = "insert into users (id,name,password,birthday) values (?,?,?,?)";
		// 调用方法
		int num = runner.update(sql,
				new Object[] { user.getId(),user.getName(), user.getPassword(), user.getBirthday()});
		if (num > 0)
			return true;
		return false;
	}
	// 修改用户的操作
	public Boolean update(User user) throws SQLException {
		// 创建QueryRunner对象
		QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
		// 写SQL语句
		String sql = "update  user set name=?,password=?,birthday=? where id=?";
		// 调用方法
		int num = runner.update(sql, new Object[] { user.getName(),
                     user.getPassword(),user.getBirthday() });
		if (num > 0)
			return true;
		return false;
	}
	// 删除用户的操作
	public Boolean delete(int id) throws SQLException {
		// 创建QueryRunner对象
		QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
		// 写SQL语句
		String sql = "delete from users where id=?";
		// 调用方法
		int num = runner.update(sql, id);
		if (num > 0)
			return true;
		return false;
	}
}
