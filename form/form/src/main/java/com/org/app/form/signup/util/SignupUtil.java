package com.org.app.form.signup.util;

import com.org.app.form.signup.dto.SignupDetails;
import com.org.app.form.signup.entities.Signup;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class SignupUtil {

    public List<SignupDetails> toDetails(Collection<Signup> signups){
        List<SignupDetails> desired = new ArrayList<>();
        for(Signup signup : signups){
            SignupDetails details = toDetails(signup);
            desired.add(details);
        }
        return desired;
    }

    public SignupDetails toDetails(Signup signup) {
        SignupDetails details = new SignupDetails(signup.getId(), signup.getFirstName(), signup.getLastName(),
                signup.getPassword(), signup.getUsername(), signup.getEmailId());
        return details;

    }
}
