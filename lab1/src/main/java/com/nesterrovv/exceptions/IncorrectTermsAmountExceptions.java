package com.nesterrovv.exceptions;

public class IncorrectTermsAmountExceptions extends Exception {

    @Override
    public String getMessage() {
        return "Incorrect terms amount! It should be positive.";
    }
}
