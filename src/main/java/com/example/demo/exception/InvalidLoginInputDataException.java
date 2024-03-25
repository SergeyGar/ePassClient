package com.example.demo.exception;

public class InvalidLoginInputDataException extends RuntimeException{

    public InvalidLoginInputDataException(String message){
        super(message);
    }

}
