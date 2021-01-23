package com.org.app.form.signup.dao;

import com.org.app.form.signup.entities.Signup;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ISignupDao extends JpaRepository<Signup, Long> {

}