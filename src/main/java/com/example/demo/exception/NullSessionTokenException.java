package com.example.demo.exception;

public class NullSessionTokenException extends RuntimeException{

    public NullSessionTokenException(String message){
        super(message);
    }
}
