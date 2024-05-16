package com.ada.task.patternchainofresponsibility;

import java.util.regex.Pattern;

class NameValidator implements Validator {

    private static final Pattern NAME_PATTERN = Pattern.compile("[A-Za-z]+");

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
        return NAME_PATTERN.matcher(user.getName()).matches();
    }
}
