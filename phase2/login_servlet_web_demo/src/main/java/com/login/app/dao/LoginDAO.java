package com.login.app.dao;

import com.login.app.exception.BusinessException;
import com.login.app.model.User;

public interface LoginDAO {

	public boolean isValidLoginCredentials(User user) throws BusinessException;
}
