package com.ada.task.patternchainofresponsibility;

import java.util.regex.Pattern;

class SurnameValidator implements Validator {
    private static final Pattern SURNAME_PATTERN = Pattern.compile("[A-Za-z]+");

    private Validator nextValidator;

    @Override
    public void validateNext(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public Validator getNextValidator() {
        return nextValidator;
    }

    @Override
    public boolean validate(User user) {
        return SURNAME_PATTERN.matcher(user.getSurname()).matches();
    }
}