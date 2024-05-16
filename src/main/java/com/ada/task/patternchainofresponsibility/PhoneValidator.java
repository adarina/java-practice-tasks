package com.ada.task.patternchainofresponsibility;

import java.util.regex.Pattern;

class PhoneValidator implements Validator {
    private static final Pattern PHONE_PATTERN = Pattern.compile("\\d{9}");

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
        return PHONE_PATTERN.matcher(user.getPhone()).matches();
    }
}
