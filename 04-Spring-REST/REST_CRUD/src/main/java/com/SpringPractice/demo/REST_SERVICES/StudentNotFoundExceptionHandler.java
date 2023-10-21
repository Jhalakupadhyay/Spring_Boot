package com.SpringPractice.demo.REST_SERVICES;

public class StudentNotFoundExceptionHandler extends RuntimeException
{
    public StudentNotFoundExceptionHandler(String message) {
        super(message);
    }

    public StudentNotFoundExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExceptionHandler(Throwable cause) {
        super(cause);
    }
}
