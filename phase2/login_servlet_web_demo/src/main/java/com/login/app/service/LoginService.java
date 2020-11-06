package com.login.app.service;

import com.login.app.exception.BusinessException;
import com.login.app.model.User;

public interface LoginService {

	public boolean isValidLoginCredentials(User user) throws BusinessException;
}
