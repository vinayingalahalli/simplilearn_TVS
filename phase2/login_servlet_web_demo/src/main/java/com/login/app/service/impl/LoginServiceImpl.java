package com.login.app.service.impl;

import com.login.app.dao.LoginDAO;
import com.login.app.dao.impl.LoginDAOImpl;
import com.login.app.exception.BusinessException;
import com.login.app.model.User;
import com.login.app.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDAO=new LoginDAOImpl();
	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b = false;
		if (user != null && user.getUsername() != null && user.getPassword() != null
				&& user.getUsername().matches("[a-zA-Z]{3,10}_[a-zA-Z]{3,12}")
				&& user.getPassword().matches("[a-z]{3,6}[@#]{1}[0-9]{3,4}")) {
			//write the code here for DAO
			b=loginDAO.isValidLoginCredentials(user);
		}else {
			throw new BusinessException("Invalid Username/Password... Kindly Re-Enter");
		}
		return b;
	}

}
