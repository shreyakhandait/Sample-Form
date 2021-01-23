package com.org.app.form.login.controller;

import com.org.app.form.login.dto.CreateLoginRequest;
import com.org.app.form.login.dto.LoginDetails;
import com.org.app.form.login.dto.UpdateLoginRequest;
import com.org.app.form.login.entities.Login;
import com.org.app.form.login.service.ILoginService;
import com.org.app.form.login.service.LoginServiceImpl;
import com.org.app.form.login.util.LoginUtil;
import com.org.app.form.signup.dto.SignupDetails;
import com.org.app.form.signup.entities.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/logins")
@RestController

public class LoginController {

    @Autowired
    private LoginUtil loginUtil;

    @Autowired
    private LoginServiceImpl loginService;

    @ResponseStatus(HttpStatus.CREATED)

    @PostMapping("/add")
    public LoginDetails add(@RequestBody CreateLoginRequest requestData) {
        System.out.println("login form created"  );
        Login login = new Login(requestData.getUsername(),requestData.getPassword());
        login = loginService.save(login);
        LoginDetails details = LoginUtil.toDetails(login);
        return details;
    }


    @PutMapping("/update")
    public LoginDetails update(@RequestBody UpdateLoginRequest requestData) {
        System.out.println("signup form updated"  );
        Login login = new Login(requestData.getUsername(),requestData.getPassword());
        login.setId(requestData.getId());
        login = loginService.update(login);
        LoginDetails details = loginUtil.toDetails(login);
        return details;
    }

    @GetMapping("get/username/{username}")
    public LoginDetails findLogin(@PathVariable("username") String username) {
        Login login = loginService.findByUsername(username);
        LoginDetails details = loginUtil.toDetails(login);
        return details;
    }
    @DeleteMapping("delete/username/{username}")
    public String removeLogin(@PathVariable("username") String username) {
        loginService.deleteByUsername(username);
        String response = "removed login with username=" + username;
        return response;
    }

}
