package com.org.app.form.signup.service;

import com.org.app.form.signup.entities.Signup;

public interface ISignupService {
    Signup save(Signup signup);

    Signup update(Signup signup);

    Signup findById(Long id);

    void deleteById(Long id);
}
