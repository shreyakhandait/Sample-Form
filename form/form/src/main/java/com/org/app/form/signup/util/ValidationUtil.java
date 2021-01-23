package com.org.app.form.signup.util;

import com.org.app.form.exceptions.InvalidArgumentException;
import com.org.app.form.signup.entities.Signup;

public class ValidationUtil {

	public static void checkArgumentNotNull(Signup signup) {
		if (signup == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkFirstNameNotNull(String firstName) {
		if (firstName == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkLastNameNotNull(String lastName) {
		if (lastName == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkArgumentNotNull(com.org.app.form.login.entities.Login login) {
		if (login == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}


	public static void checkUsernameNameNotNull(String username) {
		if (username == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkPasswordNotNull(String password) {
		if (password == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}
}
