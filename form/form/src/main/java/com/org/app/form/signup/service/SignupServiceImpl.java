package com.org.app.form.signup.service;

import com.org.app.form.exceptions.SignupNotFoundException;
import com.org.app.form.signup.dao.ISignupDao;
import com.org.app.form.signup.entities.Signup;
import com.org.app.form.signup.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;
    @Transactional
    @Service

    public class SignupServiceImpl implements ISignupService {

        @Autowired
        private ISignupDao signupDao;
        @Override
        public Signup save(Signup signup) {
            ValidationUtil.checkArgumentNotNull(signup);
            ValidationUtil.checkFirstNameNotNull(signup.getFirstName());
            ValidationUtil.checkLastNameNotNull(signup.getLastName());
            signup = signupDao.save(signup);
            return signup;
        }

        @Override
        public Signup update(Signup signup) {
            ValidationUtil.checkArgumentNotNull(signup);
            ValidationUtil.checkFirstNameNotNull(signup.getFirstName());
            ValidationUtil.checkLastNameNotNull(signup.getLastName());
            signup = signupDao.save(signup);
            return signup;
        }

        @Override
        public Signup findById(Long id) {
            Optional<Signup> optional = signupDao.findById(id);
            if(!optional.isPresent()){
                throw new SignupNotFoundException("signup not found for id = " + id);
            }
            return optional.get();
        }

        @Override
        public void deleteById(Long id) {
            signupDao.deleteById(id);
        }
    }
