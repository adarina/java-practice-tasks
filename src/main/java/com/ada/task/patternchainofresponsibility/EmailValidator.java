package com.ada.task.patternchainofresponsibility;

import java.util.regex.Pattern;

class EmailValidator implements Validator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^(.+)@(.+)$");

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
        return EMAIL_PATTERN.matcher(user.getEmail()).matches();
    }
}
