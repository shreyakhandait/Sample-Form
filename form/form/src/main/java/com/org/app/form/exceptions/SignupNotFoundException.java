package com.org.app.form.exceptions;

public class SignupNotFoundException extends RuntimeException{

    public SignupNotFoundException(){

    }

    public SignupNotFoundException(String msg){
        super(msg);
    }
}
