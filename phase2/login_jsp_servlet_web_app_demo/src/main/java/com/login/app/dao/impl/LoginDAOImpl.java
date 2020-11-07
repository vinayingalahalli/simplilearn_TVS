package com.login.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.app.dao.LoginDAO;
import com.login.app.dbutil.MySqlConnection;
import com.login.app.exception.BusinessException;
import com.login.app.model.User;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b=false;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="Select username from login_master where username=? and password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("No User matching with the entered username and password");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//take this off when going live
			throw new BusinessException("Internal error occured kindly contact SYSADMIN");
		}
		return b;
	}

}
