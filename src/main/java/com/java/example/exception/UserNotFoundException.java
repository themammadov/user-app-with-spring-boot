package com.java.example.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String arg0) {
        super(arg0);
    }
}
