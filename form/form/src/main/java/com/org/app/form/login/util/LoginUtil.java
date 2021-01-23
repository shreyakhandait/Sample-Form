package com.org.app.form.login.util;

import com.org.app.form.login.dto.LoginDetails;
import com.org.app.form.login.entities.Login;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class LoginUtil {
    public List<LoginDetails> toDetails(Collection<Login> logins){
        List<LoginDetails> desired = new ArrayList<>();
        for(Login login : logins){
            LoginDetails details = toDetails(login);
            desired.add(details);
        }
        return desired;
    }

    public static LoginDetails toDetails(Login login) {
        LoginDetails details = new LoginDetails(login.getId(), login.getUsername(), login.getPassword());
        return details;

    }

}
