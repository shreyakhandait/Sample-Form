package com.org.app.form.login.service;

import com.org.app.form.login.entities.Login;

public interface ILoginService {
    Login save(Login login);

    Login update(Login login);

    Login findByUsername(String username);

    void deleteByUsername(String username);
}
