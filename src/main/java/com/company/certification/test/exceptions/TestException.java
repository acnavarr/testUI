package com.company.certification.test.exceptions;

public class TestException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TestException(Exception e) {
        super(e);
    }

}
