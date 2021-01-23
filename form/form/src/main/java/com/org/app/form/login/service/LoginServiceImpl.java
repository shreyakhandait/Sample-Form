package com.org.app.form.login.service;

import com.org.app.form.exceptions.LoginNotFoundException;
import com.org.app.form.exceptions.SignupNotFoundException;
import com.org.app.form.login.dao.ILoginDao;
import com.org.app.form.login.entities.Login;
import com.org.app.form.signup.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class LoginServiceImpl implements ILoginService{

    @Autowired
    private ILoginDao loginDao;

    @Override
    public Login save(Login login) {
        ValidationUtil.checkArgumentNotNull(login);
        ValidationUtil.checkUsernameNameNotNull(login.getUsername());
        ValidationUtil.checkPasswordNotNull(login.getPassword());
        login = loginDao.save(login);
        return login;
    }

    @Override
    public Login update(Login login) {
        ValidationUtil.checkArgumentNotNull(login);
        ValidationUtil.checkUsernameNameNotNull(login.getUsername());
        ValidationUtil.checkPasswordNotNull(login.getPassword());
        login = loginDao.save(login);
        return login;
    }

    @Override
    public Login findByUsername(String username) {
        Optional<Login> optional = loginDao.findByUsername(username);
        if(!optional.isPresent()){
            throw new SignupNotFoundException("login not found for username = " + username);
        }
        return optional.get();
    }

    @Override
    public void deleteByUsername(String username) {
        loginDao.deleteByUsername(username);
    }
}
