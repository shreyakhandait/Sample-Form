package com.org.app.form.signup.controller;

import com.org.app.form.signup.dto.CreateSignupRequest;
import com.org.app.form.signup.dto.SignupDetails;
import com.org.app.form.signup.dto.UpdateSignupRequest;
import com.org.app.form.signup.entities.Signup;
import com.org.app.form.signup.service.ISignupService;
import com.org.app.form.signup.util.SignupUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/signups")
@RestController
public class SignupController {

    @Autowired
    private ISignupService signupService;

    @Autowired
    private SignupUtil signupUtil;

    @ResponseStatus(HttpStatus.CREATED)

    @PostMapping("/add")
    public SignupDetails add(@RequestBody CreateSignupRequest requestData) {
        System.out.println("signup form created"  );
        Signup signup = new Signup(requestData.getFirstname(), requestData.getLastname(),
                requestData.getPassword(), requestData.getEmailId(), requestData.getUsername());
        signup = signupService.save(signup);
        SignupDetails details = signupUtil.toDetails(signup);
        return details;
    }

    @PutMapping("/update")
    public SignupDetails update(@RequestBody UpdateSignupRequest requestData) {
        System.out.println("signup form updated"  );
        Signup signup = new Signup(requestData.getFirstname(), requestData.getLastname(),
                requestData.getPassword(), requestData.getEmailId(), requestData.getUsername());
        signup.setId(requestData.getId());
        signup = signupService.update(signup);
        SignupDetails details = signupUtil.toDetails(signup);
        return details;
    }

    @GetMapping("get/id/{id}")
    public SignupDetails findSignup(@PathVariable("id") Long id) {
        Signup signup = signupService.findById(id);
        SignupDetails details = signupUtil.toDetails(signup);
        return details;
    }

    @DeleteMapping("delete/id/{id}")
    public String removeSignup(@PathVariable("id") Long id) {
        signupService.deleteById(id);
        String response = "removed signup with id=" + id;
        return response;
    }



}
