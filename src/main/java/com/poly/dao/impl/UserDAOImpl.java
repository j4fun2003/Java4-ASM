package com.poly.dao.impl;

import java.util.List;
import java.util.Map;

import com.poly.constant.NamedStored;
import com.poly.dao.AbstractDAO;
import com.poly.dao.UserDAO;
import com.poly.entity.User;

public class UserDAOImpl extends AbstractDAO<User> implements UserDAO{

	@Override
	public User findByID(Integer id) {
		return super.findById(User.class, id);
	}

	@Override
	public User findByEmail(String email) {
		String sql = "SELECT o FROM User o WHERE o.email = ?0";
		return super.findOne(User.class, sql, email);
	}

	@Override
	public User findByUsername(String username) {
		String sql = "SELECT o FROM User o WHERE o.username = ?0";
		return super.findOne(User.class, sql, username);
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		String sql = "SELECT o FROM User o WHERE o.username = ?0 AND o.password = ?1";
		return super.findOne(User.class, sql, username,password);
	}

	@Override
	public List<User> findAll() {
		return super.findAll(User.class, true);
	}

	@Override
	public User create(User entity) {
		// TODO Auto-generated method stub
		return super.create(entity);
	}

	@Override
	public User update(User entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public User delete(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return super.findAll(User.class, true, pageNumber, pageSize);
	}

	@Override
	public List<User> findUsersLikeByVideoHref(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return super.callStored(NamedStored.STORED_FIND_USER_LIKE_VIDEO_HREF, params);
	}

}
